
public class ordercont {
	private static volatile int mon=0;
	private static volatile int tue=0;
	private static volatile int wed=0;
	private static volatile int thu=0;
	private static volatile int fri=0;
	
	
	public static void set(String day,int cont){
		if(day.equals("Mon")){
			mon+=cont;
		}
		else if(day.equals("Tue")){
			tue+=cont;
		}
		else if(day.equals("Wed")){
			wed+=cont;
		}
		else if(day.equals("Thu")){
			thu+=cont;
		}
		else if(day.equals("Fri")){
			fri+=cont;
		}
	}
	public static void clear(){
		mon=0;
		tue=0;
		wed=0;
		thu=0;
		fri=0;
	}
	public static String tostring(){
		
		return "周一:"+mon+" 份；\n"
				+"周二:"+tue+" 份；\n"
				+"周三:"+wed+" 份；\n"
				+"周四:"+thu+" 份；\n"
				+"周五:"+fri+" 份；\n";
	}
}
