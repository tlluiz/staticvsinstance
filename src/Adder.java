/**
 * Created by tluiz on 20/06/17.
 */
public class Adder {

    String name;
    int instanceValue = 0;
    static int staticeValue = 0;

    void increase() {
        instanceValue++;
        staticeValue++;
    }

    void print() {
        System.out.println("The Adder" + name + ": instance=" + instanceValue + " e static=" + staticeValue);
    }

}
