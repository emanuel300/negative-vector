package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = ler.nextInt();
        double[] vet = new double[n];

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite o Número:");
            vet[i] = ler.nextDouble();
        }

        System.out.println();

        for (int i = 0; i < vet.length; i++){
            if (vet[i] < 0){
                System.out.println("Números Negativos: " + vet[i]);
            }
        }

        ler.close();
    }
}
