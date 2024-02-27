/******************************************************************************

aula 01

ler 2 notas do aluno
ler nome do aluno
calcular media
publicar o nome do aluno e a media dele

*******************************************************************************/
#include <stdio.h>
#include <stdlib.h>
#define TAM 30

float media(float nota1, float nota2) {
    return (nota1+nota2)/2;
}

int main() {
    
    float nota1, nota2;
    char nome[TAM];
    
    printf("\nInsira o nome do aluno: ");
    scanf("%[^\n]", nome);
    printf("\nInsira a prmeira nota do aluno: ");
    scanf("%f", &nota1);
    printf("\nInsira a segunda nota do aluno: ");
    scanf("%f", &nota2);
    printf("\n\nNome: %s\nMedia: %.1f", nome, media(nota1,nota2));


    
    return 0;
}
