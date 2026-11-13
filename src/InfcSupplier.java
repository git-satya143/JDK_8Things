import java.util.function.Supplier;

public class InfcSupplier {
    public static void main(String[] args) {
        Supplier<String> s=()-> new String("hello");
        System.out.println(s.get());
    }
}
