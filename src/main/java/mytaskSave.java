import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.TimerTask;

public class mytaskSave extends TimerTask{
	public void run(){
        //此处添加具体任务代码
        try {
            System.out.println(" ===============Savetask call at :" + (new Date()));
            String filePath="/Users/jessicazhao/Documents/workspace-java/ChengduGourmet/src/main/data/dingdan.txt";
            File f=new File(filePath);
            	FileWriter fw=new FileWriter(f);
            	fw.append(ordercont.tostring());
                fw.close();
                System.out.println("dingdan is saved");
           
            	System.out.println("task is done");
        } catch (Exception e) {
            System.out.println("-------------解析信息发生异常--------------");
            e.printStackTrace();
        }
    }

}
