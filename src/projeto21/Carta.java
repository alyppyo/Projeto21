/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto21;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alyppyo Coutinho
 */
public class Carta {
    // Atributos
    private String numero;
    private Naipe naipe;
    private int valor;

    // Construtor padrão
    public Carta() {}
    
    // Set único
    public void setCarta(String numero, Naipe naipe, int valor) {
        this.numero = numero;
        this.naipe = naipe;
        this.valor = valor;
    }
    
    // Sobrecarga do set
    public void setCarta(String numero, Naipe naipe) {
        try {
            int num = valorCarta(numero);
            setCarta(numero, naipe, num);
        } catch (ExcecaoCartaInexistente ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    
    // Converter identificação da carta em seu valor
    private int valorCarta(String numero) throws ExcecaoCartaInexistente {
        switch(numero) {
            case "A": return 1;
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10": return Integer.parseInt(numero);
            case "J":
            case "Q":
            case "K": return 10;
            default:
                throw new ExcecaoCartaInexistente();
        }
    }
    
    // Getters
    public String getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public int getValor() {
        return valor;
    }
}
