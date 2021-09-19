import java.util.Scanner;

public class BebekUntukTeman {
    public static void main(String[] args) {
        int A, B, jatah, sisa;
       
        Scanner bebek = new Scanner(System.in);
        A = bebek.nextInt();
        B = bebek.nextInt();
       
        jatah = A/B;
        sisa = A%B;

        System.out.println("masing-masing " +jatah);
        System.out.println("bersisa " +sisa);

    }
    
}