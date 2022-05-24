package com.rpg.rpg;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game extends Application {
    List<Hero> heroes = new ArrayList<>();
    List<Ennemy> ennemies = new ArrayList<>();
    @Override

    public void start(Stage stage) {
        //Drawing a Rectangle
        Rectangle rectangle = new Rectangle();

        //Setting the properties of the rectangle
        rectangle.setX(150.0f);
        rectangle.setY(75.0f);
        rectangle.setWidth(300.0f);
        rectangle.setHeight(150.0f);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);

       // AnchorPane root = new AnchorPane();

        //Creating a Group object
        Group root = new Group(rectangle);


        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the Stage
        stage.setTitle("Drawing a Rectangle");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

        Image photoWarrior = new Image("file:assets/photoWarrior.png");
        ImageView imWarrior = new ImageView();
        imWarrior.setImage(photoWarrior);
        imWarrior.setX(5);
        imWarrior.setY(0);
        imWarrior.setPreserveRatio(true);
        imWarrior.setFitWidth(40);
        root.getChildren().add(imWarrior);




    }

    public static void main(String[] args) {


        Game myGame = new Game();
        myGame.ennemies.add(new BasicEnnemy());
        myGame.heroes.add(new Warrior("bite"));
        myGame.heroes.add(new Mage("chibre"));

    // Demander le nombre de joueurs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Avec combien de héros voulez-vous jouer ? ");

        //Lit l'entier écrit par l'utilisateur et l'affecte à  la variable nombre du programme
        int nombreJoueur = scanner.nextInt();
        System.out.println("vous jouez donc avec " + nombreJoueur + " Joueur[s]");
        //boucle permettant de demander à l'utilisateur lr nom et la classe du warrior
        for (int i=0;i<nombreJoueur;i++){
            System.out.println("nom du joueur" +(i+1));
            String nomJoueur = scanner.next();
            System.out.println("Quel hero voulez vous jouer ");
            String typeJoueur = scanner.next();
            Hero hero = null;
            if (typeJoueur.equals("Warrior")){
                 hero = new Warrior(nomJoueur);

            }
            else if (typeJoueur.equals("Mage")){
                 hero = new Mage(nomJoueur);
            }
            else if (typeJoueur.equals("Healer")){
                 hero = new Healer(nomJoueur);
            }
            else if (typeJoueur.equals("Fighter")){
                 hero = new Fighter(nomJoueur);
            }



            myGame.heroes.add(hero);

        }
        System.out.println(myGame.heroes.toString());

        launch();


    }


}
