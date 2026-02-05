package br.com.formasgeometricas.model;

import br.com.formasgeometricas.interfaces.Forma2D;
import br.com.formasgeometricas.interfaces.FormasGeometrica;

public class Quadrado extends FormasGeometrica implements Forma2D {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }

    @Override
    public String toString() {
        return String.format(
                "Quadrado de lado: %.1f A: %.2f - P: %.2f",
                this.lado, this.calcularArea(), this.calcularPerimetro()
        );
    }
}
