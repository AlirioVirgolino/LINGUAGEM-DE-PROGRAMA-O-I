//Imprima os inteiros de 1 a 20, utilizando um loop while e a variável contadora i. Assuma que a
//variável i foi declarada, mas não foi inicializada. Imprima apenas cinco inteiros por linha. [Dica:
//utilize o cálculo i % 5. Quando o valor dessa expressão for 0, imprima um caractere de nova
//linha; caso contrário, imprima um caractere de tabulação. Assuma que esse código é um
//aplicativo. Utilize o método System.out.println () para imprimir o caractere de nova linha, e utilize
//o método System.out.print ('\t') para imprimir o caractere de tabulação.]
//GRUPO : ALIRIO VIRGOLINO // GITHUB = github.com/AlirioVirgolino
//        ANNA FLAVIA  // GITHUB = github.com/AnnaFlaviamb
//        ANDREW ARTHUR // GITHUB = github.com/andrewarthur16
//        SUELEN LAIS // GITHUB = github.com/Suelenlass
//        Williame Ribeiro // GITHUB = github.com/willribeiroo
public class TED005 {
    public static void main(String[] args) {

    }
    static {
        int i = 1;
        while (i <= 20) {
            System.out.print(i);
            if (i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
            ++i;
        }
        System.out.println("FIM!!!!\n");
    }
}
