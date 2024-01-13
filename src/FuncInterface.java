// a functional interface with a single abstract function.
@FunctionalInterface
public interface FuncInterface {
    // a single abstract function
    void abstractFun(int x);

    default void defaultFun() {
        System.out.println("Hello World!!");
    }
}
