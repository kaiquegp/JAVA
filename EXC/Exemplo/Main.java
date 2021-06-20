public class exc1 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("Informe o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("Informe o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.print("Informe o terceiro numero: ");
        int n3 = sc.nextInt();

        if (n1>n2 && n1>n3) {
                System.out.println("O maior número é " + n1);
            }

            else if (n2>n1 && n2>n3) {
                System.out.println("O maior número é" + n2);
            }

            else{
                System.out.println("O maior numero e " + n3);
            }
    }
}