package kell;

public class Kell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcAngle(13, 0);
		//System.out.println(CalcAngle(23,30));
		//System.out.println(CalcAngle(25,45));

	}
	
	static int  CalcAngle(int hour, int minute) {
		
		int angle = 0;
		
		if(hour<0 || minute < 0 || hour > 24 || minute > 60 ) {
			System.out.println("Wrong input");
			
		
		}
		if(hour >= 12) {
			hour = hour - 12;
		}
		
		int hour_angle = 360 - (360/12 * hour);
		int minute_angle = 360 - (360/60 * minute);
		
		if(minute_angle < hour_angle) {
			
			angle = hour_angle - minute_angle;
			
		}
		
		if(minute_angle > hour_angle) {
			
			angle = minute_angle - hour_angle;
		}
		
		System.out.print("Angle is " + angle);
		
		return angle;
		
	}

}
