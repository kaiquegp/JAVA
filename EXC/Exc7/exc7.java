import java.util. *;
public class exc7 {
/*7. Faça um programa que leia 10 números que o usuário vai informar. Todos os números lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada.
*/
public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);

float[] vet = new float[10];
float res = 0;

for(int x = 0; x < vet.length; x++){
	System.out.println ("Informe o valor "+(x+1)+" : ");  
	vet[x] = sc.nextFloat(); 
	if (vet[x] < 40){
	res = res + vet[x];
	}
}
System.out.println ("A soma dos numeros menores que 40 e " + res);  
}
}