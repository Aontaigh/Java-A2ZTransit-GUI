package FileIO;

import Model.Package;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MyFileIO {
    private static ArrayList<Package> packages = new ArrayList<>();
    
    public static ArrayList<Package> readAndReturn() {
        try {
            File file = new File("Packages.txt");
            
            FileInputStream fins = new FileInputStream(file);
            ObjectInputStream oins = new ObjectInputStream(fins);
            
            packages = (ArrayList<Package>)oins.readObject();
            fins.close();
            oins.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + e.getMessage());
        } catch (EOFException e) {
            System.out.println("End Of File Reached: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("General I/O Exception: " + e.getMessage());
            e.printStackTrace();
        }            
        
        return packages;
    }
    
    public static void writeToFile(ArrayList<Package> accounts) {
        try {
            File file = new File("Packages.txt");

            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
             
            oos.writeObject(accounts);
             
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + e.getMessage());
        } catch (EOFException e) {
            System.out.println("End Of File Reached: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("General I/O Exception: " + e.getMessage());
            e.printStackTrace();
        }           
    }
}
