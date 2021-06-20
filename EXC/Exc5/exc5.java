import java.util. *;
public class exc5 {
/*5. Escreva um programa em Java que exiba verdadeiro ou falso se os dois números inseridos pelo usuário são positivos ou negativos.
*/

public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);
float n1,n2;
boolean cond;
System.out.println ("Informe o primeiro valor: ");  
		n1 = sc.nextFloat(); 
System.out.println ("Informe o segundo valor: ");  
		n2 = sc.nextFloat(); 
cond = n1 > 0 && n2 > 0 || n1 < 0 && n2 < 0;
System.out.println (cond);  
}
}