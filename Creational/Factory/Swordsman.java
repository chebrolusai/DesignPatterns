public class Swordsman implements Enemy{
    String type = "SWORDSMAN";
    String weakness = "Cake";
    String superPower;

    public Swordsman(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public String getSuperPower() {
        return superPower;
    }
}
