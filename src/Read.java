import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Read {
    public static void main(String[] args){
        try{
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formattedDate =  DateTimeFormatter.ofPattern("E, MMM dd yyy");
            System.out.println("Before we start just know that we are:"+now);
            System.out.println("But the date looks better when formatted "+ now.format(formattedDate));
            File AlreadyExistingFile = new File("newfile.txt");
            Scanner File = new Scanner(AlreadyExistingFile);
            while(File.hasNextLine()){
                String nextline = File.nextLine();
                System.out.println(nextline);
            }
            File.close();
            if(AlreadyExistingFile.delete()) System.out.println("Delete done!");
        }catch(FileNotFoundException f){
            System.out.println("Error occured!");
            f.printStackTrace();
        }


    }
}
