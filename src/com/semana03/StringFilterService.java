package com.semana03;

import java.util.ArrayList;
import java.util.List;

public class StringFilterService {
    public List<String> filtrarPorCaractere(List<String> lista, char caractere) {
        List<String> resultado = new ArrayList<>();

        for (String palavra : lista) {
            if (!palavra.isEmpty() && palavra.charAt(0) == caractere) {
                resultado.add(palavra);
            }
        }

        return resultado;
    }
}
