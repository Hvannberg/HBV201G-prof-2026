package is.vinnsla;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Vinnsluklasi sem reiknar út heildarverð byggt á fjölda eininga og einingaverði
 *
 *****************************************************************************/
public class Heildarverd {
    /**
     * Reiknar út heildarverð ef gefið er upp fjölda eininga og einingaverð. Heildarverði er skilað
     *
     * @param e einingaverð
     * @param f fjöldi eininga
     * @return heildarverðið
     */
    public int reiknaHeildarverd(int e, int f) {
        return e * f;
    }
}
