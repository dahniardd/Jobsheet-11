import java.util.Scanner;
public class Square06 {
    public static void main(String[]Args){
        Scanner input06 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input06.nextInt();
        
        for(int iOuter=0; iOuter<=N; iOuter++){
            for(int i=1; i<=N; i++){
                System.out.print("*");
           }            
        System.out.println();
}
}
}

