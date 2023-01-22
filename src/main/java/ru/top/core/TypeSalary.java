package ru.top.core;

public enum TypeSalary {

    BET("Ставка"),
    HOUR("Почасовая");

    private final String desc;

    TypeSalary(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public static TypeSalary fromName(String name) {
        TypeSalary[] values = TypeSalary.values();
        for (TypeSalary value : values) {
            if (value.name().equals(name)) {
                return value;
            }
        }
        return null;
    }
}
