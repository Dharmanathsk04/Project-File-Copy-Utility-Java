import java.io.*;
import java.util.*;
public class FileCopyUtility {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter source file path: ");
    String sourcePath = sc.nextLine();

    System.out.println("Enter destination file path: ");
    String destPath = sc.nextLine();

    FileInputStream fis = null;
    FileOutputStream fos = null;


    try {

        fis = new FileInputStream(sourcePath);

        fos = new FileOutputStream(destPath);

        int byteData;

        while ((byteData = fis.read())!=-1) {

            fos.write(byteData);
        }

        System.out.println("File copied successfully!");
    }

    catch (FileNotFoundException e) {

        System.out.println("Error file not found- "+e.getMessage());
    }

    catch (IOException e) {

        System.out.println("Error during file copy: "+e.getMessage());
    }

    finally {

        try {

            if(fis != null) fis.close();
            if(fos != null) fos.close();

            sc.close();
        } catch (IOException e) {

            System.out.println("Error closing files.");
        }
    }
} 

}
