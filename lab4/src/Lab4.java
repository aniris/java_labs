import java.io.*;
import java.util.Properties;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Lab4 {
    public static void main(String[] args) {
        try {
            String file = "./" + args[0],
                   key = "",
                   value = "";
            Properties property = new Properties();
            Scanner in = new Scanner(System.in);

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

            Map<String, String> map = new HashMap<String, String>();

            for (final String name: property.stringPropertyNames())
                map.put(name, property.getProperty(name));

            System.out.print("Please, write key: ");
            key = in.nextLine();
            while (!key.equals("q")) {
                value = map.get(key);

                if (value == null) {
                    System.out.println("Can't find key\n");
                } else if (value.equals("")) {
                    System.out.println("Value is empty\n");
                } else {
                    System.out.println("Value = " + value + "\n");
                }

                System.out.print("Please, write key: ");
                key = in.nextLine();
            }
            
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.err.println("You must write two arguments");
            return;
        }
    }
}