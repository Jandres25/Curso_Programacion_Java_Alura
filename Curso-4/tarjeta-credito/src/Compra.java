public class Compra {
    private String descripcion;
    private double valor;

    public Compra(String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: " + descripcion + " - Valor: " + valor;
    }
}