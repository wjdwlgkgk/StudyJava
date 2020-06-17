package Quartz;

import java.util.Date;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;



import java.text.ParseException;
import java.text.SimpleDateFormat;

public class QuartzTest {

    private SchedulerFactory schedFact;
    private Scheduler sched;

    public QuartzTest() {
        try {
            schedFact = new StdSchedulerFactory();
            sched = schedFact.getScheduler();
            sched.start();

            JobDetail jobDetail = new JobDetail("job1", "group1", HelloJob.class);
            CronTrigger trigger1 = new CronTrigger("trigger1", "group1", "3 * * * * ?");
            sched.scheduleJob(jobDetail, trigger1);


//            JobDetail jobDetail = new JobDetail("job1", "group1", HelloJob.class);
//            CronTrigger trigger1 = new CronTrigger("trigger1", "group1", "3 * * * * ?");
//            sched.scheduleJob(jobDetail, trigger1);
//
//            JobDetail jobDetail = new JobDetail("job1", "group1", HelloJob.class);
//            CronTrigger trigger1 = new CronTrigger("trigger1", "group1", "3 * * * * ?");
//            sched.scheduleJob(jobDetail, trigger1);
//
//
//            JobDetail jobDetail = new JobDetail("job1", "group1", HelloJob.class);
//            CronTrigger trigger1 = new CronTrigger("trigger1", "group1", "3 * * * * ?");
//            sched.scheduleJob(jobDetail, trigger1);


            long time = System.currentTimeMillis();
            SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            String str = dayTime.format(new Date(time));
            System.out.println("[" + str + "]" + "job Enroll");


        } catch (SchedulerException e) {

        } catch (ParseException e) {

        } catch (Exception e) {
        }
    }

    public static void helloJob() throws SchedulerException, InterruptedException{
//        JobDetail jobDetail = new Job(HelloJob.class).build();
//        Trigger trigger = new Trigger().build();

        Scheduler defaultSchduler = StdSchedulerFactory.getDefaultScheduler();
        defaultSchduler.start();
//        defaultSchduler.scheduleJob(jobDetail, trigger);
        Thread.sleep(3 * 1000);

        defaultSchduler.shutdown();
    }

    public static void main(String args[]) {

        new QuartzTest();

//        helloJob();


    }


}
