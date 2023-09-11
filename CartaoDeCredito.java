import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    //quais atributos irei criar ?

    private double limite;
    private double saldo;
    private List<Compra> compras;

    //Ninguém recebe um cartão de crédito com limite infinito


    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    //boolean retorna verdadeiro ou falso.
    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
