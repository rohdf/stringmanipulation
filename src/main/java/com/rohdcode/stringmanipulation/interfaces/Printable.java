package com.rohdcode.stringmanipulation.interfaces;


/**
 * - Avec @FunctionalInterface le compilateur comprend que cette 
 * interface aura toujours une seul méthode
 * 
 * - @FunctionalInterface sont utiliser pour définir une interface avec une 
 * seule méthode pour l'utilisation de Lambda Function
 */
@FunctionalInterface
public interface Printable {

	String print(String prefix, String suffix);
}
