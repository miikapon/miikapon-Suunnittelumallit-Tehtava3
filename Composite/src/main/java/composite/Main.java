  
package composite;

public class Main {
    public static void main(String[] args) {

        LaiteOsa emolevy = new Emolevy();
        emolevy.lisaaOsa(new Prosessori());
        emolevy.lisaaOsa(new Muistipiiri());
        emolevy.lisaaOsa(new Naytonohjain());
        emolevy.lisaaOsa(new Verkkokortti());

        LaiteOsa kotelo = new Kotelo();
        kotelo.lisaaOsa(emolevy);
        kotelo.lisaaOsa(new Levyasema());

        System.out.println(kotelo.haeHinta());
        System.out.println(emolevy.haeHinta());
    }
}