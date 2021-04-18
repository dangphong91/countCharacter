import java.util.*;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String check = scanner.nextLine();
        int count = 1;
        char[] test = new char[check.length()];
        for (int i = 0; i < check.length(); i++) {
            test[i] = check.charAt(i);
        }
        Arrays.sort(test);
        for (int i = 0; i < test.length; i++) {
            if (i == test.length-1) {
                System.out.print("'" + test[i] + "'" + " - " + count);
            }
            else {
                if (test[i] == test[i+1]) {
                    count++;
                }
                else {
                    System.out.print("'" + test[i] + "'" + " - " + count + " ,");
                    count =1;
                }
            }
        }
    }
}
