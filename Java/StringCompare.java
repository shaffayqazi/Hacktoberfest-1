import java.util.Scanner;
public class StringCompare {
  static   String word;
   static    String paragragh = "Hello my name is World";

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        word = sc.nextLine();

            if (word.equals(paragragh))
            {
                System.out.println("Correct");
            }

    }


}
