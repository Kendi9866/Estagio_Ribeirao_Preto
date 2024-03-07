public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int atual = 1,anterior=0,casa = 8, numero;
		
		
		System.out.print("Digite um numero para verificar se está na sequência de Fibonacci: ");
		numero = scan.nextInt();
		
		for(int i=1;i<=casa;i++) {
				atual= atual+anterior;
				anterior= atual-anterior;
				System.out.print(atual +"|");
				if(numero == atual) {
					System.out.println("\nSeu número faz parte da sequência de Fibonacci! Numero escolhido: "+numero);
					}else if(i==casa) {
						System.out.println("\n Seu numero nao faz parte da sequência de Fibonacci!");
				}
					
				}
				
		}
