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
}
