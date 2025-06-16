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

1. Compilar:
```bash
g++ palindromo.cpp -o palindromo