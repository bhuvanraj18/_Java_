import java.util.Scanner;

public class Solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int i=1;i<=m;i++){
            //Spaces
        for(int j=1;j<=m-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=5;k++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
