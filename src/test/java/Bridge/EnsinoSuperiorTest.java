package Bridge;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EnsinoSuperiorTest {
    @Test
    void deveRetornarSalarioLicencaCSendoFormado() {
        Nivel nivel = new LicencaC();
        EnsinoSuperior ensinoSuperior = new EnsinoSuperior(10000.0f);
        ensinoSuperior.setNivel(nivel);
        assertEquals(10000.0f, ensinoSuperior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioLicencaBSendoFormado() {
        Nivel nivel = new LicencaB();
        EnsinoSuperior ensinoSuperior = new EnsinoSuperior(10000.0f);
        ensinoSuperior.setNivel(nivel);
        assertEquals(11000.0f, ensinoSuperior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioLicencaASendoFormado() {
        Nivel nivel = new LicencaA();
        EnsinoSuperior ensinoSuperior = new EnsinoSuperior(10000.0f);
        ensinoSuperior.setNivel(nivel);
        assertEquals(12000.0f, ensinoSuperior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioLicencaProSendoFormado() {
        Nivel nivel = new LicencaPro();
        EnsinoSuperior ensinoSuperior = new EnsinoSuperior(10000.0f);
        ensinoSuperior.setNivel(nivel);
        assertEquals(13000.0f, ensinoSuperior.calcularSalario(), 0.01f);
    }
}
