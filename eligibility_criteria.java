import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int P = input.nextInt();
        int C = input.nextInt();
        Boolean value = (M >= 70) && (P >= 60) && (C >= 60);
        Boolean value2 = (M + P + C) >= 180;
        if (value || value2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}