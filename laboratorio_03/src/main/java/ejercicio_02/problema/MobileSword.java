package ejercicio_02.problema;

public class MobileSword extends Weapon {
    public MobileSword() {
        this.name = "Espada Mobile";
        this.platform = "Mobile";
    }
    @Override
    public void use() {
        System.out.println("Espada Mobile con gráficos simples");
    }
}
