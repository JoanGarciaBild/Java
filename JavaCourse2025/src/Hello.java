public class Hello {
    public static void main(String[] args) {
//
//        System.out.println("Hello Tim");
//
//        boolean isAlien = false;
//        if(isAlien == false){
//            System.out.println("It is not an alien!");
//        }
//
//        int topScore = 80;
//        if(topScore <= 100){
//            System.out.println("You got the high score!");
//        }
//
//        int secondTopScore = 60;
//        if((topScore > secondTopScore) || (topScore < 100)){
//            System.out.println("Greater than second top score and less than 100");
//        }
//
//        int newValue = 50;
//        if(newValue == 50){
//            System.out.println("This isn't an error");
//        }
//
//        boolean isCar = false;
//        if(isCar != true){
//            System.out.println("This is not supposed to happen");
//        }
//
//        String makeOfCar = "Volkswagen";
//        boolean isDomestic = makeOfCar == "Volkswagen" ? true : false;
//
//       if(isDomestic){
//           System.out.println("This car is domestic to our country");
//       }

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double totalDouble = (myFirstDouble + mySecondDouble) * 100.00d;
        double remaider = (totalDouble % 40.00d);
        boolean myBoolean = remaider == 0.00d ? true : false;
        System.out.println("Result = " + myBoolean);

        if(myBoolean != true){
            System.out.println("Got some remainder");
        }

    }
}
