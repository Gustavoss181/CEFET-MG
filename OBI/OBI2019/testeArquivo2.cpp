#include <stdio.h>
int main()
{
FILE *fp;
char c;
fp = fopen("arquivo.txt","r");   /* Arquivo ASCII, para leitura */
if(!fp)
{
    printf( "Erro na abertura do arquivo");
}
while((c = getc(fp) ) != EOF)      /* Enquanto n?o chegar ao final do arquivo */
    printf("%c", c);                 /* imprime o caracter lido */
fclose(fp);
return 0;
}
