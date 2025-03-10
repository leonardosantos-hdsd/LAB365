package com.semana03;

public class CharArrayManipulator {
    public void inverterArray(char[] caracteres) {
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }
    }
}
