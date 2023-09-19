import java.util.Random;

public class Kokk implements Runnable {


    @Override
    public void run() {
        try {
            Hamburger h = new Hamburger();

            if(brett.erBrettFullt() ){
                Thread.currentThread().wait();
                HamburgerBrett b = new HamburgerBrett();
                b.add(h);
            }
            this.brett.add(h);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "(Kokk) legger på hamburger" +
                + Hamburger.getHamburgerNummer() + ". Brett: [ " + brett.getBrettNummer() + " ]" );
    }

    public static void main(String[] args){

        Thread Anne = new Thread( new Kokk() );
        Thread Erik = new Thread( new Kokk() );
        Thread Knut = new Thread( new Kokk() );


    }







}//Class
