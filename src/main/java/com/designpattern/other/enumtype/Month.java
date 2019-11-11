package com.designpattern.other.enumtype;

public final class Month implements Comparable, java.io.Serializable {

    public static final Month JAN = new Month("January");
    public static final Month FEB = new Month("February", 28);
    public static final Month MAR = new Month("March");
    public static final Month APR = new Month("April", 30);
    public static final Month MAY = new Month("May");
    public static final Month JUN = new Month("June", 30);
    public static final Month JUL = new Month("July");
    public static final Month AUG = new Month("August");
    public static final Month SEP = new Month("September", 30);
    public static final Month OCT = new Month("October");
    public static final Month NOV = new Month("November", 30);
    public static final Month DEC = new Month("December");

    private static final Month[] $VALUES;

    static {
        $VALUES = new Month[]{JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
    }

    private static int count = 0;

    private final String name;
    private final int number;
    private final int days;

    private Month(String name) {
        this(name, 31);
    }

    private Month(String name, int days) {
        this.name = name;
        this.days = days;
        this.number = ++count;
    }

    public String getName() {
        return name;
    }

    public String getAbbev() {
        return name.substring(0, Math.min(3, getName().length()));
    }

    public int getNumber() {
        return number;
    }

    public int getDays() {
        return days;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return getNumber() - ((Month) o).getNumber();
    }

    //readResolve这个方法目的是解决序列化的单例问题
    //保证该类对象在序列化后，再进行反序列化时使用在jvm中只有一个对象
    Object readResolve() throws java.io.ObjectStreamException {
        return $VALUES[number - 1];
    }
}
