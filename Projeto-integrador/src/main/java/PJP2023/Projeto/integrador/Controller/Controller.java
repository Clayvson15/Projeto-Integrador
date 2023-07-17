package PJP2023.Projeto.integrador.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.w3c.dom.Node;


public class Controller {

    @FXML
    void CadastroMarca(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cdtmarcas.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            MarcaController marcaController = loader.getController();
            marcaController.setStage(stage);

            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    void CadastroModelo(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cdtmodelos.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            ModeloController modeloController = loader.getController();
            modeloController.setStage(stage);

            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    void CadastroVeiculo(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cdtveiculos.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            VeiculoController veiculoController = loader.getController();
            veiculoController.setStage(stage);

            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

