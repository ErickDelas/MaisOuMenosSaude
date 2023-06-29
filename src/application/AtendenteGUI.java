package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Optional;

public class AtendenteGUI extends Application {
    private Atendente atendente;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menu do Atendente");

        MenuButton cadastrarMenu = new MenuButton("Menu");
        MenuItem cadastrarClientesItem = new MenuItem("Cadastrar Clientes");
        MenuItem possiveisClientesItem = new MenuItem("Possíveis Clientes");
        MenuItem clientesInativosItem = new MenuItem("Clientes Inativos");
        MenuItem cancelarPlanoItem = new MenuItem("Cancelar Plano");
        
        cadastrarClientesItem.setOnAction(event -> cadastrarCliente());
        possiveisClientesItem.setOnAction(event -> exibirPossiveisClientes());
        clientesInativosItem.setOnAction(event -> exibirClientesInativos());
        cancelarPlanoItem.setOnAction(event -> cancelaPlano());

        cadastrarMenu.getItems().addAll(cadastrarClientesItem, possiveisClientesItem,
                clientesInativosItem, cancelarPlanoItem);

        VBox vbox = new VBox(cadastrarMenu);
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void cadastrarCliente() {
        TextInputDialog nomeDialog = new TextInputDialog();
        nomeDialog.setTitle("Cadastro de Cliente");
        nomeDialog.setHeaderText(null);
        nomeDialog.setContentText("Nome:");
        Optional<String> nomeResult = nomeDialog.showAndWait();
        String nome = nomeResult.orElse("");

        TextInputDialog cpfDialog = new TextInputDialog();
        cpfDialog.setTitle("Cadastro de Cliente");
        cpfDialog.setHeaderText(null);
        cpfDialog.setContentText("CPF:");
        Optional<String> cpfResult = cpfDialog.showAndWait();
        String cpf = cpfResult.orElse("");

        TextInputDialog enderecoDialog = new TextInputDialog();
        enderecoDialog.setTitle("Cadastro de Cliente");
        enderecoDialog.setHeaderText(null);
        enderecoDialog.setContentText("Endereço:");
        Optional<String> enderecoResult = enderecoDialog.showAndWait();
        String endereco = enderecoResult.orElse("");

        TextInputDialog telefoneDialog = new TextInputDialog();
        telefoneDialog.setTitle("Cadastro de Cliente");
        telefoneDialog.setHeaderText(null);
        telefoneDialog.setContentText("Número de Telefone:");
        Optional<String> telefoneResult = telefoneDialog.showAndWait();
        String telefone = telefoneResult.orElse("");

        TextInputDialog emailDialog = new TextInputDialog();
        emailDialog.setTitle("Cadastro de Cliente");
        emailDialog.setHeaderText(null);
        emailDialog.setContentText("Email:");
        Optional<String> emailResult = emailDialog.showAndWait();
        String email = emailResult.orElse("");

        Cliente cliente = new Cliente(nome, cpf, endereco, telefone, email);
        atendente.cadastrarCliente();	

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastro de Cliente");
        alert.setHeaderText(null);
        alert.setContentText("Cliente cadastrado com sucesso!");
        alert.showAndWait();
    }

    public void exibirPossiveisClientes() {
        StringBuilder sb = new StringBuilder();
        for (Cliente cliente : atendente.getPossiveisClientes()) {
            sb.append(cliente.toString()).append("\n");
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Possíveis Clientes");
        alert.setHeaderText(null);
        alert.setContentText(sb.toString());
        alert.showAndWait();
    }

    public void exibirClientesInativos() {
        StringBuilder sb = new StringBuilder();
        for (Cliente cliente : atendente.getClientesInativos()) {
            sb.append(cliente.toString()).append("\n");
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Clientes Inativos");
        alert.setHeaderText(null);
        alert.setContentText(sb.toString());
        alert.showAndWait();
    }

    public void cancelaPlano() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Cancelar Plano");
        dialog.setHeaderText(null);
        dialog.setContentText("Informe o CPF do cliente para cancelar o plano:");
        Optional<String> cpfResult = dialog.showAndWait();

        cpfResult.ifPresent(cpfCliente -> {
            boolean clienteEncontrado = false;
            for (Cliente cliente : atendente.getClientesAtivos()) {
                if (cpfCliente.equals(cliente.getCpf().toUpperCase())) {
                    atendente.cancelaPlano();
                    clienteEncontrado = true;
                    break;
                }
            }
            if (clienteEncontrado) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Cancelar Plano");
                alert.setHeaderText(null);
                alert.setContentText("O plano do cliente foi cancelado com sucesso!");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Cancelar Plano");
                alert.setHeaderText(null);
                alert.setContentText("Não foi encontrado nenhum cliente com o CPF informado!");
                alert.showAndWait();
            }
        });
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public static void abrirInterfaceGrafica(Atendente atendente) {
        launch();
    }
}
