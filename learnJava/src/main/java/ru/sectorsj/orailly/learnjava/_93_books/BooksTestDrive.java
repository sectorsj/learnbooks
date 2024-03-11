package ru.sectorsj.orailly.learnjava._93_books;

public class BooksTestDrive {

    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов по Java";

        myBooks[0].author = "Боб Кирк.";
        myBooks[1].author = "Сью Норингтон.";
        myBooks[2].author = "Ян Стивенсон.";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", автор ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}