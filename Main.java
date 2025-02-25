
public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("X7");
        Mercedes mercedes = new Mercedes("Maybach");
        Audi audi = new Audi("AQ7");

        human insan1 = new human("nihad", bmw);
        human insan2 = new human("ismayil", mercedes);
        human insan3 = new human("elsad", audi);

        System.out.println(insan1.getInfo());
        System.out.println(insan2.getInfo());
        System.out.println(insan3.getInfo());
    }
}
