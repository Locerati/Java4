import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
/**
 * @author Denis Popov
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        try (InputStream in = Main.class.getClassLoader().getResourceAsStream("foreign_names.csv");
             CSVReader reader = in == null ? null : new CSVReaderBuilder(new InputStreamReader(in))
                     .withSkipLines(1)
                     .withCSVParser(
                             new CSVParserBuilder().withSeparator(';').build()
                     )
                     .build()
        )
        {
            if (reader == null) {
                throw new FileNotFoundException("foreign_names.csv");
            }
            String[] nextLine;
            Mapper mapper=new Mapper();
            List<Human> humans = new ArrayList<>();
            while ((nextLine = reader.readNext()) != null) {  //Построчное чтение файла
                humans.add(mapper.map(nextLine));
            }
            for (Human i : humans){
              System.out.println(i.toString());
            }


    } catch (IOException e) {
            e.printStackTrace();
        }
       catch (CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
