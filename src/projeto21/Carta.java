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
        setCarta(numero, naipe, valorCarta(numero));
    }
    
    // Converter identificação da carta em seu valor
    private int valorCarta(String numero) {
        switch(numero) {
            case "A": return 1;
            case "J":
            case "Q":
            case "K": return 10;
        }
        
        return Integer.parseInt(numero);
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
