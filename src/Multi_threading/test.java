package Multi_threading;

public class test {

    public static void main(String[] args) {
        M1 m = new M1();
        Thread t1 = new Thread(m);
        t1.start();
    }
}
