package ru.sectorsj.java_for_biginners._9_generics_data_types._340_more_gen_interface_demo;

public class MoreGenInterfaceDemo {

    public static void main(String[] args) {
        MyMethods ref;

        Alpha A = new Alpha(123);
        Bravo B = new Bravo('A');

        A.show();
        ref = A;
        ref.set(321);
        A.show();

        B.show();
        ref = B;
        ref.set('B');
        B.show();
    }
}
