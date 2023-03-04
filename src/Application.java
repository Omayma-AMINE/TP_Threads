public class Application {
    public static void main(String[] args) {
        Talkative tl1 = new Talkative(1);
        Talkative tl2 = new Talkative(2);
        Talkative tl3 = new Talkative(3);
        Talkative tl4 = new Talkative(4);
        Talkative tl5 = new Talkative(5);
        Talkative tl6 = new Talkative(6);
        Talkative tl7 = new Talkative(7);
        Talkative tl8 = new Talkative(8);
        Talkative tl9 = new Talkative(9);
        Talkative tl10 = new Talkative(10);

        Thread t1 = new Thread(tl1);
        Thread t2 = new Thread(tl2);
        Thread t3 = new Thread(tl3);
        Thread t4 = new Thread(tl4);
        Thread t5 = new Thread(tl5);
        Thread t6 = new Thread(tl6);
        Thread t7 = new Thread(tl7);
        Thread t8 = new Thread(tl8);
        Thread t9 = new Thread(tl9);
        Thread t10 = new Thread(tl10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }
}
