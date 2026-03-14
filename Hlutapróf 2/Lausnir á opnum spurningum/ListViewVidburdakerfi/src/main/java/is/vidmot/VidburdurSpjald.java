package is.vidmot;

import is.vinnsla.Vidburdur;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Custom component fyrir viðburðaspjald
 *  Lausn á dæmum 13 og 14 í HBV201G Hlutaprófi 2, 2026
 *
 *****************************************************************************/
public class VidburdurSpjald extends GridPane {

    @FXML
    private Label fxHeiti;
    @FXML
    private Label fxDagsetning;

    /**
     * Smiður sem les inn .fxml skrá, setur rótina sem þessi hlutur, setur controllerinn sem þessi hlutur
     */
    public VidburdurSpjald() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/is/vidmot/vidburdurSpjald-view.fxml"));
        fxmlLoader.setRoot(this);   // rótin á viðmótstrénu sett hér
        fxmlLoader.setController(this); // controllerinn settur hér en ekki í .fxml skránni
        try {
            fxmlLoader.load();          // viðmótstréð lesið inn (þ.e. .fxml skráin)
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    /**
     * Bindur notendaviðmótið við vinnsluna
     *
     * @param v viðburður sem á að binda við
     */
    public void setVidburdur(Vidburdur v) {

        // forritaðu hér
        fxHeiti.textProperty().bind(v.heitiProperty());
        fxDagsetning.textProperty().bind(v.dagsetningProperty());
    }
}
