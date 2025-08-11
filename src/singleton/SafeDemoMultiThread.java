package singleton;

public class SafeDemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread safeFoo = new Thread(new SafeFooThread());
        Thread safeBar = new Thread(new SafeBarThread());
        safeFoo.start();
        safeBar.start();
    }

    static class SafeFooThread implements Runnable {
        @Override
        public void run() {
            SafeSingleton instance = SafeSingleton.getInstance("FOO");
            System.out.println(instance.value);
        }
    }

    static class SafeBarThread implements Runnable {
        @Override
        public void run() {
            SafeSingleton instance = SafeSingleton.getInstance("BAR");
            System.out.println(instance.value);
        }
    }
}
