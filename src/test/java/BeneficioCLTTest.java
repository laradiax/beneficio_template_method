import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BeneficioCLTTest {

    @Test
    void deveRetornarElegivel() {
        BeneficioCLT beneficio = new BeneficioCLT();
        beneficio.setSalario(2000.0f);

        assertEquals("Elegível", beneficio.verificarElegibilidade());
    }

    @Test
    void deveRetornarNaoElegivel() {
        BeneficioCLT beneficio = new BeneficioCLT();
        beneficio.setSalario(0.0f);

        assertEquals("Não elegível", beneficio.verificarElegibilidade());
    }

    @Test
    void deveRetornarInformacoes() {
        BeneficioCLT beneficio = new BeneficioCLT();
        beneficio.setNome("Vale Refeição");
        beneficio.setValorBase(500.0f);
        beneficio.setSalario(2000.0f);

        assertEquals(
                "BeneficioCLT{nome='Vale Refeição', valor=500.0, elegibilidade=Elegível}",
                beneficio.getInfo()
        );
    }
}