public class Main {

    public static void main(String[] args) {

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);

        if (myVariable == 0){
            System.out.printf("Its' new Zero");
        }

//            double kilometers = (100 * 1.609344);
//
//            int highScore = 50;
//
//            if(highScore > 25){
//                highScore = 1000 + highScore; // add bonus points
//            }
//
//            int health = 100;
//
//            if((health < 25) && (highScore > 1000)){
//                highScore = highScore - 1000;
//            }
    }

}
