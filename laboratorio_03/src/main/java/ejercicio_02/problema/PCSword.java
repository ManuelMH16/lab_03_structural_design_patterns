package ejercicio_02.problema;

public class PCSword extends Weapon {
    public PCSword() {
        this.name = "Espada PC";
        this.platform = "PC";
    }
    @Override
    public void use() {
        System.out.println("Espada PC con gráficos detallados");
    }
}
