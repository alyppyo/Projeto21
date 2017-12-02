/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoblackjack;

import java.util.Scanner;

/**
 *
 * @author Kayo
 */
public class Mesa {
    private Jogador jogador1;
    private Jogador jogador2;
    private Baralho baralho;
    
    Mesa(){
        jogador1 = new Jogador();
        jogador1.setNome("Jogador 1");
        jogador2 = new Jogador();
        jogador2.setNome("Jogador 2");
        baralho = new Baralho();
    }
    
    private void mostrarPlacar(){
        System.out.println("Jogador1: "+this.jogador1.getPontos());
        System.out.println("Jogador2: "+this.jogador2.getPontos());
    }
    
    public void jogar() {
        this.baralho.embaralhar(); //embaralha as cartas
        boolean ambosPararam = true; //variágvel de controle
        Scanner leitor = new Scanner(System.in); //ler teclado dos jogadores
        String opcao; //ler opção dos jogadores
        Carta carta1 = new Carta(); //Carta sacada pelo jogador1
        Carta carta2 = new Carta(); //Carta sacada pelo jogador2
        do{
            System.out.println("\n\n\n");
            this.mostrarPlacar(); //mostra o placar
            ambosPararam=true;
            //Jogador 1
            System.out.println("JOGADOR 1: Deseja Puxar a Carta? 1- Sim; \t 2- Não");
            opcao = leitor.nextLine(); //ler o teclado
            if (opcao.equals("1")) {
                //deseja puxar carta. Puxa a carta, retira do baralho, adiciona no jogador e mostra placar atual.
                ambosPararam = false; //ambos não pararam porque o jogador1 já puxou carta
                try{
                    carta1 = this.baralho.pegarCarta(); //Jogador1 pegou carta.
                }
                catch(ExcecaoBaralhoVazio ex){
                    System.out.println(ex.getMessage());
                    System.exit(0);
                }
                
                jogador1.adicionarCartaSacada(carta1); //jogador1 adicionou sua carta sacada ao seu montante
            }
            else{
                System.out.println("Jogador não puxou carta");
                ambosPararam = ambosPararam && true;
            }
           
            if (jogador1.getPontos()>=21)
                ambosPararam = true;
            else{
                //Jogador 2
                System.out.println("\n\n\n");
                this.mostrarPlacar();
                System.out.println("JOGADOR 2: Deseja Puxar a Carta? 1- Sim; \t 2- Não");
                opcao = leitor.nextLine(); //ler o teclado
                if (opcao.equals("1")) {
                    //deseja puxar carta. Puxa a carta, retira do baralho, adiciona no jogador e mostra placar atual.
                    ambosPararam = false; //ambos não pararam porque o jogador1 já puxou carta
                    try{
                        carta2 = this.baralho.pegarCarta(); //Jogador1 pegou carta.
                    }
                    catch(ExcecaoBaralhoVazio ex){
                        System.out.println(ex.getMessage());
                        System.exit(0);
                    }

                    jogador2.adicionarCartaSacada(carta2); //jogador1 adicionou sua carta sacada ao seu montante
                }
                else{
                    System.out.println("Jogador não puxou carta");
                    ambosPararam = ambosPararam && true;
                }
            }
        } while ( (jogador1.getPontos()<21) && (jogador2.getPontos()<21) && (ambosPararam==false)   );
        
        //Verifica o Vencedor
        System.out.println("PLACAR FINAL");
        this.mostrarPlacar();
        if (jogador1.getPontos()==jogador2.getPontos()) //empate
             System.out.println("EMPATE");
        else{
            if ( (jogador1.getPontos() > jogador2.getPontos()) && jogador1.getPontos()<=21 ) //jogador1 venceu
                     System.out.println("JOGADOR 1 VENCEU");
            else
                 System.out.println("JOGADOR 2 VENCEU"); //jogador2 venceu
        }
   }
}
