import java.util. *;
public class Cinema {
/*Jailson é dono de um cinema com duas salas.
A sala Alpha possui 140 lugares divididos em 6 fileiras (A, B, C, D, E, F) com mais 12 assentos para pessoas com deficiência.
A sala Beta possui 120 lugares divididos em 5 fileiras (A, B, C, D, E) com mais 6 lugares para pessoas com deficiência.
Haverá uma sessão na Sala Alpha de "As Branquelas" e outra sessão na Sala Beta de "A Chegada".
Construa um programa em que uma pessoa compre um ingresso para qualquer uma das salas e possa escolher a fileira em que vai sentar.
O programa deve perguntar, em algum momento, o nome do usuário.
Uma vez que o assento seja escolhido, é necessário que o programa exiba quantos lugares ainda estão disponíveis no total e também em quais fileiras.
É importante que o comprador possa escolher a quantidade de ingressos que quer comprar e que ele não possa comprar mais ingressos do que a fileira tenha disponível.
Ao final, o programa deve exibir a mensagem "[COMPRADOR], seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.".
*/
public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);

int[] alphaB = new int[30], alphaC = new int[30], alphaD = new int[20], alphaE = new int[20], alphaF = new int[10], alpha12 = new int[12];
int[] betaA = new int[24], betaB = new int[24], betaC = new int[24], betaD = new int[24], betaE = new int[24], beta6 = new int[6];
String nome = new String();
int  alphaA = 30, contAlphaA = 0, contAlphaB = 0, contAlphaC = 0, contAlphaD = 0, contAlphaE = 0, contAlphaF = 0, contAlphaG = 0 ;
int  contBetaA = 0, contBetaB = 0, contBetaC = 0, contBetaD = 0, contBetaE = 0, contBetaG = 0 ;
int opcao, opcaoAlpha, opcaoBeta, ingresso;

System.out.println ("Bem vindo ao cinema do Jailson!\nDigite seu nome: ");  
	 nome = sc.nextLine();
System.out.println ("Bem vindo " +nome+ "!");  
	
	System.out.println ("\nQual Filme voce quer ver? \n1)As branquelas \n2)A Chegada");  
	opcao = sc.nextInt();
	switch (opcao) {
	case 1:
		System.out.println("Escolha a fileira: \n1)A \n2)B \n3)C \n4)D \n5)E \n6)F \n7)Assento para deficientes");
		opcaoAlpha = sc.nextInt();
		if (opcaoAlpha == 1) {
				for(int x = 0; x < alphaA; x++){
					contAlphaA += 1;
					}
			System.out.println("Total de vagas na fileira A: " +contAlphaA+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contAlphaA) {
				contAlphaA = contAlphaA - ingresso;
				System.out.println("\nVagas restantes na fileira A e: "+contAlphaA);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}
			

		} else if (opcaoAlpha == 2) {
			for(int x = 0; x < alphaB.length; x++){
					contAlphaB += 1;
					}
			System.out.println("Total de vagas na fileira B: " +contAlphaB+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contAlphaB) {
				contAlphaB = contAlphaB - ingresso;
				System.out.println("Total de vagas restantes na fileira B e: "+contAlphaB);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}

		} else if (opcaoAlpha == 3) {
			for(int x = 0; x < alphaC.length; x++){
					contAlphaC += 1;
					}
			System.out.println("Total de vagas na fileira C: " +contAlphaC+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contAlphaC) {
				contAlphaC = contAlphaC - ingresso;
				System.out.println("Total de vagas restantes na fileira C e: "+contAlphaC);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}

		} else if (opcaoAlpha == 4) {
			for(int x = 0; x < alphaD.length; x++){
					contAlphaD += 1;
					}
			System.out.println("Total de vagas na fileira D: " +contAlphaD+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contAlphaD) {
				contAlphaD = contAlphaD - ingresso;
				System.out.println("Total de vagas restantes na fileira D e: "+contAlphaD);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}
		
		} else if (opcaoAlpha == 5) {
			for(int x = 0; x < alphaE.length; x++){
					contAlphaE += 1;
					}
			System.out.println("Total de vagas na fileira E: " +contAlphaE+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contAlphaE) {
				contAlphaE = contAlphaE - ingresso;
				System.out.println("Total de vagas restantes na fileira E e: "+contAlphaE);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}

		} else if (opcaoAlpha == 6) {
			for(int x = 0; x < alphaF.length; x++){
					contAlphaF += 1;
					}
			System.out.println("Total de vagas na fileira F: " +contAlphaF+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contAlphaF) {
				contAlphaF = contAlphaF - ingresso;
				System.out.println("Total de vagas restantes na fileira F e: "+contAlphaF);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}

		} else if (opcaoAlpha == 7) {
			for(int x = 0; x < alpha12.length; x++){
					contAlphaG += 1;
					}
			System.out.println("Total de vagas na fileira 7: " +contAlphaG+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contAlphaG) {
				contAlphaG = contAlphaG - ingresso;
				System.out.println("Total de vagas restantes na fileira 7 e: "+contAlphaG);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}

		} else {
			System.out.println("[ERRO] Fileira invalida!");
		}
		break;

	case 2:
		System.out.println("\nEscolha a fileira: \n1)A \n2)B \n3)C \n4)D \n5)E \n6)Assento para deficientes");
		opcaoBeta = sc.nextInt();
		if (opcaoBeta == 1) {
				for(int x = 0; x < betaA.length; x++){
					contBetaA += 1;
					}
			System.out.println("Total de vagas na fileira A: " +contBetaA+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contBetaA) {
				contBetaA = contBetaA - ingresso;
				System.out.println("Total de vagas restantes na fileira A e: "+contBetaA);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}

		} else if (opcaoBeta == 2) {
			for(int x = 0; x < betaB.length; x++){
					contBetaB += 1;
					}
			System.out.println("Total de vagas na fileira B: " +contBetaB+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contBetaB) {
				contBetaB = contBetaB - ingresso;
				System.out.println("Total de vagas restantes na fileira B e: "+contBetaB);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}

		} else if (opcaoBeta == 3) {
			for(int x = 0; x < betaC.length; x++){
					contBetaC += 1;
					}
			System.out.println("Total de vagas na fileira C: " +contBetaC+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contBetaC) {
				contBetaC = contBetaC - ingresso;
				System.out.println("Total de vagas restantes na fileira C e: "+contBetaC);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}

		} else if (opcaoBeta == 4) {
			for(int x = 0; x < betaD.length; x++){
					contBetaD += 1;
					}
			System.out.println("Total de vagas na fileira D: " +contBetaD+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contBetaD) {
				contBetaD = contBetaD - ingresso;
				System.out.println("Total de vagas restantes na fileira D e: "+contBetaD);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}
		
		} else if (opcaoBeta == 5) {
			for(int x = 0; x < betaE.length; x++){
					contBetaE += 1;
					}
			System.out.println("Total de vagas na fileira E: " +contBetaE+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contBetaE) {
				contBetaE = contBetaE - ingresso;
				System.out.println("Total de vagas restantes na fileira E e: "+contBetaE);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}

		} else if (opcaoBeta == 6) {
			for(int x = 0; x < beta6.length; x++){
					contBetaG += 1;
					}
			System.out.println("Total de vagas na fileira 6: " +contBetaG+ "\nDigite a quantidade de ingressos: ");
			ingresso = sc.nextInt();
			if (ingresso <= contBetaG) {
				contBetaG = contBetaG - ingresso;
				System.out.println("Total de vagas restantes na fileira 6 e: "+contBetaG);
			} else {
				System.out.println("A quantidade de ingressos e maior que o numero de vagas disponiveis \nPor favor digite um numero valido! ");
			}

		} else {
			System.out.println("[ERRO] Fileira invalida!");
		}
		break;
	default:
	 System.out.println("[ERRO] Sessao invalida!");
}
System.out.println(nome+ ", seus ingressos foram comprados com sucesso. Aproveite a pipoca gratis e tenha um bom filme.");
} 
}

