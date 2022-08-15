import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        try{
            FileWriter file = new FileWriter("newfile.txt");
            file.write("Hello this is the first thing to ever be written in files by meee");
            file.close();
        }catch(IOException err){
            System.out.println("Error occured");
            err.printStackTrace();
        }
    }
}