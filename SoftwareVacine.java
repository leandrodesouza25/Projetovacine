package Vacine;

import java.util.Scanner;

public class SoftwareVacine {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int menu, gestante, idade, profissao, regiao, comorbidade, vacina;
		String nome;

		System.out.println(
				"\nBem-vindo ao centro de informação da campanha de vacinação da Covid19 do Estado de São Paulo\n");

		do {
			System.out.println("	=================================================================\r\n"
					+ "	|								|\r\n" + "	|								|\r\n"
					+ "	|	[1] Quando posso me vacinar				|\r\n"
					+ " 	|	[2] Informações sobre os tipos de vacinas		|\r\n"
					+ " 	|	[3] Informações legais					|\r\n"
					+ " 	|	[9] Sair do programa					|\r\n"
					+ "	|								|\r\n" + " 	|								|\r\n"
					+ "	=================================================================");
			System.out.print("\nEscolha a opção > ");
			menu = ler.nextInt();

			if (menu == 1) {

				System.out.print("\nComo podemos te chamar? ");
				nome = ler.next();
				System.out.println("\nOlá, " + nome + "!");
				System.out.print("Informe sua idade: ");
				idade = ler.nextInt();

				do {
					System.out.print("\nInforme sua profissão:\r\n" + "\r\n" + "1 - Área da saúde\r\n"
							+ "2 - Área da educação\r\n" + "3 - Área da segurança pública\r\n"
							+ "4 - Transporte público\r\n" + "5 - Outros\r\n" + "\r\n" + "> ");
					profissao = ler.nextInt();

					if (profissao != 1 && profissao != 2 && profissao != 3 && profissao != 4 && profissao != 5) {
						System.out.println("\nOpção inválida, tente novamente.");
					}

				} while (profissao != 1 && profissao != 2 && profissao != 3 && profissao != 4 && profissao != 5);

				do {
					System.out.print("\nInforme sua Região:\r\n" + "\r\n" + "1 - Grande São Paulo\r\n"
							+ "2 - Outros municípios\r\n" + "\r\n" + "> ");
					regiao = ler.nextInt();
					if (regiao != 1 && regiao != 2) {
						System.out.println("\nOpção inválida, tente novamente.");
					}
				} while (regiao != 1 && regiao != 2);

				do {
					System.out.print("\nVocê possui alguma comorbidade?\r\n" + "\r\n" + "1 - Sim\r\n" + "2 - Não\r\n"
							+ "\r\n" + "> ");
					comorbidade = ler.nextInt();
					if (comorbidade != 1 && comorbidade != 2) {
						System.out.println("\nOpção inválida, tente novamente.");
					}
				} while (comorbidade != 1 && comorbidade != 2);

				do {
					System.out.print("\nVocê é gestante?\r\n" + "\r\n" + "1 - Sim\r\n" + "2 - Não\r\n" + "\r\n" + "> ");
					gestante = ler.nextInt();
					if (gestante != 1 && gestante != 2) {
						System.out.println("\nOpção inválida, tente novamente.");
					}
				} while (gestante != 1 && gestante != 2);

				System.out.println("\n" + nome + ",\n");

				if (idade >= 59 && idade >= 58) {
					System.out.println("Sua idade está dentro do grupo já liberado. ");
				}
				if (idade < 60 && comorbidade == 2 && profissao == 5 && gestante == 2) {
					System.out.println(
							"Atualmente sua idade não está sendo vacinada, segue dados para proxima vacinação. ");
				}
				if (idade < 18 && gestante == 2) {
					System.out.print("No momento não temos planejamento de vacinação para menores de 18 anos. ");
				}
				if (profissao == 1) {
					System.out.print("Sua profissão está em andamento com a vacinação. ");
				}
				if (profissao == 2 && idade >= 18) {
					System.out.print("Sua profissão está em andamento com a vacinação, a partir dos 45 anos. ");
				}
				if (profissao == 3) {
					System.out.print("Sua profissão está em andamento com a vacinação. ");
				}
				if (profissao == 4 && idade >= 47) {
					System.out.print(
							"Sua profissão está em andamento com a vacinação. Consulte a tabela com as datas disponível nas Informações Legais - opção 3. ");
				}
				if (profissao == 5) {
					System.out.print(
							"No momento outras profissões não receberam a classificação de prioritários na lista. ");
				}
				if (regiao == 1) {
					System.out
							.println("Vacinas disponíveis para a grande São Paulo: Astrazeneca, Pfizer e Coronavac. ");
				}
				if (regiao == 2) {
					System.out.println("Vacinas disponíveis para outros municípios: Astrazeneca e Coronavac. ");
				}

				if (comorbidade == 1 && idade >= 18) {
					System.out.print("liberação para todas as idades com comorbidade a partir dos 18 anos. ");
				}
				if (comorbidade == 2 && idade >= 18) {
					System.out.print(
							"Pessoas sem comorbidade ainda deverão esperar pela data de sua faixa etária ou profissão. ");
				}
				if (idade >= 18 && gestante == 1) {
					System.out.print("Gestantes a partir de 18 anos e sem comorbidades já podem se vacinar. ");
				}
				if (idade < 18 && gestante == 1) {
					System.out.print("Gestantes menores de 18 anos e sem comorbidades ainda não podem se vacinar.");
				}

				System.out.println(
						"\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");

			}

			else if (menu == 2) {
				System.out.println(
						"\n	=================================================================================================\r\n"
								+ "	|												|\r\n"
								+ "	|  	Vacinas disponíveis para utilização. Digite o número correspondente à vacina desejada.	|\r\n"
								+ "	|												|\r\n"
								+ "	|	[1] Coronavac										|\r\n"
								+ "	|	[2] Pfizer										|\r\n"
								+ "	|	[3] Astrazeneca										|\r\n"
								+ "	|												|\r\n"
								+ "	|												|\r\n"
								+ "	=================================================================================================");
				System.out.print("\nEscolha a opção > ");
				vacina = ler.nextInt();

				if (vacina == 1) {
					System.out.println("\nCoronaVac: Vírus inativado\r\n\n"
							+ "Vacina que contém o vírus “morto” (inativado) da Covid-19 que ao entrar no organismo, gera uma resposta imunológica.\r\n"
							+ "É a forma mais comum de produzir vacinas.\r\n" + "\r\n"
							+ "O esquema vacinal completo é composto por duas doses. Conforme os estudos clínicos e indicação na bula, o intervalo\r\n"
							+ "entre a primeira e a segunda deve ser de 14 a 28 dias para aplicação da segunda dose. Os anticorpos devem ter níveis\r\n"
							+ "adequados duas semanas após a segunda dose. Por ser uma vacinanova, ainda não está determinada a duração da resposta\r\n"
							+ "imune. O Butantan realiza estudos neste sentido. Não foram registrados eventos adversos graves e de interesse especial\r\n"
							+ "após aplicação. O evento adverso mais comum observado durante os estudos clínicos foi dor no local da aplicação.\r\n"
							+ "Algumas pessoas apresentam febre, dor muscular, náusea e dor de cabeça. \r\n" + "\r\n"
							+ "Como os vacinados demoram cerca de duas semanas para atingir níveis adequados de proteção após a segunda dose, mesmo\r\n"
							+ "que vacinado, se você estiver infectado poderá transmitir o coronavírus para outras pessoas.");
				} else if (vacina == 2) {
					System.out.println("\nPfizer: RNA Mensageiro\r\n\n"
							+ "Essa vacina não utiliza um vírus, mas sim uma molécula, chamada de RNA. Esta molécula leva uma “mensagem” até as \r\n"
							+ "células contendo todas as informações genéticas do vírus. É uma espécie de “manual de instruções” que “ensina” as \r\n"
							+ "células a criar uma defesa contra o vírus. Por ter essa função, ela é denominada de RNA mensageiro. \r\n"
							+ "\r\n"
							+ "O esquema vacinal é composto por duas doses. A segunda dose deve ser administrada 12 semanas após a primeira, conforme\r\n"
							+ "determinação do Ministério da Saúde (o período indicado na bula do fabricante é de 21 dias, mas no Brasil foi adotado\r\n"
							+ "o prazo de 12 semanas para ampliar a oferta da primeira dose na população, com base em discussões técnicas). Os anticorpos\r\n"
							+ "devem  ter níveis adequados 21 dias após aplicação da vacina. Por ser uma vacina nova, ainda não está determinada a duração\r\n"
							+ "da resposta imune. As reações mais comuns que constam em bula são dor ou inchaço no local da injeção, dor de cabeça\r\n"
							+ "e/ou muscular e/ou na articulação, cansaço, diarreia, calafrios e febre. Reações menos comuns incluem vermelhidão no\r\n"
							+ "local de injeção, náusea e vômito. \r\n" + "\r\n"
							+ "Como os vacinados demoram cerca de duas semanas para atingir níveis adequados de proteção após a segunda dose, mesmo\r\n"
							+ "que vacinado, se você estiver infectado poderá transmitir o coronavírus para outras pessoas.");
				} else if (vacina == 3) {
					System.out.println("\nAstrazeneca: Adenovírus não replicante\r\n\n"
							+ "Essa vacina possui um vírus “vivo”, mas não é o coronavírus, e sim o adenovírus presente em chimpanzés. Apesar de vivo,\r\n"
							+ "ele é inofensivo, pois não tem o poder de se multiplicar (replicar). Mesmo assim, o organismo - ao identificar o\r\n"
							+ "“corpo vivo” - projeta carga máxima contra o intruso, o que explica o alto índice de reações adversas (como febre,\r\n"
							+ "calafrios e dores no corpo).\r\n" + "\r\n"
							+ "O esquema vacinal é composto por duas doses. A segunda dose deve ser administrada 12 semanas após a primeira. Os\r\n"
							+ "anticorpos devem ter níveis adequados duas semanas após aplicação da vacina. Por ser uma vacina nova, ainda não \r\n"
							+ "está determinada a duração da resposta imune. As reações adversas mais frequentes reportadas nos estudos clínicos\r\n"
							+ "foram sensibilidade e/ou dor no local da injeção, dor de cabeça e/ou muscular e/ou na articulação, fadiga, mal estar,\r\n"
							+ "febre, calafrios e náusea. A maioria foi de intensidade leve a moderada e geralmente resolvida dentro de poucos dias\r\n"
							+ "após a vacinação.\r\n" + "\r\n"
							+ "Vacinas com mesmo príncipio são as da Oxford e fiocruz.");
				}

				else {
					System.out.println("\nOpção inválida, tente novamente.");
				}

				System.out.println(
						"\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");

			}

			else if (menu == 3) {
				System.out.println("\nTotal de vacinados com a primeira dose: 13.203.153");
				System.out.println("Total de vacinados com a segunda dose: 5.950.243");
				System.out.println("\n16 de junho a 8 de julho – 55 a 59 anos");
				System.out.println("9 a 19 de julho – 54 anos");
				System.out.println("20 de julho a 3 de agosto – 50 a 53 anos");
				System.out.println("4 a 18 de agosto – 45 a 49 anos");
				System.out.println("19 a 28 de agosto – 40 a 44 anos");
				System.out.println("29 de agosto a 7 de setembro – 35 a 39 anos");
				System.out.println("8 a 17 de setembro – 30 a 34 anos");
				System.out.println("18 a 27 de setembro - 25 a 29 anos");
				System.out.println("28 de setembro a 18 de outubro - 18 a 24 anos");
				System.out.println(
						"\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
			}

			else if (menu == 9) {
				System.out.println("\nObrigado por utilizar nosso programa, tenha um ótimo dia.");
			} else {
				System.out.println("\nOpção inválida, tente novamente.\n");
			}
		} while (menu != 9);

		ler.close();
	}
}