package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btnConnect;

    @FXML
    private Button btnDisconnect;

    @FXML
    private Button btnRegister;

    @FXML
    private Button btnEnter;

    @FXML
    private TextArea taUsers;

    @FXML
    private TextArea taMessages;

    @FXML
    private TextArea taNewMessage;

    @FXML
    private TextField tfServerAddress;

    @FXML
    private TextField tfLogin;

    @FXML
    private TextField tfPassword;

    @FXML
    private Label lInfo;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        taMessages.setEditable(false);
        taNewMessage.setEditable(false);
        taUsers.setEditable(false);

        btnDisconnect.setDisable(true);
        btnEnter.setDisable(true);
    }
}
