package is.vidmot;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur:
 *  Lýsing  : Lausn á dæmi 14 í Hlutaprófi 2, HBV201G, 2026
 *
 *
 *****************************************************************************/
public class AppKlasi extends javafx.application.Application {
    /**
     * Ræsir appið
     *
     * @param stage glugginn
     * @throws Exception undnantekning sem verður ef villla
     */
    @Override
    public void start(Stage stage) throws Exception {

        // Smíða loader fyrir notendaviðmótið sem er geymt í skránni vidburdir-view.fxml
        // Gætið þess að .fxml skráin sé undir resources/is/vidmot
        FXMLLoader fxmlLoader = new FXMLLoader(AppKlasi.class.getResource("vidburdir-view.fxml"));
        // Smíða senuna með notendaviðmótinu sem er núna lesið inn af resources
        Scene scene = new Scene(fxmlLoader.load(), 520, 240);
        // Setja titilinn á gluggann
        stage.setTitle("Viðburðarkerfi");
        // Tengja senuna við glugggann
        stage.setScene(scene);
        // Birta gluggann
        stage.show();
    }


    /**
     * Aðalforritið sem ræsir appið
     *
     * @param args ónotað
     */
    public static void main(String[] args) {
        // Ræsa forritið
        launch();
    }
}
