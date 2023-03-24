import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            {
                System.out.println("Запишите дату по форме: dd/mm/yyyy:");
                String date = scanner.nextLine();

                Pattern pt= Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d");
                Matcher m=pt.matcher(date);
                if ( m.matches() == true){
                    System.out.println("Выражение, которые вы ввели, является датой");
                }else{
                    System.out.println("Выражение, которое вы ввели, не является датой");
                }


            }
        }
    }
}