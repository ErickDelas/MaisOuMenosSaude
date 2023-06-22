/*
Vamos deixar alguns comentarios nas classes para explicar a nossa ideia e tentar
ficar facil entender!
 */
package maisoumenossaude;

import java.util.Scanner;

public class MaisOuMenosSaudeTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuarios.inciarUsuarios();

        int opcao = -1;
        while (opcao != 0) {
            Menu.exibeMenuInicial();
            opcao = sc.nextInt();
            switch (opcao){
                case 1: 
                    Usuarios.fazerLogin();
                    break;
                case 0: 
                    Menu.msgFinal();
                    break;
            }
        }
    }
}
