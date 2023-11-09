import java.util.Scanner;
public class Square06 {
    public static void main(String[]Args){
        Scanner input06 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input06.nextInt();
        
        for(int iOuter=1; iOuter<=N; iOuter++){
            for(int i=0; i<=N; i++){
                System.out.print("*");
           }            
        System.out.println();
}
}
}

