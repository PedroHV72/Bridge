package Bridge;

public class ExJogador extends Formacao {

    public ExJogador(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.nivel.percentualAumento());
    }
}
