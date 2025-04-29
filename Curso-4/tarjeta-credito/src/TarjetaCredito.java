import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TarjetaCredito {
    private double limite;
    private double saldoRestante;
    private List<Compra> compras;

    public TarjetaCredito(double limite) {
        this.limite = limite;
        this.saldoRestante = limite;
        this.compras = new ArrayList<>();
    }

    /**
     * Intenta realizar una compra.
     * @param compra Objeto Compra que se desea registrar.
     * @return true si la compra fue exitosa, false si el saldo es insuficiente.
     */
    public boolean realizarCompra(Compra compra) {
        if (compra.getValor() > saldoRestante) {
            return false;
        }
        compras.add(compra);
        saldoRestante -= compra.getValor();
        return true;
    }

    public double getSaldoRestante() {
        return saldoRestante;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    /**
     * Devuelve una lista de compras ordenadas por valor de forma ascendente.
     * @return Lista ordenada de compras.
     */
    public List<Compra> getComprasOrdenadas() {
        List<Compra> comprasOrdenadas = new ArrayList<>(compras);
        comprasOrdenadas.sort(Comparator.comparingDouble(Compra::getValor));
        return comprasOrdenadas;
    }
}
