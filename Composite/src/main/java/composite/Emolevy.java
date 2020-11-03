package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements LaiteOsa {
    double hinta = 1;
    List<LaiteOsa> laiteosaLista = new ArrayList<LaiteOsa>();
    
    @Override
    public double haeHinta() {
        double lapsienHinta = 0;
        for (LaiteOsa osa : laiteosaLista) {
            lapsienHinta = lapsienHinta + osa.haeHinta();
        }

        return hinta + lapsienHinta;
    }

    @Override
    public void lisaaOsa(LaiteOsa lisattavaLaiteosa) {
        laiteosaLista.add(lisattavaLaiteosa);
    }
}