import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListenerSave implements ServletContextListener{
	private Timer timer = null;
                     
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        timer.cancel();
    }
    public void contextInitialized(ServletContextEvent sce) {
    	Date date=new Date();
    	Calendar c=Calendar.getInstance(); 
    	c.setTime(date); 
    	//今天是这个星期的第几天 
    	int week=c.get(Calendar.DAY_OF_WEEK); 
    	if(week==7){
    		mytask myTask = new mytask();
    		timer = new Timer(true);
            timer.schedule(myTask, 5000);
    	}
    }
    

}
