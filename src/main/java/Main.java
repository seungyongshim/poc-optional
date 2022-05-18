import java.util.Optional;
import java.util.function.Function;



public class Main {

    public static void main(String[] args) {
        Optional<String> a = null;
        Optional<String> b = Optional.ofNullable(null);

        System.out.println(a);
        System.out.println(b);
    }

}
