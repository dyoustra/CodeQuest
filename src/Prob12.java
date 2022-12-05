import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Prob12 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Prob12.in.txt"));

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String lineCleaned = line.substring(line.indexOf("<") + 1, line.indexOf(">"));
            if (line.contains("<") && !line.contains("/")){
                if (map.containsKey(lineCleaned)){
                    map.put(lineCleaned, map.get(lineCleaned) + 1);
                }else{
                    map.put(lineCleaned, 1);
                }
            }
        }

        for (String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}
