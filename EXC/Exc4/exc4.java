import java.util. *;
public class exc4 {
/*4. Faça um programa que receba dois números reais e mostre um menu de opções (Subtrair, Somar, Multiplicar e Dividir), realizando a operação de acordo com a opção escolhida no menu e mostrando o resultado.*/

public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);
double calculo;
double n1,n2;
int opcao;
System.out.println ("Informe o primeiro valor: ");  
		n1 = sc.nextDouble(); 
System.out.println ("Informe o segundo valor: ");  
		n2 = sc.nextDouble(); 
System.out.println ("Escolha uma opcao: 1) Subtracao. 2) Soma. 3) Multiplicacao. 4) Divisao.");  
       	 opcao = sc.nextInt();
switch (opcao) {
      case 1:
        calculo = n1 - n2;
        System.out.println (n1 + " - " + n2 + " = " + calculo);
        break;
      case 2:
        calculo = n1 + n2;
        System.out.println (n1 + " + " + n2 + " = " + calculo);
        break;
      case 3:
        calculo = n1 * n2;
        System.out.println (n1 + " x " + n2 + " = " + calculo);
        break;
      case 4:
        calculo = n1 / n2;
        System.out.println (n1 + " / " + n2 + " = " + calculo);
        break;
      default:
	System.out.println("[ERRO] Valor invalido!");
}
}
}