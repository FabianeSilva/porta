package porta;

public class Main {

    public static void main(String[] args) {
        Porta p1 = new Porta("Marrom", 18, 25, 4);

        p1.abre();
        p1.abre();
        p1.fecha();

        p1.pinta("Amarelo");

        System.out.println(p1);
    }
}
