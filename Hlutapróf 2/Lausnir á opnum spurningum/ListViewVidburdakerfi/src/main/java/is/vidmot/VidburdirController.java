package is.vidmot;

import is.vinnsla.VidburdaListi;
import is.vinnsla.Vidburdur;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Stýring fyrir viðburðarforriti. Hægt að velja viðburð og þá birtist hann
 *  í sömu senu
 *  Lausn á dæmum  13 og 14 í HBV201G Hlutapróf 2,
 *****************************************************************************/
public class VidburdirController {

    // Notendaviðmótsbreytur
    @FXML
    private ListView<Vidburdur> fxVidburdir;
    @FXML
    private VidburdurSpjald fxVidburdurSpjald;
    // Vinnslubreytur
    private VidburdaListi vidburdaListi = new VidburdaListi();

    // kallað á eftir að .fxml skránni hefur verið hlaðið inn en áður en birtist verður
    public void initialize() {
        ObservableList<Vidburdur> listi = vidburdaListi.getListi(); // Búa til listann í vinnslunni
        fxVidburdir.setItems(listi); // Tengja við notendaviðmótið
        // lausnin hér fyrir neðan

        // forritaðu hér
        fxVidburdir.getSelectionModel().selectedItemProperty()
                .addListener((obs, gamla, nyja) // 3 parametrar í lambda falli
                        -> fxVidburdurSpjald.setVidburdur(nyja)); // kóðablokk í lambda fallið
    }
}

