package br.com.formasgeometricas.model;

import br.com.formasgeometricas.interfaces.Forma3D;
import br.com.formasgeometricas.interfaces.FormasGeometrica;

public class Paralelepipedo extends FormasGeometrica implements Forma3D {
    private double altura;
    private double largura;
    private double profundidade;

    public Paralelepipedo(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public double calcularVolume() {
        return this.altura * this.largura * this.profundidade;
    }

    @Override
    public String toString() {
        return String.format(
                "Paralelepipedo de medidas A/L/P - A: %.2f - L: %.2f - P: %.2f - V: %.2f",
                this.altura, this.largura, this.profundidade, this.calcularVolume()
        );
    }
}
