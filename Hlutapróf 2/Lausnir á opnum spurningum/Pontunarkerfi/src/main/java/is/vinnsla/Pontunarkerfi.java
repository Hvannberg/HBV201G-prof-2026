package is.vinnsla;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Gerir ekki neitt í þessu forriti. Síðar hafa vinnsluklasar það hlutverk að framkvæma
 *  bakendavinnslu óháð notendaviðmóti *
 *  klasi fyrir spurningar 11 - 12 í HBV201G 2026 Hlutapróf 2
 *
 *****************************************************************************/
public class Pontunarkerfi {

    private final ObjectProperty<PontunarStada> stada = new SimpleObjectProperty<>(PontunarStada.EKKI_HAFIN);

    public ObjectProperty<PontunarStada> stadaProperty() {
        return stada;
    }

    public void nyPontun () {
        stada.set(PontunarStada.I_VINNSLU);
    }

    public void senda () {
        stada.set(PontunarStada.SEND);
    }

}

