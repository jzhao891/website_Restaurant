

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
public class submit extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public submit() {
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
        JSONObject jb=new JSONObject();
        try{
        	ordercont.set("Mon",Integer.valueOf(request.getParameter("Mon")));
            ordercont.set("Tue",Integer.valueOf(request.getParameter("Tue")));
            ordercont.set("Wed",Integer.valueOf(request.getParameter("Wed")));
            ordercont.set("Thu",Integer.valueOf(request.getParameter("Thu")));
            ordercont.set("Fri",Integer.valueOf(request.getParameter("Fri")));
            jb.put("value", "1");
        }catch(Exception e){
        	System.out.println("set error!");
        	jb.put("value", "0");
        }
        out.write(jb.toString());
        
        
        
        
        
	}

}
