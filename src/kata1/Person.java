package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    private final String name;
    private final Calendar birthdate; //formato año/mes/dia
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
  
    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
    private long milliSecondsToYear(long milles){
        return milles/MILLISECONDS_PER_YEAR;
    }
        
    //Calculo de la edad por la diferencia(en milisegndos)
    //entre la fecha actual y la de nacimiento.
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis()
                      - birthdate.getTimeInMillis()));
    }  

}  