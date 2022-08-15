import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args){
        try{
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
        }


    }
}
