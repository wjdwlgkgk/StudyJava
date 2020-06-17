package Quartz;


import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class HelloJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        long time = System.currentTimeMillis();
        SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String str = dayTime.format(new Date(time));

        System.out.println("[" + str + "]" + "Hello Job is Started");
        for(int i=0; i<10000; i++)
        {

        }
        System.out.println("[" + str + "]" + "Hello Job is being executed!");
    }
}
