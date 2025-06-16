es_palindromo(Lista) :- reverse(Lista, Lista).

palindromo :-
    write('Ingrese una palabra o frase:'), nl,
    read_line_to_string(user_input, Cadena),
    string_lower(Cadena, CadenaMinusculas),
    re_replace("\\s"/g, "", CadenaMinusculas, CadenaSinEspacios),
    string_chars(CadenaSinEspacios, ListaCaracteres),
    (   es_palindromo(ListaCaracteres)
    ->  format("'~s' es palindromo.", [Cadena])
    ;   format("'~s' no es palindromo.", [Cadena])
    ).