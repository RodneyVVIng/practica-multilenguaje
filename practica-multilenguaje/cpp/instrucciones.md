# Deteccion de Palindromos en C++

## Descripcion
Verifica si una cadena es palindromo, ignorando mayusculas y espacios.

## Explicacion

1. **Funcion esPalindromo**:
   - Elimina espacios con remove_if
   - Convierte a minusculas con transform
   - Compara caracteres extremos

2. **Funcion main**:
   - Lee entrada con getline
   - Llama a esPalindromo()
   - Muestra resultado

## Compilacion y ejecucion
Tomar en cuenta que previamente se tiene que tener instalado el g++ con el mingw que son las herramientas principales para poder ejecutar y compilar cpp en el editor de codigo VS.
De igual manera haber agregado la ruta /bin al path de los editores de variables de entorno
1. Compilar:

bash

g++ palindromo.cpp -o palindromo 

(esta linea de codigo compila y genera el archivo ejecutable -o palindromo es para asignarle ese nombre)

3. Ejecucion
 
 ./palindromo.exe
