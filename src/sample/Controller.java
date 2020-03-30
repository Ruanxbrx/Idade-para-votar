package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
     @FXML
     private JButton btVerificar;
     @FXML
     private TextField tfIdade;
     @FXML
     private Label lbResultado;

     @FXML
     public void  verificarIdade(){
          int idade = Integer.parseInt(tfIdade.getText());
          lbResultado.setText(String.valueOf(idade));
     }



}
