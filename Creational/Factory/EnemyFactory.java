public class EnemyFactory {
    // You can make this a singleton class, or expose a static method ( one instance is enough )
    public static Enemy getEnemy(int type) {
        if(type % 2 == 0) {
            return new Brute("Strength");
        }
        return new Swordsman("Speed");
    }
}
