/**
 * Класс хранящий информацию об отделе
 * @author Denis Popov
 * @version 1.0
 */
public class Subdivision {
    private static int countId;
    private int id;
    private String division;
    public Subdivision(String division){
        this.division=division;
        countId++;
        id=countId;
    }
    public int getId() {
        return id;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
}
