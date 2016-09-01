

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
/**
 * Servlet implementation class menulist
 */
public class menulist extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public menulist() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
        response.setContentType("application/json; charset=UTF-8");
        response.setHeader("Cache-control", "no-cache, no-store");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "-1");
        String FilePath="/Users/jessicazhao/Documents/workspace-java/ChengduGourmet/src/main/data/caidan.txt";
        File f=new File(FilePath);
        if(f.exists()){
        	BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        	String line=null;
        	int cont=1;
        	JSONObject jb=new JSONObject();
        	while((line=br.readLine())!=null){
        		System.out.print(line);
        		String[] item=line.split(":");
        		String menu=item[1];
        		
        		switch (cont){
        		case 1:jb.put("Mon", menu);break;
        		case 2:jb.put("Tue", menu);break;
        		case 3:jb.put("Wed", menu);break;
        		case 4:jb.put("Thu", menu);break;
        		case 5:jb.put("Fri", menu);break;
        		}
        		cont++;
        	}
    		System.out.println(jb.toString());
    		out.write(jb.toString());
        }
        else{
        	System.out.println("No menu!");
        	JSONObject jb=new JSONObject();
        	jb.put("error", "1");
        	out.write(jb.toString());
        }
        
        
	}

}
