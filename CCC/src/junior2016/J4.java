package junior2016;

public class J4 {
	public static void main(String[] args){
		int distance = 0;
		String time = "07:40";
		while(distance < 240){
			distance = distance + move(time);
			time = addTime(time, "00:01");
		}
		System.out.println(time);
	}
	
	public static int convertTime(String time){
		// "10:00" -> 1000
		// "09:45"-> 945
		// "13:23" -> 1323
		String[] e = time.split(":");
		String total = "";
		for(String i: e){
			total += i;
		}
		return Integer.parseInt(total.trim());
	}
	
	public static String addTime(String a, String b){
//		System.out.println(a);
//		System.out.println(b);
		int hha = Integer.parseInt(a.split(":")[0]);
		int hhb = Integer.parseInt(b.split(":")[0]);
		int mma = Integer.parseInt(a.split(":")[1]);
		int mmb = Integer.parseInt(b.split(":")[1]);
		int mm;
		int hh;
		String result;
		if(mma + mmb >= 60){
			mm = (mma + mmb) % 60;
			hh = (hha + hhb + 1) % 24; 
		}else{
			mm = mma + mmb;
			hh = hha + hhb;
		}
		if(hh <= 9){
			result = "0"+hh+":";
		}else{
			result = Integer.toString(hh) + ":";
		}
		if(mm <= 9){
			result += "0" + mm;
		}else{
			result += Integer.toString(mm);
		}
		return result;
	}
	
	public static int move(String time){
		int timeInDigits = convertTime(time);
		if(timeInDigits< 700){
			return 2;
		}else if(timeInDigits < 1000){
			return 1;
		}else if(timeInDigits < 1500){
			return 2;
		}else if(timeInDigits < 1900){
			return 1;
		}
		return 2;
	}
}