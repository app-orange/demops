package oopapp;

public class Student {
    String name;
    double math;
    double chinese;

    public void totalScore()
    {
        System.out.println(name + "的总成绩是" + (math + chinese));
    }

    public void avgScore()
    {
        System.out.println(name + "的平均成绩是" + (math + chinese) / 2.0);
    }

}
