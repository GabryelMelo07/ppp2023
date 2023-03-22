import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import model.Leiloeiro;
import model.Licitante;
import model.Observer;

public class App extends Application {
    public static void main(String[] args) throws Exception {

        /* Leiloeiro leiloeiro = new Leiloeiro(1000.00);
        ArrayList<Observer> vetLicitante = new ArrayList<>();

        Licitante igor = new Licitante("Igor");
        Licitante yuri = new Licitante("Yuri");
        Licitante lucas = new Licitante("Lucas");

        vetLicitante.add(igor);
        vetLicitante.add(yuri);
        vetLicitante.add(lucas);

        leiloeiro.setVetObservers(vetLicitante);
        
        // Deve dar erro pois a tentativa de lance é menor que o lance mínimo estipulado.
        // leiloeiro.setLance(lucas, 0);

        // Deve dar erro pois a tentativa de lance é igual ao inicial, deve ser maior para começar o leilão.
        // leiloeiro.setLance(lucas, 1000.00);

        leiloeiro.setLance(lucas, 2000);
        leiloeiro.setLance(yuri, 2500.00); */

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = loader.load();
        
        Scene tela = new Scene(root);

        stage.setTitle("Leilao");
        stage.setScene(tela);
        stage.show();
    }
}
