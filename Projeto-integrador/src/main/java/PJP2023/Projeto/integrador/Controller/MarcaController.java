package PJP2023.Projeto.integrador.Controller;

import PJP2023.Projeto.integrador.Models.Marcas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MarcaController {
    @FXML
    private TextField marca;
    private Stage stage;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @FXML
    void SalvarMarca(ActionEvent event) {
        Alert alertaSalvar = new Alert(Alert.AlertType.CONFIRMATION);
        alertaSalvar.setTitle("Confirmaçao de Inclusao");
        alertaSalvar.setHeaderText("Deseja incluir novo registro ?");
        alertaSalvar.showAndWait().ifPresent(resposta -> {
            if (resposta == ButtonType.OK) {
                //Adicionar novo item a Lista
                Marcas nome = new Marcas(marca.getText());
                System.out.println(nome.getNome());
                stage.close();
            }
        });
    }
    @FXML
    void CancelarMarca(ActionEvent event) {
        stage.close();
    }
    @FXML
    void ExcluirMarca(ActionEvent event) {

    }
}
