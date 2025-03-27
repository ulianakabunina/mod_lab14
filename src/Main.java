import java.util.regex.Pattern;
import  java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String str = "Айпи неверный: 1920.456.01.3456; Айпи верный: 92.134.235.250";
        String reg = "\\b(\\d\\d?\\.|1\\d\\d\\.|2[0-4]\\d\\.|25[0-5]){4}\\b";

        Pattern pat = Pattern.compile(reg);
        Matcher mat = pat.matcher(str);

        boolean boo = false;
        while(mat.find()){
            System.out.println("Найденный айпи: " + mat.group());
            boo = true;
        }

        if(!boo){
            System.out.println("Нет айпи");
        }
    }
}