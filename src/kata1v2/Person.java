package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Person {
    private final String name;
    private final Calendar birthday;
    private final long MILLISECONDPORYEAR = (long)(365.25 * 24 * 60 * 60 * 1000);

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    public int getAge(){
    Calendar today;
    today = GregorianCalendar.getInstance();
    return (int) (milliSecondToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));
}
    private long milliSecondToYear (long milles){
        return milles / MILLISECONDPORYEAR;
    }
    
}