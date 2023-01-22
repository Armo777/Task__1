package ru.top.core;

import java.util.Objects;

public class Bet extends Workers{
    private Integer bet;
    private Integer dayCount;

    public Bet(String fio, TypeSalary typeSalary, Integer bet, Integer dayCount) {
        super(fio, typeSalary);
        this.bet = bet;
        this.dayCount = dayCount;
    }

    public Integer getBet() {
        return bet;
    }

    public void setBet(Integer bet) {
        this.bet = bet;
    }

    public Integer getDayCount() {
        return dayCount;
    }

    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    @Override
    public int getsalary() {
        return 0;
    }

    @Override
    protected int getSalary() {
        return dayCount * bet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet betWorker = (Bet) o;
        return Objects.equals(bet, betWorker.bet) && Objects.equals(dayCount, betWorker.dayCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bet, dayCount);
    }
}
