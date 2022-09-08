import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        hello(null);
    }
    public static void hello(String str) {
        Optional.ofNullable(str).ifPresent(s -> System.out.print(str.toLowerCase()));
        Optional.ofNullable(str).orElse("ccc");
    }
}
