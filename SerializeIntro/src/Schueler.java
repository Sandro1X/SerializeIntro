
import java.io.Serializable;
import java.time.LocalDate;


public class Schueler implements Serializable{
    private String name;
    private LocalDate birthday;

    public Schueler(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s", name, birthday);
    }
}
