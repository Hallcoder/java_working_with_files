import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        try{
            File myObj = new File("./files/newfile.txt");
            if(myObj.createNewFile()){
                System.out.println("FileName :"+myObj.getName());
            }else{
                System.out.println("File already exists.");
            }
        }catch(IOException err){
            System.out.println("Error occured");
            err.printStackTrace();
        }
    }
}