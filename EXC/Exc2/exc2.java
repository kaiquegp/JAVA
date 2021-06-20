import java.util.*;
public class exc2 {
    public static void main(String[] args) {	

	/*2. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.*/

        Scanner sc = new Scanner(System.in); 

        System.out.print("Informe o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("Informe o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.print("Informe o terceiro numero: ");
        int n3 = sc.nextInt();

        if (n1>n2 && n1>n3){
                System.out.println("O maior numero e " + n1);
            }

            else if (n2>n1 && n2>n3) {
                System.out.println("O maior numero e " + n2);
            }

            else{
                System.out.println("O maior numero e " + n3);
            }
    }
}