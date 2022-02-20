package ua.lviv.iot;

public class Main {

    public static void main(String[] args) {
        Sofa firstSofa = new Sofa();
        Sofa secondSofa = new Sofa("White", "Leather", 22_999.99);
        Sofa thirdSofa = new Sofa("Red", "Suede", 17_999.99, 1.1, 1.8 );


        System.out.println(firstSofa);
        System.out.println(secondSofa);
        System.out.println(thirdSofa);
        System.out.println();
        System.out.println(Sofa.getStaticField());
    }
}
