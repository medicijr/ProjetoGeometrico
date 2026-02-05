package br.com.formasgeometricas.model;

import br.com.formasgeometricas.interfaces.Forma2D;
import br.com.formasgeometricas.interfaces.FormasGeometrica;

public class Circulo extends FormasGeometrica implements Forma2D {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.raio, 2) * Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return String.format(
                "Circulo do raio: %.1f A: %.2f - P: %.2f",
                this.raio, this.calcularArea(), this.calcularPerimetro()
        );
    }
}
