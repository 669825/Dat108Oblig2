public class Hamburger {


    private static int hamburgernummer;
    private static int teller = 1;

    public Hamburger() {
        this.hamburgernummer = teller++;
    }

    public static int getHamburgerNummer() {
        return hamburgernummer;
    }


}
