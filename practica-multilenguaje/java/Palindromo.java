import java.util.Scanner;

public class Palindromo {

    public static boolean esPalindromo(String texto) {
        // Eliminar espacios y convertir a minúsculas
        String textoProcesado = texto.replaceAll("\\s+", "").toLowerCase();

        int izquierda = 0;
        int derecha = textoProcesado.length() - 1;

        while (izquierda < derecha) {
            if (textoProcesado.charAt(izquierda) != textoProcesado.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase para verificar si es palíndromo:");
        String entrada = scanner.nextLine();

        if (esPalindromo(entrada)) {
            System.out.println("'" + entrada + "' es un palíndromo.");
        } else {
            System.out.println("'" + entrada + "' no es un palíndromo.");
        }

        scanner.close();
    }
}