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
public class Rectangulo {
    private String id;
    private Punto superiorDerecho;
    private Punto superiorIzquierdo;
    private Punto inferiorDerecho;
    private Punto inferiorIzquierdo;
    private String contenido;

    public Rectangulo() {}

    public Rectangulo(String id, Punto superiorDerecho, Punto superiorIzquierdo, Punto inferiorDerecho, Punto inferiorIzquierdo, String contenido) {
        this.id = id;
        this.superiorDerecho = superiorDerecho;
        this.superiorIzquierdo = superiorIzquierdo;
        this.inferiorDerecho = inferiorDerecho;
        this.inferiorIzquierdo = inferiorIzquierdo;
        this.contenido = contenido;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Punto getSuperiorDerecho() {
        return superiorDerecho;
    }

    public void setSuperiorDerecho(Punto superiorDerecho) {
        this.superiorDerecho = superiorDerecho;
    }

    public Punto getSuperiorIzquierdo() {
        return superiorIzquierdo;
    }

    public void setSuperiorIzquierdo(Punto superiorIzquierdo) {
        this.superiorIzquierdo = superiorIzquierdo;
    }

    public Punto getInferiorDerecho() {
        return inferiorDerecho;
    }

    public void setInferiorDerecho(Punto inferiorDerecho) {
        this.inferiorDerecho = inferiorDerecho;
    }

    public Punto getInferiorIzquierdo() {
        return inferiorIzquierdo;
    }

    public void setInferiorIzquierdo(Punto inferiorIzquierdo) {
        this.inferiorIzquierdo = inferiorIzquierdo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
