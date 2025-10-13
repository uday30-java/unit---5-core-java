import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

class CalDateTime {
    public static void main(String[] args) {
        LocalTime LT = LocalTime.now();
        System.out.println(LT);
        System.out.println(LT.getHour());
        System.out.println(LT.getMinute());
        System.out.println(LT.getSecond());
        LocalDate LD = LocalDate.now();
        System.out.println(LD);
        System.out.println(LD.getMonth());
        System.out.println(LD.getDayOfMonth());
        System.out.println(LD.getDayOfWeek());
        System.out.println(LD.getDayOfYear());
        LocalDateTime LDT = LocalDateTime.now();
        System.out.println(LDT);
        Calendar cal = Calendar.getInstance(); 
        System.out.println(cal.getTime()); 
        System.out.println(cal.get(Calendar.YEAR));
        
    }

    
}
