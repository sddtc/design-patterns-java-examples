package singleton;

public final class SafeSingleton {
    private static volatile SafeSingleton instance;
    public String value;

    private SafeSingleton(String value) {
        this.value = value;
    }

    public static SafeSingleton getInstance(String value) {
        SafeSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (SafeSingleton.class) {
            if (null == instance) {
                instance = new SafeSingleton(value);
            }
            return instance;
        }
    }
}
