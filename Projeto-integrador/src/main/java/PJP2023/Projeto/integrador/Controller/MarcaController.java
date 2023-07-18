package PJP2023.Projeto.integrador.Controller;

import PJP2023.Projeto.integrador.Models.Marcas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MarcaController {
    @FXML
    private TextField marca;
    @FXML
    private TableView<Marcas> tblMarca;
    @FXML
    private TableColumn clnMarca;
    @FXML
    private Button btnExcluirMarca;
    private Stage stage;
    Integer index = -1;
    Marcas mar = new Marcas();



    @FXML
    void initialize() {
        btnExcluirMarca.setDisable(true);
        clnMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        // Configurar o evento de clique duplo na tabela
        tblMarca.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    mar = tblMarca.getSelectionModel().getSelectedItem();
                    marca.setText(mar.getNome());
                    index = mar.getId();
                    btnExcluirMarca.setDisable(false);
                }
            }
        });

        // Resto da inicialização, se houver...
    }
    @FXML
    void SalvarMarca(ActionEvent event) {
            if (index == -1){
            Alert alertaSalvar = new Alert(Alert.AlertType.CONFIRMATION);
            alertaSalvar.setTitle("Confirmaçao de Inclusao");
            alertaSalvar.setHeaderText("Deseja incluir novo registro ?");
            alertaSalvar.showAndWait().ifPresent(resposta -> {
                if (resposta == ButtonType.OK) {
                    //Adicionar novo item a Lista
                    mar = new Marcas(marca.getText());
                    System.out.println(mar.getNome());
                    stage.close();
                }
            });
            }else{
                Alert alertaSalvar = new Alert(Alert.AlertType.CONFIRMATION);
                alertaSalvar.setTitle("Confirmaçao de Alteraçao");
                alertaSalvar.setHeaderText("Deseja Alterar o registro ?");
                alertaSalvar.showAndWait().ifPresent(resposta -> {
                    if (resposta == ButtonType.OK) {
                        //MarcasService.atualizarCliente(index, mar);

                        index = -1;
                    }
                });
            }

    }
    @FXML
    void CancelarMarca(ActionEvent event) {
        stage.close();
    }
    @FXML
    void ExcluirMarca(ActionEvent event) {
        Alert alertaExcluir = new Alert(Alert.AlertType.CONFIRMATION);
        alertaExcluir.setTitle("Confirmaçao de Exclusão");
        alertaExcluir.setHeaderText("Deseja Excluir o registro ?");
        alertaExcluir.showAndWait().ifPresent(resposta -> {
            if (resposta == ButtonType.OK) {
                //MarcasService.deletarCliente(index);
                index = -1;
            }
        });

    }
    public void setStage(Stage stage) {

        this.stage = stage;
    }
}
