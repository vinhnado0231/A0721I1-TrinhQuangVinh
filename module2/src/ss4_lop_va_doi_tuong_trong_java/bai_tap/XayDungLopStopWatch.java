package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.concurrent.TimeUnit;

public class XayDungLopStopWatch {
    public static void main(String[] args) throws InterruptedException {
        StopWatch watch = new StopWatch();
        startWatch(watch);
        TimeUnit.SECONDS.sleep(3);
        endWatch(watch);
        watch.setElapsedTime(watch.getEndTime() - watch.getStartTime());
        System.out.println(watch.getElapsedTime());
    }
        private static void endWatch(StopWatch watch) {
            watch.setEndTime(System.currentTimeMillis());
        }

        public static  void startWatch(StopWatch watch) {
            watch.setStartTime(System.currentTimeMillis());
        }
    }
