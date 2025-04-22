package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void trojuhelnik (double zakladna, double uhelB, double strana, Color barvaCary) {
        zofka.setPenColor(barvaCary);
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
    public void ctverec (double stranaCt, Color barvaCary){
        zofka.setPenColor(barvaCary);
        zofka.turnRight(90);
        for (int i=0; i<4; i++) {
            zofka.move(stranaCt);
            zofka.turnLeft(90);
        }
        zofka.turnLeft(90);
    }

    public void obdelnik (double stranaOA, double stranaOB, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.turnRight(90);
        for (int i=0; i<2; i++) {
            zofka.move(stranaOA);
            zofka.turnLeft(90);
            zofka.move(stranaOB);
            zofka.turnLeft(90);
        }
        zofka.turnLeft(90);
    }

    public void kolecko (double stranaK, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.turnRight(90);
        for (int i=0; i<12; i++) {
            zofka.move(stranaK);
            zofka.turnLeft(30);
        }
        zofka.turnLeft(90);
    }
    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.
Color cervenaBarva;
cervenaBarva = new Color(250,0,50);
Color oranzovaBarva;
oranzovaBarva = new Color(200, 100, 0);

zofka.penUp();
zofka.turnLeft(90);
zofka.move(300);
zofka.turnLeft(90);
zofka.penDown(); //presun na misto zmrzliny

trojuhelnik(100,70,150,oranzovaBarva);
zofka.penUp();
zofka.turnRight(90);
zofka.move(65);
zofka.turnLeft(90);
zofka.move(35);
zofka.turnLeft(180);
zofka.penDown();
kolecko(28, cervenaBarva);
zofka.penUp(); //zmrzlina

        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.move(200);// presun na misto snehulaka

Color modraBarva;
modraBarva = new Color(0,100,250);
zofka.penDown();
kolecko(30,modraBarva);
zofka.turnRight(90);
zofka.penUp();
zofka.move(40);
zofka.turnRight(90);
zofka.penDown();
kolecko(50,modraBarva);
zofka.penUp();
zofka.move(185);
zofka.turnLeft(90);
zofka.move(5);
zofka.turnRight(90);
zofka.penDown();
kolecko(70,modraBarva);

zofka.penUp();
zofka.turnRight(180);
zofka.move(105);
zofka.turnRight(90);
zofka.move(65);
zofka.penDown();
kolecko(20,modraBarva);
zofka.penUp();
zofka.turnRight(180);
zofka.move(190);
zofka.turnLeft(90);
zofka.move(20);
zofka.turnRight(90);
zofka.penDown();
kolecko(20,modraBarva);
zofka.penUp();//snehulak
    }

}
