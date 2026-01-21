import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int score = 0;
        System.out.println("🔥 MATH QUIZ - 5 Questions! 🔥");
        
        for(int i=1; i<=5; i++) {
            int a = 1 + r.nextInt(10);
            int b = 1 + r.nextInt(10);
            System.out.print("Q"+i+": "+a+" + "+b+" = ");
            int ans = sc.nextInt();
            if(ans == (a+b)) { score++; System.out.println("✅ Correct!"); }
            else System.out.println("❌ Wrong! ("+(a+b)+")");
        }
        System.out.println(" Score: "+score+"/5");
        if(score==5) System.out.println("🏆 PERFECT!");
        sc.close();
    }
}