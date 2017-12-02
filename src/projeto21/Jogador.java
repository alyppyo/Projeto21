/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto21;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alyppyo Coutinho
 */
public class Jogador {
    // Atributos
    private String nome;
    private List<Carta> cartasSacadas;
    
    // Construtor
    public Jogador() {
        cartasSacadas = new ArrayList<Carta>();
    }
    
    // Construtor extra
    public Jogador(String nome) {
        this.nome = nome;
        cartasSacadas = new ArrayList<Carta>();
    }
    
    // Obter pontos do jogador
    public int getPontos() {
        // Declaração de variáveis
        int pontos = 0;
        
        // Percorrer as cartas sacadas
        for(Carta c : cartasSacadas)
            pontos += c.getValor();
        
        // Retornar pontuação
        return pontos;
    }
    
    // Adicionar cartas sacadas durante o jogo
    public void adicionarCartaSacada(Carta c) {
        cartasSacadas.add(c);
    }
}
