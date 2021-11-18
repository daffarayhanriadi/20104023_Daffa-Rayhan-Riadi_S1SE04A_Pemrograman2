package modul7.percobaan;

public class Overload {
    void myOverLoad(A a) {
        System.out.println("Overload.myOverload(A a)");
    }

    void myOverLoad(B b) {
        System.out.println("Overload.myOverload(B b)");
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        A a = new A();
        C c = new C();

        o.myOverLoad(a);
        o.myOverLoad(c);
    }
}
