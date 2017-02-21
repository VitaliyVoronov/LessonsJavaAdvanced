package ua.itea.testTasks;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/21/17
 */

public class Tasks {
    public static Tasks instance = new Tasks();
    private static final int DELTA = 5;
    private static int BASE = 7;
    private int x;

    public Tasks() {
        x = BASE + DELTA;
    }
    public static int getBASE() {
        return BASE;
    }
    public static void main(String[] args) {
        System.out.println(Tasks.instance.x);
    }
}
