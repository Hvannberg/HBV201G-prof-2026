package is.vidmot;

/******************************************************************************
 *  Nafn    :
 *  T-póstur:
 *  Lýsing  : Controller eða stýring fyrir notendaviðmótið
 *  klasi fyrir spurningar 11 - 12 í HBV201G 2026
 *  Hlutapróf 2
 *
 *****************************************************************************/

import is.vinnsla.PontunarStada;
import is.vinnsla.Pontunarkerfi;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


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
        // Spurning 11

        // stadaProperty() er Property<PontunarStada>
        // isNotEqualTo tekur PontunarStada-gildi (ekki Property)
        fxNyPontun.disableProperty().bind(kerfi.stadaProperty()
                .isNotEqualTo(PontunarStada.EKKI_HAFIN));
        fxBaetaVoru.disableProperty()
                .bind(kerfi.stadaProperty()
                        .isNotEqualTo(PontunarStada.I_VINNSLU));
        fxSenda.disableProperty()
                .bind(kerfi.stadaProperty()
                        .isNotEqualTo(PontunarStada.I_VINNSLU));

        // Spurning 12
        // Einfaldur texti
        // .asString() skilar StringBinding
        fxStadaTexti.textProperty().bind(kerfi.stadaProperty().asString());

        // lausn með listener
        /**
         fxStadaTexti.setText(PontunarStada.EKKI_HAFIN.toString());
         kerfi.stadaProperty().addListener(
         (obs, gamla, nyja) -> {
         fxStadaTexti.setText(nyja.toString());
         });
         **/
    }


    /**
     * Bætir við vöru í pöntunina
     *
     * @param event
     */
    @FXML
    void onBaetaVoru(ActionEvent event) {
    }

    /**
     * Ný pöntun verður til
     *
     * @param event ónotað
     */
    @FXML
    void onNyPontun(ActionEvent event) {
        kerfi.nyPontun();
    }

    /**
     * Sendir núverandi pöntun
     *
     * @param event
     */
    @FXML
    void onSendaPontun(ActionEvent event) {
        kerfi.senda();
    }

}



