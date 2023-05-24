package maisoumenossaudetest;

import java.util.Scanner;

public class MaisOuMenosSaudeTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcao = -1;
        
        while(opcao!=0){
            Menu.exibeMenu();
            opcao = sc.nextInt();
            
            if(opcao!=1 || opcao!=2 || opcao!=3 || opcao!= 4){
                break;
            } else if(opcao==0){
                System.out.println("Você finalizou a sessão!");
                break;
            } else {                
                Menu.executaAcao(opcao);
            }
        }
    }
}
