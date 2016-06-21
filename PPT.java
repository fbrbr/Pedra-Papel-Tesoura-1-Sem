import java.util.Scanner;
import java.util.Random;
/**
 * Pedra, Papel, Tesoura. Usuário contra computador.
 * 
 * @author Hildor Jr.
 * @version (1.0)
 */
public class PPT{
    public static void main(String[] args){
        int dnv ;
    do{
        Scanner in = new Scanner(System.in);
        int x = 1337;
        dnv = 1337;
        
        //Prints iniciais.
        System.out.print("\f---------------------------\n");
        System.out.print("PEDRA, PAPEL, TESOURA\n");
        System.out.print("---------------------------\n");
        System.out.print("Para jogar, digite: \n");
        System.out.print("'0' para selecionar PEDRA\n");
        System.out.print("'1' para selecionar PAPEL\n");
        System.out.print("'2' para selecionar TESOURA\n");
        System.out.print("---------------------------\n");
        
        //Jogada do usuario.
        do{
            System.out.print("Sua jogada: ");
            x = in.nextInt();
        }while(x < 0 || x > 2);
        
        //Jogada aleatoria do computador.
        Random jogadaComputador = new Random();
        int y = jogadaComputador.nextInt(2);
        System.out.print("Jogada do computador: " + y + "\n\n");
        
        //Pausa
        Pausa(1000);
        
        //Define quem ganha.
        //Usuario escolhe pedra.
        if(x == 0){
            //Computador escolhe pedra.
            if(y == 0){
                System.out.print("Você escolheu pedra e o computador também.\n");
                Pausa(1000);
                System.out.print("O JOGO EMPATOU");
            }
            //Computador escolhe papel.
            if(y == 1){
                System.out.print("Você escolheu pedra e o computador escolheu papel. Papel cobre pedra.\n");
                Pausa(1000);
                System.out.print("VOCÊ PERDEU");
            }
            //Computador escolhe tesoura.
            if(y == 2){
                System.out.print("Você escolheu pedra e o computador escolheu tesoura, pedra quebra tesoura.\n");
                Pausa(1000);
                System.out.print("VOCÊ GANHOU");
            }
        }
        //Usuario escolhe papel.
        if(x == 1){
            //Computador escolhe pedra.
            if(y == 0){
                System.out.print("Você escolheu papel e o computador escolheu pedra. Papel cobre pedra.\n");
                Pausa(1000);
                System.out.print("VOCÊ GANHOU");
            }
            //Computador escolhe papel.
            if(y == 1){
                System.out.print("Você escolheu papel e o computador também.\n");
                Pausa(1000);
                System.out.print("O JOGO EMPATOU");
            }
            //Computador escolhe tesoura.
            if(y == 2){
                System.out.print("Você escolheu papel e o computador escolheu tesoura, tesoura corta papel.\n");
                Pausa(1000);
                System.out.print("VOCÊ PERDEU");
            }
        }
        //Usuario escolhe tesoura.
        if(x == 2){
            //Computador escolhe pedra.
            if(y == 0){
                System.out.print("Você escolheu tesoura e o computador escolheu pedra. Pedra quebra tesoura.\n");
                Pausa(1000);
                System.out.print("VOCÊ PERDEU");
            }
            //Computador escolhe papel.
            if(y == 1){
                System.out.print("Você escolheu tesoura e o computador escolheu papel. Tesoura corta papel.\n");
                Pausa(1000);
                System.out.print("VOCÊ GANHOU");
            }
            //Computador escolhe tesoura.
            if(y == 2){
                System.out.print("Você escolheu tesoura e o computador escolheu tesoura, pedra quebra tesoura.\n");
                Pausa(1000);
                System.out.print("O JOGO EMPATOU");
            }
        }
        
        //Verifica se o usuario deseja jogar novamente.
        System.out.print("\n\nSe você deseja jogar novamente digite '1': ");
        dnv = in.nextInt();
    }while(dnv == 1);
    }
   
    //Código do StackOverflow usado para criar pausas entre as ações.
    public static void Pausa(int n){
        try {
            Thread.sleep(n);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}