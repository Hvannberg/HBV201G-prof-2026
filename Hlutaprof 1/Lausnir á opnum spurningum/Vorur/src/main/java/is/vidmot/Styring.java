package is.vidmot;

import is.vinnsla.Skraavinnsla;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.InputStream;

public class Styring {
    public static final String VERA_4_TOLUSTAFIR = "Vörunúmer verður að vera 4 tölustafir";
    public static final String FANNST_EKKI = "Vörunúmer fannst ekki";
    public static final String VORUR_FORMAT = "Vara með vörunúmeri  %s  er:";

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
        if (!erGilt(vorunumer)) {
            birtaNidurstodur(VERA_4_TOLUSTAFIR, "");
            return;
        }
        
        String nafn = skraavinnsla.finnaVoru(vorunumer);
        if (erNull(nafn)) {
            birtaNidurstodur(FANNST_EKKI, "");
        } else {
            birtaNidurstodur(String.format (VORUR_FORMAT, vorunumer), nafn);
        }
    }

    private void birtaNidurstodur(String s, String nidurstada) {
        skilabod.setText(s);
        vorunafn_ut.setText(nidurstada);
    }


    private static boolean erGilt(String vorunumer) {
        return vorunumer.matches("\\d{4}");
    }

    private static boolean erNull(String nafn) {
        return nafn == null;
    }
}
