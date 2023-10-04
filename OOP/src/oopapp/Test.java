package oopapp;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小羊";
        s1.chinese = 90;
        s1.math = 80;

        s1.totalScore();
        s1.avgScore();
    }
}
