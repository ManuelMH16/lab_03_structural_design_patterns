package ejercicio_02.problema;

public class PCWarrior extends Character {
    public PCWarrior() {
        this.name = "Guerrero PC";
        this.platform = "PC";
    }
    @Override
    public void attack() {
        System.out.println("Guerrero PC ataca con efectos en HD");
    }
}
