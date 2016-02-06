
public class Clock {
	static double Time; // use the double type to represent 24 hour
	static int Weekday; // use 1 or 0 to indicate whether it is working day
	
	public static void setTime(int weekday, double time){
		Weekday = weekday;
		Time = time;
	}

}
