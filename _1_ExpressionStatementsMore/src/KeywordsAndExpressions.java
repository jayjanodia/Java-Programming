public class KeywordsAndExpressions {
    public static void main(String[] args) {
        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;
        }

        int health = 100;
        // Expressions: (health < 25), (highScore > 1000), ((health < 25) && (highScore > 1000))
        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}