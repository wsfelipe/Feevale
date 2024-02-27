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
#define qtd_alunos 3

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
    
    struct Aluno aluno[qtd_alunos];
    
    for(int i=0;i<qtd_alunos;i++){
        printf("\nInsira o nome do aluno %d: ",i+1);
        scanf("%[^\n]", aluno[i].nome);
        fflush(stdin);

        printf("\nInsira a prmeira nota do aluno %d: ",i+1);
        scanf("%f", &aluno[i].nota1);
        
        printf("\nInsira a segunda nota do aluno %d: ",i+1);
        scanf("%f", &aluno[i].nota2);
        
        printf("\nInsira a terceira nota do aluno %d: ",i+1);
        scanf("%f", &aluno[i].nota3);
        
        while (getchar() != '\n');
    }
    
    for(int i=0;i<qtd_alunos;i++){
        float media = calcularMedia(aluno[i]);
        printf("\n\nNome: %s\nMedia: %.1f", aluno[i].nome,media);
    }


    
    return 0;
}
