package ru.top.core;

public abstract class Workers {

    protected String fio;

    protected TypeSalary typeSalary;

    public Workers(String fio, TypeSalary typeSalary) {
        this.fio = fio;
        this.typeSalary = typeSalary;
    }

    protected abstract int getsalary();

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public TypeSalary getTypeSalary() {
        return typeSalary;
    }

    public void setTypeSalary(TypeSalary typeSalary) {
        this.typeSalary = typeSalary;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(fio).append("\s");
        sb.append(typeSalary.getDesc()).append("\s");
        sb.append(getSalary());
        return sb.toString();
    }

    protected abstract int getSalary();
}
