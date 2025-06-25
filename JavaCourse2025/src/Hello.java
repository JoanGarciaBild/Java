public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello Tim");

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if(topScore <= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) || (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This isn't an error");
        }

        boolean isCar = false;
        if(isCar != true){
            System.out.println("This is not supposed to happen");
        }

    }
}
