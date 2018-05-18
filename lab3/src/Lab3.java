import java.io.*;
import java.util.Properties;

public class Lab3 {
    public static void main(String[] args) {
        try {
            String file = "./" + args[0],
                   key = args[1],
                   value = "";
            Properties property = new Properties();

            try (FileInputStream fis = new FileInputStream(file)){
                property.load(fis); 
                fis.close();
            } catch (FileNotFoundException fnfe) {
                System.err.println("Can't find file");
                return;
            } 
            catch (SecurityException se) {
                System.err.println("No access to the file");
                return;
            }
            catch (IllegalArgumentException iae) {
                System.err.println("File contains a malformed Unicode escape sequence");
                return;
            } 
            catch (IOException e) {
                System.err.println("Can't open file");
                return;
            }

            value = property.getProperty(key);
            System.out.println("Key: " + key);

            if (value == null) {
                System.out.println("Can't find key");
            } else if (value.equals("")) {
                System.out.println("Value is empty");
            } else {
                System.out.println("Value: " + value);
            }
            
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.err.println("You must write two arguments");
            return;
        }
    }
}