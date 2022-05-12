import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] zelenina = {"zeli" , "okurka" , "rajce" , "paprika" , "mrkev"};
        String[] ovoce = {"jablko" , "hruska" , "pomeranc" , "jahoda" , "banan"};
        System.out.println("Zadej nazev ovoce nebo zeleniny");
        String nazev = sc.nextLine();
        Arrays.sort(zelenina);
        Arrays.sort(ovoce);
        int poziceZ = Arrays.binarySearch(zelenina, nazev);
        int poziceO = Arrays.binarySearch(ovoce, nazev);
        System.out.println(poziceZ);
        System.out.println(poziceO);
        if (poziceZ>= 0 ){
            System.out.println("To je zelenina");
        }
        else if (poziceO>= 0){
            System.out.println("To je ovoce");
        }
        else{
            System.out.println("neznam");
        }
    }
}