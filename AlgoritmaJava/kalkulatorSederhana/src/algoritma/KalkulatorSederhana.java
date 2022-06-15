package algoritma;

import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Azura Kalkulator");

        // input data pertama
        System.out.print("Masukan angka pertama: ");
        double num1 = input.nextDouble();
        // pilih operasi
        System.out.print("Masukan operasi: (+, -, *, /, %): ");
        char operator = input.next().charAt(0);
        // input data kedua
        System.out.print("Masukan angka kedua: ");
        double num2 = input.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
        }
        System.out.print("Hasilnya adalah: " + result);
    }
}
