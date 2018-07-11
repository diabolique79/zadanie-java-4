public class MainTest {

    public static void main(String[] args) {

        Televisor televisor = new Televisor(true);
        televisor.showStatus();
        Televisor televisor1 = new Televisor(false);
        televisor1.turnOn();
        televisor1.showStatus();
        Televisor televisor2 = new Televisor(true);
        televisor2.turnOff();
        televisor2.showStatus();
    }
}
