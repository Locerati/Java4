import javax.xml.crypto.Data;
import java.math.BigDecimal;

public class Human {
    private int id;
    private String name;
    private String gender;
    private Data birtDate;
    private BigDecimal salary;
    private Subdivision subdivision;
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

    public Data getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Data birtDate) {
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
        return "{" + id + "::" + name + "::" + gender + "::" + birtDate+ "::"+salary +"::"+subdivision.getDivision() + "}";
    }
}
