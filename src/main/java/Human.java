import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
/**
 * Класс хранящий информацию о сотруднике
 * @author Denis Popov
 * @version 1.0
 */

public class Human {
    private int id;
    private String name;
    private String gender;
    private LocalDate birtDate;
    private BigDecimal salary;
    private Subdivision subdivision;

    public Human() {

    }

    public Human(int id, String name, String gender, LocalDate birtDate, Subdivision subdivision, BigDecimal salary) {
        this.id = id;
        this.name=name;
        this.gender=gender;
        this.birtDate=birtDate;
        this.subdivision=subdivision;
        this.salary=salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Subdivision getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(Subdivision subdivision) {
        this.subdivision = subdivision;
    }

    @Override
    public String toString() {
        return "{" + id + "::" + name + "::" + gender + "::" + birtDate + "::" + subdivision.getDivision()+ "::" +  salary + "}";
    }
}
