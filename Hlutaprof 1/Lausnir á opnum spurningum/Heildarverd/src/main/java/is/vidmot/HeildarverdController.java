package is.vidmot;

import is.vinnsla.Heildarverd;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Controller sem leyfir notanda að slá inn tvær tölur, fjölda eininga og einingaverð
 *  og ýta á hnapp til að sjá heildarverðið
 *
 *****************************************************************************/
public class HeildarverdController {

  // TODO Forritaðu tilviksbreytur hér fyrir neðan
  private Heildarverd heildarverd = new Heildarverd(); // vinnsluhluturinn

  @FXML
  private TextField fxEiningaverd;

  @FXML
  private TextField fxFjoldi;

  @FXML
  private TextField fxHeildarverd;


  /**
   * Handler fyrir Heildarverð hnappinn. Sækir einingaverð og fjölda eininga,
   * reiknar út heildarverð og birtir það
   * @param event ónotað
   */
  @FXML
  void onHeildarverd(ActionEvent event) {
    // forritaðu aðferðina hér fyrir neðan
    fxHeildarverd.setText("" + heildarverd.reiknaHeildarverd(
            Integer.parseInt (fxEiningaverd.getText()),
            Integer.parseInt (fxFjoldi.getText())));
  }
}

