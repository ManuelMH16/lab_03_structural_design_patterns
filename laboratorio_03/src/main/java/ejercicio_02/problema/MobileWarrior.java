package ejercicio_02.problema;

public class MobileWarrior extends Character {
    public MobileWarrior() {
        this.name = "Guerrero Mobile";
        this.platform = "Mobile";
    }
    @Override
    public void attack() {
        System.out.println("Guerrero Mobile ataca con efectos básicos");
    }
}
