import java.util.ArrayList;


public class HamburgerBrett {

    static ArrayList<Hamburger> brett = new ArrayList<>();
    static final int kapasitet = 4;

    int teller = 0;


    public static synchronized boolean erBrettFullt(){
        return brett.size() >= kapasitet;
    }

    public synchronized boolean erBrettTomt(){
        return brett.isEmpty();
    }





    //oppretter et brett
    public synchronized ArrayList HamburgerBrett(){
        brett = new ArrayList<Hamburger>(kapasitet);
        teller++;

        return brett;
    }


    public synchronized int getBrettNummer() {
        return teller;
    }


    public static synchronized boolean leggPaa(Hamburger h) {

        if(erBrettFullt() ) {
            return false;
            HamburgerBrett b = new HamburgerBrett();

        }
        brett.add(h);
    }

        public synchronized void taAv(){
                brett.remove();
        }











}//Class
