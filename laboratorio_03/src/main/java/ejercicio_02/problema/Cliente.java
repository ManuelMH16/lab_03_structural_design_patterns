/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02.problema;

/**
 *
 * @author jacks
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    GameElementFactory factory;

    // Cambia la fábrica según la plataforma
    factory = new PCFactory();
    Character pcWarrior = factory.createWarrior();
    Weapon pcSword = factory.createSword();
    pcWarrior.attack();
    pcSword.use();

    factory = new MobileFactory();
    Character mobileWarrior = factory.createWarrior();
    Weapon mobileSword = factory.createSword();
    mobileWarrior.attack();
    mobileSword.use();
    }

}
