/**
 * Created by tluiz on 20/06/17.
 */
public class Main {

    public static void main(String[] args) {
        Adder a1 = new Adder();
        a1.name = "Adder 1";

        Adder a2 = new Adder();
        a2.name = "Adder 2";

        Adder a3 = new Adder();
        a3.name = "Adder 3";

        for(int i=0; i<3; i++) {
            a1.increase();
            a2.increase();
            a3.increase();
        }

        a1.increase();

        a1.print();
        a2.print();
        a3.print();

    }
}
