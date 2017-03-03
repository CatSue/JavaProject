package fr.epsi.poe.hardis.tu;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by T'Chi on 28/02/2017.
 */

class RestaurantTest {

    //vérification qu'un restaurant est ouvert par defaut
    @Test
    public void testThatRestaurantIsOpenByDefault() {
        /**
         * Arrange
         * Créer le contexte du test, création des objets nécessaires à l'exécution du test
         * Utilisation du constructeur par defaut
         */
        Restaurant restaurant = new Restaurant();

        /**
         * Act
         * action sur l'objet, on va vérifier que le restaurant est ouvert
         */
        boolean etat = restaurant.isOuverture();

        /**
         * Assert
         */
        Assertions.assertTrue(etat); //vérifie que l'état est bien vrai
    }

    //vérification quand on set n° de téléphone si le n° commence par +33 sauvegarde
    @Test
    public void testThatSaveTheValidNumber() {
        // Arrange
        Restaurant restaurant = new Restaurant();
        // Act
        restaurant.setTelephone("+33605020305");
        // Assert
        Assertions.assertEquals("+33605020305", restaurant.getTelephone());
    }

    //vérification quand on set n° de téléphone si le n° ne commence par +33 pas de sauvegarde
    @Test
    public void testThatNotSaveTheInvalidNumber() {
        // Arrange
        Restaurant restaurant = new Restaurant();
        // Act
        restaurant.setTelephone("0605020305");
        // Assert
        Assertions.assertNotEquals("0605020305", restaurant.getTelephone());
    }

    //vérification qu'il est possible de stocker des départements corses (cas limite)
    @Test
    public void testThatCorseIsOk() {

    }
}