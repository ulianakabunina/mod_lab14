import java.util.Scanner;
import java.util.regex.Pattern;
import  java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите количество айпишников: ");
        int n = in1.nextInt();

        String[] adresses = new String[n];
        System.out.println("Введите айпишники: ");
        for (int i = 0; i < n; i++) {
            adresses[i] = in2.nextLine();
        }

        String reg = "^((25[0-5]|2[0-4][0-9]|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4][0-9]|1\\d\\d|[1-9]?\\d)$";

        Pattern pattern = Pattern.compile(reg);
        System.out.println("Найденные IP-адреса в массиве:");
        for (String ip : adresses) {
            Matcher mat = pattern.matcher(ip);
            if (mat.matches()) {
                System.out.println(ip);
            }
        }
    }
}