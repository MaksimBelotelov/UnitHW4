package org.example;

public class Main {
    public static void main(String[] args) {
        assertConditionA();
        assertConditionB();
        System.out.println(sum(Integer.MAX_VALUE, 2));
    }

    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 2;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    public static void assertConditionB() {
        int x = -1;
        assert x < 0;
    }

    public static int sum(int a, int b) {
        assert a + b > a && a + b > b : "Value overflow";
        return a + b;
    }

}