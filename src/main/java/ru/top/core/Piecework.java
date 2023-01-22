package ru.top.core;

public class Piecework extends Workers{
    private Integer task;
    private Integer completedTask;

    public Piecework(String fio, TypeSalary typeSalary, Integer task, Integer completedTask) {
        super(fio, typeSalary);
        this.task = task;
        this.completedTask = completedTask;
    }

    public Integer getTask() {
        return task;
    }

    public void setTask(Integer task) {
        this.task = task;
    }

    public Integer getCompletedTask() {
        return completedTask;
    }

    public void setCompletedTask(Integer completedTask) {
        this.completedTask = completedTask;
    }


    @Override
    public int getsalary() {
        return 0;
    }

    @Override
    protected int getSalary() {
        return completedTask * task;
    }
}
