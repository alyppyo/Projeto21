/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto21;

/**
 *
 * @author Alyppyo Coutinho
 */
public class Mesa {
    // Atributos
    private Jogador jogador1;
    private Jogador jogador2;
    private Baralho baralho;

    // Construtor padrão
    public Mesa() {
        jogador1 = new Jogador("Wadson");
        jogador2 = new Jogador("Nathan");
        baralho  = new Baralho();
    }
    
    public void jogar() {
        // Embaralhar as cartas
        baralho.embaralhar();
        
        // Game loop
        while(true) {
            // Vez do Jogador 1
            System.out.println("\n> Vez: Jogador 1");
            Carta c = baralho.pegarCarta();
            jogador1.adicionarCartaSacada(c);
            
            if(jogador1.getPontos() >= 21) {
                System.out.println(jogador1.getPontos() == 21 ? "Vitória do Jogador 1!" : "Jogador 1 estourou!");
                break;
            }
            
            imprimirPlacar();
            System.out.println("\n> Vez: Jogador 2");
            
            // Vez do Jogador 2
            c = baralho.pegarCarta();
            jogador2.adicionarCartaSacada(c);
            
            imprimirPlacar();
            
            if(jogador2.getPontos() >= 21) {
                System.out.println(jogador2.getPontos() == 21 ? "Vitória do Jogador 2!" : "Jogador 2 estourou!");
                break;
            }
        }
    }
    
    private void imprimirPlacar() {
        System.out.println("-- Placar --");
        System.out.println("Jogador 1: " + jogador1.getPontos());
        System.out.println("Jogador 2: " + jogador2.getPontos());
    }

}
