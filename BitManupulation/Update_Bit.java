import java.util.Scanner;
public class Update_bit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 5; //0101
            int pos = 2;
            int oper = sc.nextInt();
            int bitMask =  1<<pos;
            // oper = 1 then set || oper = 0 then clear
            if(oper == 1){
                int newNumber = bitMask | n;
                System.out.println(newNumber);
            }
            else{
                int newBitMask = ~(bitMask);
                int newNumber = newBitMask & n;
                System.out.println(newNumber);
            }
        }

    }
}
