package kata1;

import java.util.Date;

public class Person {

    private final String name;
    private final Date birthdate; //formato año/mes/dia
    
    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
  
    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    //Calculo de la edad por la diferencia(en milisegndos)
    //entre la fecha actual y la de nacimiento.
    public int getAge(){
        return (int) ((new Date().getTime() - birthdate.getTime())/31557600000L);
    }  

}  