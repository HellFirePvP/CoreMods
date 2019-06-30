package cpw.mods;

public class RedirectClass {
    private static int beforeCallCount = 0;
    private static int afterCallCount = 0;

    public static boolean newMethod() {
        return false;
    }

    public static void afterMethod() {
        afterCallCount++;
    }

    public static void beforeMethod() {
        beforeCallCount++;
    }

    public static int getBeforeCallCount() {
        return beforeCallCount;
    }

    public static int getAfterCallCount() {
        return afterCallCount;
    }
}
