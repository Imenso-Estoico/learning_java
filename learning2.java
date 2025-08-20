import java.util.*;

public class learning2 {

    public static String answer(int number){
        return ("I win regardless of your choice.");        
    } 
    public static void main(String[] args){
        System.out.println("Obey me, world!");
        System.out.println("Obey me, subjects!");
        System.out.println("1-Yes. 2-No.");
        
        Scanner scanner = new Scanner(System.in);
        int your_answer = scanner.nextInt();

        String gets = answer(your_answer);

        System.out.println(gets);

        scanner.close();
    }
}