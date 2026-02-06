package is.vidmot;

import is.vinnsla.Skraavinnsla;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.InputStream;

public class Styring {
    @FXML
    private Label vorunafn_ut;
    @FXML
    private Label skilabod;
    @FXML
    private TextField vorunumer_inn;

    private Skraavinnsla skraavinnsla;
    @FXML
    private void initialize() {
        vorunafn_ut.setText("");
        skilabod.setText("");
        InputStream is = getClass().getResourceAsStream("vorunr.tsv");
        skraavinnsla = new Skraavinnsla(is);
    }
    @FXML
    private void lesa_vorunumer() {
        String vorunumer = vorunumer_inn.getText();
        if (!vorunumer.matches("\\d{4}")) {
            skilabod.setText("Vörunúmer verður að vera 4 tölustafir");
            vorunafn_ut.setText("");
            return;
        }
        String nafn = skraavinnsla.finnaVoru(vorunumer);
        if (nafn == null) {
            skilabod.setText("Vörunúmer fannst ekki");
            vorunafn_ut.setText("");
        } else {
            skilabod.setText("Vara með vörunúmer " + vorunumer + " er:");
            vorunafn_ut.setText(nafn);
        }
    }
}
