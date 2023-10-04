package these;

public class Test2 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.age = 18;
        t1.f1(17); // yes
        t1.f1(19); // no
    }
}
