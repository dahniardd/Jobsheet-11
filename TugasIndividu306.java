import java.util.Scanner;
public class TugasIndividu306 {
    public static void main (String[]Args){
        Scanner input06 = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3) : ");
        int N = input06.nextInt();

        if (N < 3){
        }
        for (int i = 1; i <= N; i++){
            for (int j =1; j <= N; j++){
                if (i == 1 || i == N || j == 1 || j == N){
                System.out.print(N);
                } else {
                System.out.print("*");
                }
            }
        System.out.println();
}
    }
}
