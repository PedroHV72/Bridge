package Bridge;

public abstract class Formacao {

    protected Nivel nivel;

    protected float salarioBase;

    public Formacao(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
