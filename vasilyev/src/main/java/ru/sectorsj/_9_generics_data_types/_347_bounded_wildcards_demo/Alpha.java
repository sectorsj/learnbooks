package ru.sectorsj._9_generics_data_types._347_bounded_wildcards_demo;

class Alpha {
    private String name;

    Alpha(String txt) {
        name = txt;
    }

    @Override
    public String toString() {
        return name;
    }
}
