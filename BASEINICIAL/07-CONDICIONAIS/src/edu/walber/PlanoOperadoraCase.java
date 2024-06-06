package edu.walber;

public class PlanoOperadoraCase {
    public static void main(String[] args) {
        String plano = "B"; // B M T

        switch(plano){
            case "T": {
				System.out.println("5Gb Youtube");
                // break; tirando o break imprime outros que também
                // até encontrar um que tenha break
            }

            case "M": {
				System.out.println("WhatsApp e Instagram grátis");
                //break;
            }
            case "B": {
				System.out.println("100 minutos de ligação");
			}
        }
    }
}
