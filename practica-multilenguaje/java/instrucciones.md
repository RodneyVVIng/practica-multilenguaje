# Detección de Palíndromos en Java

## Descripción del problema
Un palíndromo es una palabra, frase, número u otra secuencia de caracteres que se lee igual hacia adelante que hacia atrás. Este programa verifica si una cadena ingresada por el usuario es un palíndromo, ignorando mayúsculas/minúsculas y espacios.

## Explicación del código paso a paso

1. **Método esPalindromo**:
   - Recibe un String como parámetro.
   - Elimina todos los espacios y convierte el texto a minúsculas.
   - Compara los caracteres desde ambos extremos hacia el centro.
   - Retorna true si todos los caracteres coinciden, false en caso contrario.

2. **Método main**:
   - Crea un Scanner para leer la entrada del usuario.
   - Solicita al usuario que ingrese una palabra o frase.
   - Llama al método esPalindromo con la entrada del usuario.
   - Muestra el resultado al usuario.

## Compilación y ejecución

1. **Compilación**:
   ```bash
   javac Palindromo.java
   java Palindromo