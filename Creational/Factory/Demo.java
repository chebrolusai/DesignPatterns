import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        Random random = new Random();
        int enemyTerritory = random.nextInt(10);

        int moves = 3;

        while(moves > 0) {
            // you go to some territory, each territory maps to some enemy
            Enemy e1 = EnemyFactory.getEnemy(enemyTerritory);
            System.out.println("Enemy Strength: " + e1.getSuperPower());
            enemyTerritory += random.nextInt(10);
            moves--;
        }

    }
}
