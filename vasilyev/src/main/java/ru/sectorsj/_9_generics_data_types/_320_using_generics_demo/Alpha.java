package ru.sectorsj._9_generics_data_types._320_using_generics_demo;

class Alpha<X> {
    private X first;

    Alpha(X first) {
        set(first);
    }

    void set(X first) {
        this.first = first;
    }

    X get() {
        return first;
    }
}
