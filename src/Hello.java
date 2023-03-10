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
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both the conditions are True");
        }

        int newValue = 50;
        if ((newValue = 100) == 100) {
            System.out.println("This is not an error");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This will not print out");
        }

        if (!isCar) {
            System.out.println("This will print out");
        }

        // Ternary Operator: operator1? operator2: operator3. If operator1 then operator2 else operator3
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen"? true: false;

        if (isDomestic) {
            System.out.println("This car is domestic to Germany");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double variable = 20.00d;
        double second_variable = 80.00d;
        double output = ((variable + second_variable) * 100d) % 40.00d;
        boolean boolean_var = (output == 0.00) ? true : false;
        System.out.println(boolean_var);
        if (!boolean_var) {
            System.out.println("The Remainder is" + output);
        }
    }
}