import java.util.Scanner;

public class Prob02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            String answer = "";
            answer += string.substring(string.length() - 1);
            for (int i = string.length() - 2; i >= 0; i--) {
                answer += string.substring(i, i+1);
            }
            System.out.println(answer);
        }
    }
}
