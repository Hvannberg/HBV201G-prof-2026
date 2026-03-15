package is.vidmot;

/******************************************************************************
 *  Nafn    :
 *  T-póstur:
 *  Lýsing  : Controller eða stýring fyrir notendaviðmótið
 *
 *
 *****************************************************************************/

import is.vinnsla.PontunarStada;
import is.vinnsla.Pontunarkerfi;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import static is.vinnsla.PontunarStada.EKKI_HAFIN;


public class PontunarkerfiController {

    @FXML
    private Button fxBaetaVoru;
    @FXML
    private Button fxNyPontun;
    @FXML
    private Button fxSenda;
    @FXML
    private Label fxStadaTexti;

    private Pontunarkerfi kerfi = new Pontunarkerfi();

    public void initialize() {
        // forritaðu aðeins lið b) hér

    }



    @FXML
    void onNyPontun(ActionEvent event) {

        //forritaðu hér

    }

    @FXML
    void onSendaPontun(ActionEvent event) {

        // forritaðu hér

    }

}



