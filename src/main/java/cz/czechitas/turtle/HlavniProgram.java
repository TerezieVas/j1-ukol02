package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void trojuhelnik (double zakladna, double uhelB, double strana) {
        zofka.turnRight(90);
        zofka.move(zakladna);
        zofka.turnLeft(180-uhelB);
        zofka.move(strana);
        double uhelC = (180-(uhelB*2));
        zofka.turnLeft(180-uhelC);
        zofka.move(strana);
        zofka.turnLeft(180-uhelB);
        zofka.turnLeft(90);
    }
    public void ctverec (double stranaCt){
        zofka.turnRight(90);
        for (int i=0; i<4; i++) {
            zofka.move(stranaCt);
            zofka.turnLeft(90);
        }
        zofka.turnLeft(90);
    }


    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.
//        trojuhelnik(50, 70, 70);
        ctverec(50);
    }

}
