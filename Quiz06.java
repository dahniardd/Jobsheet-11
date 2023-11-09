import java.util.Scanner;
import java.util.Random;
public class Quiz06 {
    public static void main(String[]Args){

    Random random = new Random();
    Scanner input06 = new Scanner(System.in);
    
    char menu = 'y' ;
    do{
        int number = random.nextInt(10)+1;
        boolean success = false;
        do{
            System.out.print("Tebak angka (1-10): ");
            int answer = input06.nextInt();
            input06.nextLine();
            success = (answer==number);
        }while(!success);
        System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
        menu = input06.nextLine().charAt(0);
    }while (menu=='y'|| menu=='Y');
    {

    }  
}
}
