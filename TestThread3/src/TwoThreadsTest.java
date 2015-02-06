
class TwoThreadsTest {
    public static void main (String args[]) {
        new SimpleThread("Ireland").start();
        new SimpleThread("England").start();
    }
}
