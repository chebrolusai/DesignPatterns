public class Brute implements Enemy{
    String type = "BRUTE";
    String weakness = "Mermaids";
    String superPower;

    public Brute(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public String getSuperPower() {
        return superPower;
    }
}
