package com.company;

public class Main {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    public static void main(String[] args) {
        Fan fan1 = new Fan(FAST, true, 10, "yellow");
        if (fan1.on()) {
           String result= fan1.toStringOn();
            System.out.println(result);
        } else {
            String result= fan1.toStringOff();
            System.out.println(result);
        }
        Fan fan2 = new Fan(SLOW, false, 5, "blue");
        if (fan2.on()) {
          String result= fan2.toStringOn();
            System.out.println(result);
        } else {
           String result= fan2.toStringOff();
            System.out.println(result);
        }
    }
}
