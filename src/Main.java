import java.util.stream.IntStream;

public class Main {

    private static final Integer count = 2;

    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println(conta.getTotal(2D, 2D));


        /* conta.getUsuarios().forEach(u -> {
            System.out.println(count + u.getIdade());
        });

        /* Optional<Usuario> usuarioOpt = conta.getUsuarios().stream()
                .filter(u -> u.getNome().equals("William"))
                .findFirst();
        usuarioOpt.ifPresent(System.out::println);

        /* long totalIdade = conta.getUsuarios().stream()
                .mapToInt(u -> u.getIdade())
                .count();

        conta.getUsuarios().stream()
                .mapToInt(Usuario::getIdade)
                .reduce((u1, u2) -> u1 + u2)
                .ifPresent(System.out::println);

        /* Map<Integer, String> myMap = Map.of(1, "a", 2, "b");
        myMap.put(3, "c"); */
        IntStream numbers = IntStream.of(10, 20, 25, 30, 40, 50);
        //numbers.dropWhile(n -> n < 20).forEach(System.out::println);
        //numbers.takeWhile(n -> n % 2 == 0).forEach(System.out::println);
    }
}