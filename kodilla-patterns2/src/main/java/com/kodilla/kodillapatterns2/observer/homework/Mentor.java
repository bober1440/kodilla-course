package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(name + ": New task in " + homeworkQueue.getStudentName() + "'s queue\n" +
                " (total: " + homeworkQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
