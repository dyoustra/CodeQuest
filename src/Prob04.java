import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob04 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Prob04.in.txt"));
        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            string = string.replace(',', ' ');
            Scanner line = new Scanner(string);
            ArrayList<Integer> arr = new ArrayList<>();
            while (line.hasNext()) {
                arr.add(line.nextInt());
            }
            arr.sort(Integer::compareTo);
            String result = "";
            for (int i = 0; i < arr.size(); i++) {
                result += (arr.get(i) + ",");
            }
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }
    }
}
