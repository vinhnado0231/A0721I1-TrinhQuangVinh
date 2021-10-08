package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.concurrent.TimeUnit;

public class XayDungLopStopWatch {
    public static StopWatch watch = new StopWatch();

    public static void main(String[] args) throws InterruptedException {
        startWatch();
        TimeUnit.SECONDS.sleep(2);
        endWatch();
        watch.setElapsedTime(watch.getEndTime() - watch.getStartTime());
        System.out.println(watch.getElapsedTime());

    }

    private static void endWatch() {
        watch.setEndTime(System.currentTimeMillis());
    }

    public static void startWatch() {
        watch.setStartTime(System.currentTimeMillis());
    }
}
