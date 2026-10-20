package com.example;

import com.example.config.AppConfig;
import com.example.metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();

        // Active le profil de production
        context.getEnvironment().setActiveProfiles("prod");

        // Charge la configuration Spring
        context.register(AppConfig.class);
        context.refresh();

        // Récupère le bean métier
        IMetier metier = context.getBean(
                com.example.metier.MetierImpl.class
        );

        // Exécute le calcul
        double resultat = metier.calcul();
        System.out.println("Résultat final : " + resultat);

        // Ferme le conteneur
        context.close();
    }
}
