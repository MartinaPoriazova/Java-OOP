package ennumeration;

public enum DayOfWeek {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tusday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String name;

    private DayOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
