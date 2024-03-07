public static void main(String[] args) {
		String palavra = "Hello";
		String inverterPalavra = inverterString(palavra);
		System.out.println("String original: "+palavra);
		System.out.println("String invertida: "+inverterPalavra);
		
		}
	
	 public static String inverterString(String str) {
	
	        char[] caracteres = str.toCharArray();
	        int i = 0;
	        int j = str.length() - 1;
	        while (i < j) {
	            char temp = caracteres[i];
	            caracteres[i] = caracteres[j];
	            caracteres[j] = temp;
	            i++;
	            j--;
	        }

	 
	        return new String(caracteres);
	    }
}
