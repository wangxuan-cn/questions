//三个线程依次执行示例
public class TestJoin3 {
    public static void main(String[] args) throws InterruptedException {
        final Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " run 1");
            }
        }, "T1");
        final Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                	  t1.start();
                    t1.join(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " run 2");
            }
        }, "T2");
        final Thread t3 = new Thread(new Runnable() {
            public void run() {
                try {
                		t2.start();
                    t2.join(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " run 3");
            }
        }, "T3");
    
        t3.start();
    }
}
