import java.util.Calendar;
import java.util.Date;

class A extends Thread{
    public void run(){
        System.out.println("Thread A is running...");
    }
}

class B implements Runnable{

    public void run() {
        System.out.println("Thread B is running...");
    }
}

public class Test {

    public static void main(String ... s){
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(Calendar.HOUR_OF_DAY, 0);
    	calendar.set(Calendar.MINUTE, 0);
    	calendar.set(Calendar.SECOND, 0);
    	calendar.set(Calendar.MILLISECOND, 0);
    	Date currentDate = calendar.getTime();
    	
    	calendar.setFirstDayOfWeek(Calendar.MONDAY);
    	calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
    	Date CurrentWeeklyBucketStartDate = calendar.getTime();
    	calendar.add(Calendar.DATE, 7);
    	Date CurrentWeeklyBucketEndDate = calendar.getTime();
    	
    	System.out.println(currentDate);
    	System.out.println(CurrentWeeklyBucketStartDate);
    	System.out.println(CurrentWeeklyBucketEndDate);
    }
}
