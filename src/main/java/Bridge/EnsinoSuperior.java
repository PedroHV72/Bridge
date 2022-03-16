package Bridge;

public class EnsinoSuperior extends Formacao {

    public EnsinoSuperior(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.nivel.percentualAumento());
    }
}
