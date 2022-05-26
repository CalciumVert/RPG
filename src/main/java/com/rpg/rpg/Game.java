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
    Rectangle rectangle = new Rectangle();
    Group root = new Group(rectangle);
    List<Hero> heroes = new ArrayList<>();
    List<Ennemy> ennemies = new ArrayList<>();
    @Override


    public void start(Stage stage) {


        rectangle.setX(300.0f);
        rectangle.setY(150.0f);
        rectangle.setWidth(1000.0f);
        rectangle.setHeight(500.0f);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);


       // AnchorPane root = new AnchorPane();


        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

        Rectangle sol = new Rectangle();
        sol.setX(300.0f);
        sol.setY(580.0f);
        sol.setWidth(1000.0f);
        sol.setHeight(70.0f);
        sol.setFill(Color.GREEN);
        root.getChildren().add(sol);


        //sets Boss picture
        Image photoBoss = new Image("file:assets/photoBoss.png");
        ImageView imBoss = new ImageView();
        imBoss.setImage(photoBoss);
        imBoss.setX(1100);
        imBoss.setY(440);
        imBoss.setPreserveRatio(true);
        imBoss.setFitWidth(100);
        root.getChildren().add(imBoss);



    }

    public static void main(String[] args) {


        Game myGame = new Game();
        myGame.ennemies.add(new Boss());
        myGame.ennemies.add(new BasicEnnemy());
        myGame.heroes.add(new Warrior("jean"));
        myGame.heroes.add(new Mage("calcelmo"));


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
                 myGame.root.getChildren().add(hero);

            }
            else if (typeJoueur.equals("Mage")){
                 hero = new Mage(nomJoueur);
                 myGame.root.getChildren().add(hero);
            }
            else if (typeJoueur.equals("Healer")){
                 hero = new Healer(nomJoueur);
                 myGame.root.getChildren().add(hero);
            }
            else if (typeJoueur.equals("Fighter")){
                 hero = new Fighter(nomJoueur);
                 myGame.root.getChildren().add(hero);
            }



            myGame.heroes.add(hero);

        }
        System.out.println(myGame.heroes.toString());

        launch();
    }
}
