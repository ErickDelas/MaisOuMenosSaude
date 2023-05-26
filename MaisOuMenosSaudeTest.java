/*
Vamos deixar alguns comentarios nas classes para explicar a nossa ideia e tentar
ficar facil entender!
*/

package maisoumenossaude;

import java.util.Scanner;

public class MaisOuMenosSaudeTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Menu m = new Menu();
        int opcao = -1;
        
        while(opcao!=0){
            Menu.exibeMenu();
            opcao = sc.nextInt();
            
            if(opcao==0){
                System.out.print("\n--------------------------\n");
                System.out.println("Você finalizou a sessão!");
                System.out.print("--------------------------\n");
                break;
            } else {                
                m.executaAcao(opcao);
            }
        }
    }
}