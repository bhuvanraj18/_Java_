import java.util.Scanner;
public class HappyNewYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int m = sc.nextInt();
        
        int Hr = 24-H;
        int Time = (Hr*60)-m;
        System.out.println(Time);
    }
}
