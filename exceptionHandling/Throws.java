package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Throws {

    public static void FileInfo() throws IOException{

        int n[] = {3,2,3};
        for(int i = 0;i<=n.length;i++){
            System.out.println(n[i]);
        }
    }


    public static void main(String[] args) {
        try{
            FileInfo();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
