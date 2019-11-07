package future;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {

    public static void main(String[] args) throws Exception{
        new FutureTest().testParallelExecute();
    }

public void testParallelExecute() throws Exception {
        List<String> testSample = Arrays.asList("가","나","다","라","마","바","사","후후","1","10","100","-100");
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        List<Future<Video>> futures = new ArrayList<Future<Video>>();
        for(final String sample : testSample){
            Callable<Video> callable = new Callable<Video>(){
                @Override
                public Video call() throws Exception{
                    System.out.println("Time : " + new Date() + "-Thread Name : " + Thread.currentThread().getName() + " - Text : " + sample );
                    if (Thread.currentThread().getName().equals("pool-1-thread-3")) {
                        Thread.sleep(50);
                    }
                    Video video = new Video();
                    video.setDialog(sample);
                    return video;
                }
            };
        }
        threadPool.shutdown();

        List<Video> results = new ArrayList<Video>();
        for(Future<Video> future : futures){
            results.add(future.get());
        }


        for (Video result : results){
            System.out.println(result.getDialog());
        }


    }

}

class Video{
    String dialog;

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }
}
