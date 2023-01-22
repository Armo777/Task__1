package ru.top.core;

import java.util.Objects;

public class Hourly extends Workers{
    private Integer hourSalary;
    private Integer hourCount;

    public Hourly(String fio, TypeSalary typeSalary, Integer hourSalary, Integer hourCount) {
        super(fio, typeSalary);
        this.hourSalary = hourSalary;
        this.hourCount = hourCount;
    }

    public Integer getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(Integer hourSalary) {
        this.hourSalary = hourSalary;
    }

    public Integer getHourCount() {
        return hourCount;
    }

    public void setHourCount(Integer hourCount) {
        this.hourCount = hourCount;
    }

    @Override
    public int getsalary() {
        return 0;
    }

    @Override
    protected int getSalary() {
        return hourSalary * hourCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hourly hourWorker = (Hourly) o;
        return Objects.equals(hourSalary, hourWorker.hourSalary) && Objects.equals(hourCount, hourWorker.hourCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourSalary, hourCount);
    }
}
