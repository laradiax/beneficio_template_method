package org.example;

public class BeneficioPJ extends Beneficio {

    public String verificarElegibilidade() {
        if (this.getSalario() >= 3000.0f) {
            return "Elegível";
        } else {
            return "Não elegível";
        }
    }

    @Override
    public String getTipo() {
        return "BeneficioPJ";
    }
}