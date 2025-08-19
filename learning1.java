import java.util.*;

public class learning1 {
    public static void main(String[] args){
        System.out.println("Give me an integer: ");
        Scanner entry = new Scanner(System.in);
        int answer0 = entry.nextInt();
        System.out.print("The number is: ");
        System.out.println(answer0);
        System.out.print("Give me a string: ");
        entry.nextLine();
        String answer1 = entry.nextLine();
        System.out.print(answer1);  

        entry.close();
    }
}
