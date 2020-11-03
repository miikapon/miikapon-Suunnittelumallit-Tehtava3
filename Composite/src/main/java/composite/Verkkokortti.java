package composite;

public class Verkkokortti implements LaiteOsa {
    @Override
    public double haeHinta() {
        return 1;
    }

    @Override
    public void lisaaOsa(LaiteOsa laiteosa) {

    }
}
