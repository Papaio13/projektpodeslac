package models;

import interfaces.BasicInterface;

public class Reservation extends BasicData implements BasicInterface {
    private int peopleCount;

    public int getPeopleCount() {
        return this.peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public void thx() {
    System.out.println(WITAJ);
    }

}

