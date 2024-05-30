import java.util.Scanner;
public class Discard{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int total = 52;
       int min = total;
       for(int i=0;i<=total;i++){
           if((total - i) % n == 0){
               min = i;
               break;
           }
       }
       System.out.println(min);
   } 
}
