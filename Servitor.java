import static jdk.internal.org.jline.utils.Colors.h;

public class Servitor implements Runnable{


    public Servitor(String navn){

    }
    @Override
    public void run() {

        try {

            if(!HamburgerBrett.leggPaa(h)){
                Thread.currentThread().wait();
                HamburgerBrett b = new HamburgerBrett();
                b.add(h);
            }
            this.brett.add(h);
            notify();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "(Kokk) legger på hamburger" +
                + Hamburger.getHamburgerNummer() + ". Brett: [ " + brett.getBrettNummer() + " ]" );
    }

    }
}