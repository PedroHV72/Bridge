package Bridge;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ExJogadorTest {

    @Test
    void deveRetornarSalarioLicencaCSendoExJogador() {
        Nivel nivel = new LicencaC();
        ExJogador exJogador = new ExJogador(10000.0f);
        exJogador.setNivel(nivel);
        assertEquals(10000.0f, exJogador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioLicencaBSendoExJogador() {
        Nivel nivel = new LicencaB();
        ExJogador exJogador = new ExJogador(10000.0f);
        exJogador.setNivel(nivel);
        assertEquals(11000.0f, exJogador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioLicencaASendoExJogador() {
        Nivel nivel = new LicencaA();
        ExJogador exJogador = new ExJogador(10000.0f);
        exJogador.setNivel(nivel);
        assertEquals(12000.0f, exJogador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioLicencaProSendoExJogador() {
        Nivel nivel = new LicencaPro();
        ExJogador exJogador = new ExJogador(10000.0f);
        exJogador.setNivel(nivel);
        assertEquals(13000.0f, exJogador.calcularSalario(), 0.01f);
    }
}
