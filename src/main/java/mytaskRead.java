import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.TimerTask;

public class mytaskRead extends TimerTask{
	public void run(){
        //此处添加具体任务代码
        try {
            System.out.println(" ===============Readtask call at :" + (new Date()));
            String filePath="/Users/jessicazhao/Documents/workspace-java/ChengduGourmet/src/main/data/dingdan.txt";
            File f=new File(filePath);
            if(f.exists()){
            	BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            	String line;
            	while((line=br.readLine())!=null){
            		String[] item=line.split(":");
            		String week=item[0];
            		String cont=item[1].split(" ")[0];
            		if(week.equals("周一")){
            			ordercont.set("Mon", Integer.valueOf(cont));
            		}
            		else if(week.equals("周二")){
            			ordercont.set("Tue", Integer.valueOf(cont));
            		}
            		else if(week.equals("周三")){
            			ordercont.set("Wed", Integer.valueOf(cont));
            		}
            		else if(week.equals("周四")){
            			ordercont.set("Thu", Integer.valueOf(cont));
            		}
            		else {
            			ordercont.set("Fri", Integer.valueOf(cont));
            		}
            	}
            	System.out.println("order is initializated!");
            }
            else{
            	System.out.println("task is done");
            }
            
        } catch (Exception e) {
            System.out.println("-------------解析信息发生异常--------------");
            e.printStackTrace();
        }
    }

}
