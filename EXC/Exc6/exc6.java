import java.util. *;
public class exc6 {
/*6. Faça um programa em Java que leia 10 números informados pelo usuário e ao final da leitura escrever a soma total dos 10 números lidos.
*/
public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);

float[] vet = new float[10];
float res = 0;

for(int x = 0; x < vet.length; x++){
	System.out.println ("Informe o valor "+(x+1)+" : ");  
	vet[x] = sc.nextFloat(); 
	res = res + vet[x];
}
System.out.println ("A soma de todos os numeros e " + res);  
}
}