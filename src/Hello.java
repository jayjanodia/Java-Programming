public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Jay Janodia");
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am not scared of aliens");
        }

        int topScore = 99;
        if (topScore >= 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if (topScore < 100 && topScore > secondTopScore) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}