package ru.sectorsj.java_for_biginners._11_exceptions._417_using_checked_exception_demo;

class UsingCheckedExceptionDemo {

    static void alpha(int n) throws Exception {
        String txt = "Метод alpha() с аргументом " + n;
        throw new Exception(txt);
    }

    static void bravo(int n) {
        String txt = "Метод bravo() с аргументом " + n;

        try {
            if (n > 0) {
                throw new Exception(txt);
            }
            else {
                throw new RuntimeException(txt);
            }
        } catch (RuntimeException e) {
            throw e;
        }

        catch (Exception e) {
            System.out.println("Обработка ошибки в bravo(): ");
            System.out.println(e.getMessage());
            System.out.println("***** ***** ***** ***** *****");
            System.out.println();
        }
    }

    static void catchMe(Exception e) {
        System.out.println("Обработка ошибки в main(): ");
        System.out.println(e.getMessage());
        System.out.println("----- ----- ----- ----- -----");
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            alpha(123);
        } catch (Exception e) {
            catchMe(e);
        }

        try {
            bravo(123);
        } catch (Exception e) {
            catchMe(e);
        }

        try {
            bravo(-1);
        } catch (Exception e) {
            catchMe(e);
        }
    }
}
