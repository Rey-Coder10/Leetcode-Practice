package Multi_threading;


public class M1 implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("World");
        }
    }
}
