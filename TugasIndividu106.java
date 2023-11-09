import java.util.Scanner;
public class TugasIndividu106 {
   public static void main (String[] Args){
    Scanner input06 = new Scanner(System.in);

    System.out.print("Masukkan Nilai N (minimal 3): ");
    int N = input06.nextInt();

    for (int i = 1; i <= N; i++) { 
        for (int j = N; j > 1; j--){
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) { 
            System.out.print (j);
        }
            System.out.println();
   } 
   }
}
