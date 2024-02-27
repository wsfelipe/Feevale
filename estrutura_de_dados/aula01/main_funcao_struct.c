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

struct Aluno {
    char nome[TAM];
    float nota1;
    float nota2;
    float nota3;
};

float calcularMedia(struct Aluno aluno) {
    return (aluno.nota1+aluno.nota2+aluno.nota3)/3;    
}

int main() {
    
    struct Aluno aluno;
    
    printf("\nInsira o nome do aluno: ");
    scanf("%[^\n]", aluno.nome);
    fflush(stdin);
    printf("\nInsira a prmeira nota do aluno: ");
    scanf("%f", &aluno.nota1);
    printf("\nInsira a segunda nota do aluno: ");
    scanf("%f", &aluno.nota2);
    printf("\nInsira a terceira nota do aluno: ");
    scanf("%f", &aluno.nota3);
    float media = calcularMedia(aluno);
    printf("\n\nNome: %s\nMedia: %.1f", aluno.nome,media);


    
    return 0;
}
