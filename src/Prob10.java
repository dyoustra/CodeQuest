import java.util.Scanner;

public class Prob10 {

    public static int binaryConversion(String s){
        int answer = 0;

        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            int integer = Integer.parseInt(s.substring(i, i+1));
            if (integer == 1){
                int power = (int) Math.pow(2, index);
                answer += power;
            }
            index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            String answer = "";
            int firstBinary = binaryConversion(string.substring(0,8));
            System.out.print(binaryConversion(string.substring(0,8)) + ".");
            System.out.print(binaryConversion(string.substring(8,16)) + ".");
            System.out.print(binaryConversion(string.substring(16,24)) + ".");
            System.out.print(binaryConversion(string.substring(24,32)) + " ");
            if (firstBinary <= 127){
                System.out.println("[Class A]");
            }
            else if (firstBinary >= 128 && firstBinary <= 191){
                System.out.println("[Class A]");
            }
            else if (firstBinary >= 192 && firstBinary <= 239){
                System.out.println("[Class C]");
            }
            else{
                System.out.println("[Class D]");
            }

        }
    }
}
