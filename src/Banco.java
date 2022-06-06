import java.util.List;

public class Banco {
    private int numero;
    private final String nome = "Banco Donay";
    private List<Banco> bancos;

    public int getNumero() {
        this.numero = 1;
        return numero;
    }

    public String getNome() {
           return nome;
    }


    public List<Banco> getBancos() {
        return bancos;
    }

    public void setBancos(List<Banco> bancos) {
        this.bancos = bancos;
    }
}
