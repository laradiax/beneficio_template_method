package org.example;

public class BeneficioCLT extends Beneficio {

    public String verificarElegibilidade() {
        if (this.getSalario() > 0.0f) {
            return "Elegível";
        } else {
            return "Não elegível";
        }
    }

    @Override
    public String getTipo() {
        return "BeneficioCLT";
    }
}