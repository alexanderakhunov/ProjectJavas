import java.util.List;
import java.util.Scanner;

public class Shop implements Console {
    private List<Laptop> laptops;
    public void addInShop(List<Laptop> item){this.laptops = item;}
    public Laptop getFromShop(List <Laptop> laptops){
        System.out.println("Choose number \n 1- \n 2- \n 3- \n 4- \n 5-");
        Scanner sc1 = new Scanner(System.in);
        int numbCons = sc1.nextInt();
        if(numbCons == 1){
            System.out.println("123");
        }
        return null;
    }

}
