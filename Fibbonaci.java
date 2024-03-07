public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int atual = 1,anterior=0,casa = 7, numero;
		
		
		System.out.print("Digite um numero para verificar se está na sequência de Fibonacci: ");
		numero = scan.nextInt();
		
		for(int i=1;i<=casa;i++) {
				atual= atual+anterior;
				anterior= atual-anterior;
				System.out.print(atual +"|");
				if(numero == atual) {
					System.out.println("\nSeu número faz parte da sequência de Fibonacci! Numero escolhido: "+numero);
					}
				}if(numero != atual) {
					System.out.println("\nNao é da sequência de Fibonacci. Numero escolhido: "+numero);
				}
				
		}
