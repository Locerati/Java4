import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

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
            while ((nextLine = reader.readNext()) != null) {
                //А тут работаете с nextLine котрый представляет из себя текущую строчку в файле, уже разбитую на массив по разделителю separator
//Попробуйте просто вывести на экран этот nextLine и, думаю, все будет понятно
                int i=0;
            }
    } catch (IOException e) {
            e.printStackTrace();
        }
       catch (CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
