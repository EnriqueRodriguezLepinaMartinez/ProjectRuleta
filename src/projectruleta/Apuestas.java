/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectruleta;


/**
 *
 * @author ricky_000
 */
public class Apuestas extends Fichas {

    int apuestaTotal;

    public Apuestas() {
        super();
    }

    public int getApuestaTotal() {
        return apuestaTotal;
    }

    public void setApuestaTotal(int apuestaTotal) {
        this.apuestaTotal = apuestaTotal;
    }

    //METODO PARA APOSTAR POR UN NUMERO
    public int numero(int ficha, int cant) {
           apuestaTotal += ficha;
        return apuestaTotal;
    }
}
