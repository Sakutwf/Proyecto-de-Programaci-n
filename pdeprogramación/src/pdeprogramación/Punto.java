/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdeprogramación;

/**
 *
 * @author Saaku
 */
public class Punto {
    private int puntoX;
    private int puntoY;

    public Punto() {}

    public Punto(int puntoX, int puntoY) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
    }

    public int getPuntoX() {
        return puntoX;
    }

    public void setPuntoX(int puntoX) {
        this.puntoX = puntoX;
    }

    public int getPuntoY() {
        return puntoY;
    }

    public void setPuntoY(int puntoY) {
        this.puntoY = puntoY;
    }
    
}
