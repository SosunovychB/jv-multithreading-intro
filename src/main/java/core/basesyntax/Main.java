package core.basesyntax;

import core.basesyntax.thread.*;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread runnableThread = new Thread(myRunnable);
        runnableThread.setDaemon(true);
        runnableThread.start();
    }
}
