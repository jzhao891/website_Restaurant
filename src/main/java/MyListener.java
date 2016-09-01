import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{
	private Timer timer1 = null;
	private Timer timer2=null;
	private Timer timer3=null;
                     
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        timer1.cancel();
        timer2.cancel();
        timer3.cancel();
    }
    public void contextInitialized(ServletContextEvent sce) {
    	Date date=new Date();
    	Calendar c=Calendar.getInstance(); 
    	c.setTime(date); 
    	//今天是这个星期的第几天 
    	int week=c.get(Calendar.DAY_OF_WEEK);
    	timer1 = new Timer(true);
    	if(week==7){
    		mytask myTask = new mytask();
            timer1.schedule(myTask, 3000);
    	}
    	timer2=new Timer(true);
    	timer3=new Timer(true);
    	mytaskRead mtR=new mytaskRead();
    	timer2.schedule(mtR,6000);
    	mytaskSave mtS=new mytaskSave();
    	timer3.schedule(mtS,9000,60*1000);
    }
    

}
