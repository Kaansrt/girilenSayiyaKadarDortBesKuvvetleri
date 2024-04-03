import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number,i=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        number = inp.nextInt();
        System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri : ");
        while (i < number) {
            System.out.print(i + "  ");
            i*=4;
        }
        System.out.println();
        System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri : ");
        for (i = 1; i < number; i *= 5) {
            System.out.print(i+ "  ");
        }

    }
}