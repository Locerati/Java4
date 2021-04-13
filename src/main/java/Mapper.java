import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**Класс мапинга сущностей сотрудников
 * @author Denis Popov
 * @version 1.0
 */
public class Mapper {
    private static Map<String, Subdivision> savesSubdivisions ;
    public Mapper(){
        savesSubdivisions=new HashMap<String, Subdivision>() ;
    }
    /**
     * @param line - принимает строку файла с информаций о сотруднике и отделе
     * @return - возвращает класс Human
     */
    public Human map(String[] line){
       Subdivision temp;
        if ( savesSubdivisions.containsKey(line[4]))
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // формат даты
            LocalDate date = LocalDate.parse(line[3],formatter);
            return new Human(Integer.parseInt(line[0]),line[1],line[2], date,savesSubdivisions.get(line[4]), new BigDecimal(line[5]));
        }
        else
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");  // формат даты
            LocalDate date = LocalDate.parse(line[3],formatter);
            Subdivision newSubDiv=new Subdivision(line[4]);
            savesSubdivisions.put(line[4],newSubDiv);
            return new Human(Integer.parseInt(line[0]),line[1],line[2], date,newSubDiv, new BigDecimal(line[5]));
        }

    }
}
