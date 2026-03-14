package is.vinnsla;

import javafx.beans.property.SimpleStringProperty;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  :  Vinsluklasi fyrir viðburð.
 *  Lausn á dæmum 13 og 14 í HBV201G Hlutaprófi 2, 2026
 *
 *****************************************************************************/
public class Vidburdur {
    private SimpleStringProperty heiti = new SimpleStringProperty();
    private SimpleStringProperty dagsetning = new SimpleStringProperty();

    public Vidburdur(String h, String d) {
        // kóði er falinn
        heiti.set (h);
        dagsetning.set (d);
    }

    public SimpleStringProperty heitiProperty() {
        return heiti;
    }

    public SimpleStringProperty dagsetningProperty() {
        return dagsetning;
    }

    @Override
    public String toString () {
        return heiti.get();
    }
}