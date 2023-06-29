/*
Vamos deixar alguns comentarios nas classes para explicar a nossa ideia e tentar
ficar facil entender!
 */
package application;

import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		atendente.abrirInterfaceGrafica();

		launch(args);
		Scanner sc = new Scanner(System.in);

		Usuario.inciarUsuarios();

		int opcao = -1;
		while (opcao != 0) {
			Menu.exibeMenuInicial();
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				Usuario.fazerLogin();
				break;
			case 0:
				Menu.msgFinal();
				break;
			}
		}
		sc.close();
	}
}
