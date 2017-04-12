package concurrency;

import java.util.concurrent.*;

/**
 * Created by YaoYunZhe on 2017/4/11.
 */
public class ThreadTest {
    static class ParentCallable implements Callable{

        @Override
        public Object call() throws Exception {
            printThreadInfo();
            TimeUnit.SECONDS.sleep(2);
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(new SubRunnable());
            return 10;
        }
    }

    static class SubRunnable implements Runnable{

        @Override
        public void run() {
            try {
                printThreadInfo();
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future submit = executorService.submit(new ParentCallable());
        Object o = submit.get();
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        printThreadInfo();

    }

    private static void printThreadInfo() {
        System.out.println("==============================================");
        System.out.println("Thread.activeCount():"+Thread.activeCount());

        for (Object o1 : Thread.getAllStackTraces().keySet()) {
            System.out.println(o1);
        }
    }
}
