import org.example.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioPJTest {

    @Test
    void deveRetornarElegivel() {
        BeneficioPJ beneficio = new BeneficioPJ();
        beneficio.setSalario(3000.0f);

        assertEquals("Elegível", beneficio.verificarElegibilidade());
    }

    @Test
    void deveRetornarNaoElegivel() {
        BeneficioPJ beneficio = new BeneficioPJ();
        beneficio.setSalario(2999.0f);

        assertEquals("Não elegível", beneficio.verificarElegibilidade());
    }

    @Test
    void deveRetornarInformacoes() {
        BeneficioPJ beneficio = new BeneficioPJ();
        beneficio.setNome("Plano de Saúde");
        beneficio.setValorBase(300.0f);
        beneficio.setSalario(3000.0f);

        assertEquals(
                "BeneficioPJ{nome='Plano de Saúde', valor=300.0, elegibilidade=Elegível}",
                beneficio.getInfo()
        );
    }
}