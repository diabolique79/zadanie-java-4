public class Televisor {

    boolean isOff = true;

    Televisor (boolean isOff) {

        this.isOff = isOff;
    }

    void turnOn() {

        boolean isOff = false;
        System.out.println("Następuje włączenie telewizora");
    }

    void turnOff(){

        boolean isOff = true;

        System.out.println("Następuje wyłączenie telewizora");
    }

    void showStatus(){

if (isOff == true) {

    System.out.println("Telewizor wyłączony");
}
else if (isOff == false){

    System.out.println("Telewizor włączony");
}



    }
}
