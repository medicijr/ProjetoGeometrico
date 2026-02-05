package br.com.formasgeometricas.model;

import br.com.formasgeometricas.interfaces.Forma2D;
import br.com.formasgeometricas.interfaces.Forma3D;
import br.com.formasgeometricas.interfaces.FormasGeometrica;

public class Cubo extends FormasGeometrica implements Forma2D, Forma3D {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.lado , 2) ;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(this.lado , 3);
    }

    @Override
    public String toString() {
        return String.format(
                "Cubo de lado: %.2f A: %.2f - P: %.2f - V: %.2f",
                this.lado, this.calcularArea(), this.calcularPerimetro(), this.calcularVolume()
        );
    }
}
