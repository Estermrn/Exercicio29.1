package Model;

public class Veiculo {

    private int quilometros;
    private int litros;

    public Veiculo() {
    }

    public int getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(int quilometros) {
        this.quilometros = quilometros;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public Veiculo(int quilometros, int litros) {
        this.quilometros = quilometros;
        this.litros = litros;
    }

    public double getConsumo() {
        return quilometros / litros;

    }

}
