import java.io.File;
import java.util.Date;
import java.util.TimerTask;

public class mytask extends TimerTask{
	public void run(){
        //此处添加具体任务代码
        try {
            System.out.println(" ===============Deletetask call at :" + (new Date()));
            ordercont.clear();
            String filePath="../data/dingdan.txt";
            File f=new File(filePath);
            if(f.isFile()&&f.exists()){
            	f.delete();
            	System.out.println("dingdan is deleted!");
            }
            else{
            	System.out.println("The file "+filePath+" doesn't exist or isn't a file!");
            }
            
        } catch (Exception e) {
            System.out.println("-------------解析信息发生异常--------------");
            e.printStackTrace();
        }
    }

}
