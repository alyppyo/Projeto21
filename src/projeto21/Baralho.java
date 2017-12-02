/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Alyppyo Coutinho
 */
public class Baralho {
    // Atributos
    private List<Carta> cartas;

    // Construtor
    public Baralho() {
        // Instanciar as cartas
        cartas = new ArrayList<Carta>();
        
        for(int j = 0; j < 4; j++) {
            for(int i = 1; i < 14; i++) {
                Carta carta = new Carta();
                //carta.setCarta(numeroDaCarta(i), naipeDaCarta(j), Integer.min(i, 10));
                carta.setCarta(numeroDaCarta(i), naipeDaCarta(j));
                cartas.add(carta);
            }
        }
    }
    
    private String numeroDaCarta(int numero) {
        switch(numero) {
            case 1:  return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
        }
        
        return numero+"";
    }
    
    private Naipe naipeDaCarta(int naipe) {
        switch(naipe) {
            case 0:  return Naipe.ESPADAS;
            case 1:  return Naipe.OUROS;
            case 2:  return Naipe.PAUS;
            default: return Naipe.COPAS;
        }
    }
    
    public void listarCartas(){
        for (Carta c : this.cartas) 
            System.out.println(c.getNumero() +" de "+c.getNaipe() +". Valor: "+ c.getValor());
    }
    
    public Carta pegarCarta() {
        return cartas.remove(0);
    }
    
    public void embaralhar() {
        Collections.shuffle(cartas);
    }
}
