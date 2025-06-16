# Deteccion de Palindromos en Prolog

## Descripcion
Verifica si una cadena es palindromo, ignorando mayusculas y espacios.

## Explicacion

1. **Predicado es_palindromo/1**:
   - Verifica si lista es igual a su reversa

2. **Predicado palindromo/0**:
   - Lee entrada del usuario
   - Procesa la cadena
   - Muestra resultado

## Ejecucion

1. Cargar:
```prolog
consult('palindromo.pl').
para ejecutar
(terminal):swipl palindromo.pl
1?- palindromo.
