import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args){

        WritingCSVFile();
        ReadingCSVFile();
    }

    public static void WritingCSVFile(){

        try{
            CSVWriter csvWriter = new CSVWriter(new FileWriter("salaries.csv"),CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
            csvWriter.writeNext(new String[]{"5000","6500.25","2500.90","4500.40","7000"});
            csvWriter.writeNext(new String[]{"3400","2800","4100","4150","8900"});
            csvWriter.writeNext(new String[]{"2340.10","5000.40","4600.77","6145.45","3700.99"});
            csvWriter.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void ReadingCSVFile(){

        try{
            CSVReader csvReader = new CSVReader(new FileReader("salaries.csv"));
            List<List<String>> rows = new ArrayList<List<String>>();
            String[] nextRecord;

            while((nextRecord = csvReader.readNext())!=null){
                rows.add(Arrays.asList(nextRecord));
            }

            Operations(rows); //calling the sum and average calculation method
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(CsvValidationException ex){
            ex.printStackTrace();
        }
    }

    public static void WritingTXTFile(String[] rows) {

        try{
            FileWriter fileWriter = new FileWriter("salariesStatistics.txt");
            for(String getRow : rows){
                fileWriter.write(getRow + "\n");
            }
            fileWriter.close();

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void Operations(List<List<String>> rows){

        double[] sum = new double[rows.size()];
        double[] average = new double[rows.size()];

        for(int i = 0; i < rows.size(); i++){
            for(int j = 0; j < rows.get(i).size(); j++){
                sum[i] += Double.parseDouble(rows.get(i).get(j));
            }
            average[i] = sum[i] / rows.get(i).size();
        }

        DisplayResults(sum, average);
    }

    public static void DisplayResults(double[] sum, double[] average){

        String[] rows = new String[sum.length];

        for(int i = 0; i < sum.length; i++){
            String strSum = String.format("%.2f", sum[i]);
            String strAverage = String.format("%.2f", average[i]);
            String temporaryLine = "Number line " + (i+1) + " Sum: " + strSum + " | Average: " + strAverage;
            System.out.println(temporaryLine);
            rows[i] = temporaryLine;
        }

        WritingTXTFile(rows);
    }
}
