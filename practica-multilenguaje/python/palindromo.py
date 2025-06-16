def es_palindromo(texto):
    texto_procesado = texto.replace(" ", "").lower()
    return texto_procesado == texto_procesado[::-1]

if __name__ == "__main__":
    entrada = input("Ingrese una palabra o frase para verificar si es palindromo:\n")
    
    if es_palindromo(entrada):
        print(f"'{entrada}' es un palindromo.")
    else:
        print(f"'{entrada}' no es un palindromo.")