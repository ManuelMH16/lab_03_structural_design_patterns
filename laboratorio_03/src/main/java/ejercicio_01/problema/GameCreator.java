/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01.problema;

/**
 *
 * @author jacks
 */

public abstract class GameFactory {
    public abstract Game createGame();

    public void playGame() {
        Game game = createGame();
        game.start();
        System.out.println(game.getInfo());
    }
}
