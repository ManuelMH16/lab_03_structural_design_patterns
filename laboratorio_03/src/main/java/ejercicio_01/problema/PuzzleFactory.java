package ejercicio_01.problema;

public class PuzzleFactory extends GameFactory {
    @Override
    public Game createGame() {
        return new Game() {
            {
                this.name = "Puzzle Master";
                this.genre = "Puzzle";
            }
            @Override
            public void start() {
                System.out.println("Iniciando juego de Puzzle...");
            }
        };
    }
}
