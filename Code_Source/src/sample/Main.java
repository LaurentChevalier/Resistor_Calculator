package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
/**
 * Main est la classe de lancement de l'application
 * @author Laurent Chevalier Guillaume Maerten
 */
public class Main extends Application {

    @Override
    /**
     * Méthode d'initialisation de l'application
     */
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ebauche1.fxml"));
        primaryStage.setTitle("The Resistor Calculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        Resistor newResistor= new Resistor();
        newResistor.serie=3;
        newResistor.setRawvalue(152);
        newResistor.normalize();

        newResistor.setColours(Resistor.Colours.BROWN,0);
        newResistor.setColours(Resistor.Colours.BLACK,1);
        newResistor.setColours(Resistor.Colours.BLACK,2);
        newResistor.setColours(Resistor.Colours.BROWN,3);
        newResistor.setColours(Resistor.Colours.BROWN,4);

        System.out.println(newResistor.getColours(0));
        System.out.println(newResistor.getColours(1));
        System.out.println(newResistor.getColours(2));
        System.out.println(newResistor.getColours(3));
        System.out.println(newResistor.getColours(4));

        FourBandDecoder.getInstance().setColours(Resistor.Colours.BLACK,2);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
