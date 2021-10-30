package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.concurrent.TimeUnit;

public class XayDungLopStopWatch {
    public static void main(String[] args) throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.startWatch();
        TimeUnit.SECONDS.sleep(3);
        watch.endWatch();
        watch.setElapsedTime(watch.getEndTime() - watch.getStartTime());
        System.out.println(watch.getElapsedTime());
    }
}
