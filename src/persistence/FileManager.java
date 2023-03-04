package persistence;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager{

    public static final String NAME_FILE = "./data/Customers.txt";
    
    public static void writeFile(String nameFile) {
        String text = "";
        try {
            try (FileWriter fileWriter = new FileWriter(nameFile)) {
                for (int i = 0; i < text.length(); i++) {
                    fileWriter.write(text.charAt(i));
                }
            }
            System.out.println("Erikaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (IOException ex) {
            
        }
    }
 
        
    public static void main(String[] args) {
        writeFile(FileManager.NAME_FILE);
    }
    
    
}
