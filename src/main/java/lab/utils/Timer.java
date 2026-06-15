package lab.utils;

public class Timer {
    private long start;

    public void start() {
        start = System.nanoTime();
    }

    public long stop() {
        return System.nanoTime() - start;
    }

    public double stopMs() {
        return (stop() / 1_000_000.0);
    }
}
