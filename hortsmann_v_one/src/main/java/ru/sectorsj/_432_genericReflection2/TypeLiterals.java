package ru.sectorsj._432_genericReflection2;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class TypeLiterals {
    public static class Sample{
        ArrayList<Integer> nums;
        ArrayList<Character> chars;
        ArrayList<String> strings;

        public Sample() {
            nums = new ArrayList<>();
            nums.add(42);
            nums.add(1729);
            chars = new ArrayList<>();
            chars.add('H');
            chars.add('i');
            strings = new ArrayList<>();
            strings.add("Hello");
            strings.add("world");
        }
    }
    private static <T> String join(String separator, ArrayList<T> elements) {
        var result = new StringBuilder();
        for (T e : elements) {
            if (result.length() > 0) {
                result.append(separator);
            }
            result.append(e.toString());
        }
        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        var formatter = new Formatter();
        formatter.forType(new TypeLiteral<ArrayList<Integer>>(){},
                lst -> join(" ", lst));
        formatter.forType(new TypeLiteral<ArrayList<Character>>() {},
                lst -> "\"" + join("", lst) + "\"");
        System.out.println(formatter.formatFields(new Sample()));
    }
}

/**
 Литерал типа описывает тип, который может быть
 обобщенным, например, ArrayList<String>.
 */
class TypeLiteral<T> {
    private Type type;
    /*
        Этот конструктор должен вызываться из анонимного
        подкласса как в операции new TypeLiteral< ... >(){}
    */

    public TypeLiteral() {
        Type parentType = getClass().getGenericSuperclass();
        if (parentType instanceof ParameterizedType paramType) {
            type = paramType.getActualTypeArguments()[0];
        } else {
            throw new UnsupportedOperationException("Construct as new TypeLiteral<...>(){}");
        }
    }

    private TypeLiteral(Type type) {
        this.type = type;
    }

    /**
     Выдает литерал типа, описывающий заданный тип
     * @param type
     * @return
     */
    public static TypeLiteral<?> of(Type type) {
        return new TypeLiteral<Object>(type);
    }

    public String toString() {
        if (type instanceof Class clazz){
            return clazz.getName();
        } else {
            return type.toString();
        }
    }

    public boolean equals(Object otherObject) {
        return otherObject instanceof TypeLiteral otherLiteral && type.equals(otherLiteral.type);
    }

    public int hashCode() {
        return type.hashCode();
    }
}

/**
 Форматирует объекты по правилам, связывающим типы с функциями форматирования
 */
class Formatter {
    private Map<TypeLiteral<?>, Function<?, String>> rules = new HashMap<>();

    /**
     Присоединяет правило форматирования к данному средству форматирования
     * @param type Тип к которому применяется данное правило
     * @param formatterForType  Функция, форматирующая объекты данного типа
     * @param <T>
     */
    public <T> void forType(TypeLiteral<T> type, Function<T, String> formatterForType) {
        rules.put(type, formatterForType);
    }

    /**
     Форматирует все поля объекта по правилам
     данного средства форматирования
     * @param obj Объект
     * @return  Возвращает символьную строку с именами всех полей и отформатированными значениями
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public String formatFields(Object obj) throws IllegalArgumentException, IllegalAccessException {
        var result = new StringBuilder();
        for (Field f : obj.getClass().getDeclaredFields()) {
            result.append(f.getName());
            result.append(" = ");
            f.setAccessible(true);
            Function<?, String> formatterForType = rules.get(TypeLiteral.of(f.getGenericType()));
            if (formatterForType != null) {

                // Параметр formatterForType имеет тип ?,
                // поэтому его методу apply() ничего не передается.
                // Тип параметра приводится к типу Object,
                // чтобы можно было вызвать данный метод
                @SuppressWarnings("unchecked")
                Function<Object, String> objectFormatter = (Function<Object, String>) formatterForType;
                result.append(objectFormatter.apply(f.get(obj)));
            } else {
                result.append(f.get(obj).toString());
            }
            result.append("\n");
        }
        return result.toString();
    }
}
