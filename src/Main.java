import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] zelenina = {"zeli" , "okurka" , "rajce" , "paprika" , "mrkev"};
        String[] ovoce = {"jablko" , "hruska" , "pomeranc" , "jahoda" , "banan"};
        System.out.println("Zadej nazev ovoce nebo zeleniny");
        String nazev = sc.nextLine();
        if (nazev = ovoce) {
            System.out.println("Tohle je ovoce");
        }
            else if (nazev = zelenina){
            System.out.println("Tohle je zelenina");
        }
            else {
            System.out.println("Neznam");
        }
    }
}