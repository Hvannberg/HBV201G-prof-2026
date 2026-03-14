package is.vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  :  Vinsluklasi fyrir viðburðalista.
 *  Lausn á dæmum 13 og 14 í HBV201G Hlutaprófi 2, 2026
 *
 *
 *****************************************************************************/
public class VidburdaListi {

    private ObservableList<Vidburdur> listi = FXCollections.observableArrayList();

    public VidburdaListi() {
        // gögnin harðkóðuður hér inn til einföldunar í staðinn fyrir að vera í vinnslu
        listi.add(new Vidburdur("Tónleikar í Eldborg", "7. mars "));
        listi.add(new Vidburdur("Málstofa í JavaFX", "11. mars"));
    }

    public ObservableList<Vidburdur> getListi () {
        return listi;
    }
}
