package br.com.formasgeometricas.app;

import br.com.formasgeometricas.interfaces.FormasGeometrica;
import br.com.formasgeometricas.model.Circulo;
import br.com.formasgeometricas.model.Cubo;
import br.com.formasgeometricas.model.Paralelepipedo;
import br.com.formasgeometricas.model.Quadrado;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================= FORMAS GEOMETRICAS =========================");
        FormasGeometrica formas [];
        formas = new FormasGeometrica[4];
        formas[0] = new Quadrado(3);
        formas[1] = new Circulo(2);
        formas[2] = new Paralelepipedo(3,2,5);
        formas[3] = new Cubo(4);

        for (FormasGeometrica f : formas){
            System.out.println(f);
        }
        System.out.println("===========================================================================");

    }
}
