package Quartz;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.CronTrigger;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import java.text.ParseException;

public class QuartzTest {

    private SchedulerFactory schedFact;
    private Scheduler sched;

    public QuartzTest(){
        try{
            schedFact = new StdSchedulerFactory();
            sched = schedFact.getScheduler();
            sched.start();

            JobDetail jobDetail = new JobDetail("job1","group1", HelloJob.class);
            CronTrigger trigger1 = new CronTrigger("trigger1", "group1", "3 * * * * ?");
            sched.scheduleJob(jobDetail,trigger1);
            Thread.sleep(1000);
        }catch (SchedulerException e){

        }catch (ParseException e){

        }catch (Exception e){}
    }


    public static void main(String args[]){
        new QuartzTest();
    }


}
