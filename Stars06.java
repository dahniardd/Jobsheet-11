import java.util.Scanner;
public class Stars06{
    public static void main(String[] Args){
        Scanner input06 = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N = ");
        int N = input06.nextInt();

        for(int i=0; i<=N;i++){
            System.out.print("*");
        }
    }
}