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
public class ExcecaoCartaInexistente extends Exception {

    /**
     * Creates a new instance of <code>ExcecaoCartaInexistente</code> without
     * detail message.
     */
    public ExcecaoCartaInexistente() {
        super("Carta Inexistente");
    }

    /**
     * Constructs an instance of <code>ExcecaoCartaInexistente</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcecaoCartaInexistente(String msg) {
        super(msg);
    }
}
