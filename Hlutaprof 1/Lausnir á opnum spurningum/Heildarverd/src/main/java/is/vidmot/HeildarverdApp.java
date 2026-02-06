package is.vidmot;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Beinagreind að Application klasa
 *  Prófspurning
 *
 * Ljúktu við  heildarverd-view.fxml og HeildarverdController.java
 * Gagnvirkniskrafan eru eftirfarandi:
 * Notandi slær inn einingaverð vöru (e) og fjölda eininga (f) . Þegar notandi ýtir á Heildarverð: hnappinn birtist niðurstaðan e*f í reitnum hægra megin við hnappinn.
 *
 * Forritið framkvæmir ekki neitt villutékk á inntakinu.
 *
 * Forritunarkrafan er eftirfarandi:
 *
 * Notaðu vinnsluklasann Heildarverd til að reikna út heildarverðið (ekki framkvæma margföldun beint í Controller)
 *
 *****************************************************************************/
public class HeildarverdApp extends javafx.application.Application {
    /**
     * Ræsir appið
     *
     * @param stage glugginn
     * @throws Exception undnantekning sem verður ef villla
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Smíða loader fyrir notendaviðmótið sem er geymt í skránni heildarverd-view.fxml
        // Gætið þess að .fxml skráin sé undir resources/is/vidmot
           FXMLLoader fxmlLoader = new FXMLLoader(HeildarverdApp.class.getResource("heildarverd-view.fxml"));
        // Smíða senuna með notendaviðmótinu sem er núna lesið inn af resources
        Scene scene = new Scene(fxmlLoader.load(), 275, 240);
        // Setja titilinn á gluggann
        stage.setTitle("Heildarverð");
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
