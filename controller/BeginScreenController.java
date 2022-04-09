package jogodavelha.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import jogodavelha.JogoDaVelha;

public class BeginScreenController {

    @FXML
    private TextField localName1;
    @FXML
    private TextField localName2;
    @FXML
    private Label infoNome;

    @FXML
    private void getClick(ActionEvent event) throws IOException, ClassNotFoundException {
        Button button = (Button) event.getSource();

        if (button.getId().compareTo("newGame") == 0) {
            if (localName1.getText().compareTo("") == 0 || localName2.getText().compareTo("") == 0) {
                infoNome.setVisible(true);

            } else {
                infoNome.setVisible(false);

                JogoDaVelha.chengeScreen(button.getId(), null, localName1.getText(), localName2.getText());
                localName1.setText("");
                localName2.setText("");
            }

        }

    }

}
