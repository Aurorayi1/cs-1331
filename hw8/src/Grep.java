//I worked on the homework assignment alone, using only course materials.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * This class represents a Grep object.
 * @author Wenye Yi
 * @version 1.0
 */
public class Grep {
    /**
     * This main method takes in one parameter
     * @param args the argument
     * @throws FileNotFoundException file cannot be found
     * @throws InvalidSearchStringException invalid string
     */
    public static void main(String[] args) throws
        FileNotFoundException, InvalidSearchStringException {
        File fl;
        String s;
        boolean b;
        if (args.length == 3 && args[0].equals("-i")) {
            fl = new File(args[2]);
            s = args[1];
            b = false;
            System.out.println(grep(fl, s, b));
        } else if (args.length == 2) {
            fl = new File(args[1]);
            s = args[0];
            b = true;
            System.out.println(grep(fl, s, b));
        } else {
            throw new IllegalArgumentException();
        }
        String[] a = fl.list();
    }
    /**
     * This method takes in three parameters and returns the strings in the file
     * @param f a file
     * @param s a string in the file
     * @param caseSens if the string is case sensitive
     * @return the lines that are matched
     * @throws FileNotFoundException file cannot be found
     * @throws InvalidSearchStringException Invalid String
     */
    private static String grep(File f, String s, boolean caseSens) throws
        FileNotFoundException, InvalidSearchStringException {
        String strings = "Cannot have new line character";
        if (s.contains("\n")) {
            throw new InvalidSearchStringException(strings);
        }
        String lines = "";
        if (f.isFile()) {
            Scanner sc = new Scanner(f);
            int count = 0;
            while (sc.hasNextLine()) {
                count++;
                String string = sc.nextLine();
                String str = string;
                if (!caseSens) {
                    str = str.toUpperCase();
                    s = s.toUpperCase();
                }
                if (str.contains(s)) {
                    lines = lines + f.getPath() + ":" + count + ":";
                    lines = lines + str + "\n";
                }
            }
            return lines;
        } else {
            File[] array = f.listFiles();
            if (array == null) {
                return lines;
            }
            for (File arrayFile : array) {
                lines = lines + grep(arrayFile, s, caseSens);
            }
            return lines;
        }
    }
}
/**
 * This class represents an InvalidSearchStringException extends Exception.
 * @author Aurora
 *
 */
class InvalidSearchStringException extends Exception {
    public InvalidSearchStringException(String errorMessage) {
        super(errorMessage);
    }
}
