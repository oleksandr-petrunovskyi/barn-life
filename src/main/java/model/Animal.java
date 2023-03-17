package model;

abstract class Animal implements Aliens, Eating {
    private long id;
    private Sex sex;
    private int lifetime;
    private int age;
    private AgeStatus ageStatus;
    private int dailyAmountFood;
    private int daysWithoutFood;

    public enum Sex {
        MALE,
        FEMALE
    }

    public enum AgeStatus {
        BABY,
        ADULT
    }
}
