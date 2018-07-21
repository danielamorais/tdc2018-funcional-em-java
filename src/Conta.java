import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Conta {

    private List<Usuario> usuarios;
    private List<String> cartoes;

    public Conta() {
        this.usuarios = Stream.of(new Usuario("William", 50), new Usuario("Gustavo", 60))
                .collect(Collectors.toList());
        this.cartoes = Stream.of("visa", "master", "elo")
                .collect(Collectors.toList());
    }

    public List<String> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<String> cartoes) {
        this.cartoes = cartoes;
    }

    public Double getTotal(Double a, Double b) {
        return a + b + Math.random();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
