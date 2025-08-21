import java.util.*;

public class learning6 {
    public static void main(String[] args){
        System.out.print("Give me your name: ");
        Scanner scout = new Scanner(System.in);
        String name = scout.nextLine();
        if (name.equals("Cristian")){ 
            System.out.println("My brother, come join me. In battle we are stronger.");
        }
        
        while (name.equals("")){
                System.out.println("Empty");
                System.out.print("Give me your name: ");
                name = scout.nextLine();
        }
    
        System.out.println("Hello, " + name + "!");
        scout.close();
    }
}
