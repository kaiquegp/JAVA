import java.util. *;
public class exc3 {
public static void main (String [] args) { 
/*3. Faça um programa que leia 3 valores (considere que não serão informados valores iguais) e escreva a soma dos 2 maiores.*/ 

Scanner sc = new Scanner (System.in);
System.out.println ("Informe o primeiro valor: ");  
		int n1 = sc.nextInt(); 
System.out.println ("Informe o segundo valor: ");  
		int n2 = sc.nextInt(); 
System.out.println ("Informe o terceiro valor: ");  
		int n3 = sc.nextInt(); 
if (n1 < n2 && n1 < n3) {
        int soma = n2 + n3;
System.out.println ("A soma dos dois maiores valores "+n2+" e "+n3+" e: " + soma);    
}
else if (n2 < n1 && n2 < n3) {
        int soma = n1 + n3;
System.out.println ("A soma dos dois maiores valores "+n1+" e "+n3+" e: " + soma);    
}
else {
        int soma = n1 + n2;
System.out.println ("A soma dos dois maiores valores "+n1+" e "+n2+" e: " + soma);  
}
}
}