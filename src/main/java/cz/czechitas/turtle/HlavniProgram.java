package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }
//prvni varianta trojuhelniku s jednim udajem navic. V nekterych pripadech blbe pocita
    /* public void trojuhelnik (double zakladna, double uhelB, double strana, Color barvaCary) {
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
    } */

    public void trojuhelnik (double zakladna, double strana, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.turnRight(90);
        zofka.move(zakladna); // stejne jako predchozi varianta
       var uhelA =180-90-(Math.toDegrees(Math.asin(((zakladna/2)/strana))));
       //pres sinus pocita uhly alfa a beta: spocita sin 1/2 gama uhlu, prevede na stupne
        // a odectenim dojde k alfa uhlu
        zofka.turnLeft(180-uhelA);
        zofka.move(strana);
        zofka.turnLeft(180-(180-(uhelA*2)));
        zofka.move(strana);
        zofka.turnLeft(180-uhelA);
        zofka.turnLeft(90);
    }
    public void pravouhlyTrojuhelnik (double strana, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.turnRight(90);
        var zakladna = Math.sqrt(2*Math.pow(strana, 2));//pocita pres Pythagorovu vetu
        zofka.move(zakladna);
        zofka.turnLeft(180-45);
        zofka.move(strana);
        zofka.turnLeft(180-90);
        zofka.move(strana);
        zofka.turnLeft(180-45);
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

        trojuhelnik(100,150,oranzovaBarva);//kornout
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(65);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.turnLeft(180);
        zofka.penDown();//presun na misto kopecku
        kolecko(28, cervenaBarva);//kopecek
        zofka.penUp(); //kompletni zmrzlina

        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.move(200);// presun na misto snehulaka

        Color modraBarva;
        modraBarva = new Color(0,100,250);
        zofka.penDown();
        kolecko(30,modraBarva);//hlava snehulaka
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(40);
        zofka.turnRight(90);
        zofka.penDown();
        kolecko(50,modraBarva);//telo
        zofka.penUp();
        zofka.move(185);
        zofka.turnLeft(90);
        zofka.move(5);
        zofka.turnRight(90);
        zofka.penDown();
        kolecko(70,modraBarva);//dolni cast

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(105);
        zofka.turnRight(90);
        zofka.move(65);
        zofka.penDown();
        kolecko(20,modraBarva);//prava ruka
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(190);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnRight(90);
        zofka.penDown();
        kolecko(20,modraBarva);//leva ruka
        zofka.penUp();//snehulak

        zofka.turnRight(180);//presun na misto vlacku
        zofka.move(700);
        zofka.penDown();
        obdelnik(300,210,cervenaBarva);//budka
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.penDown();
        obdelnik(150,250,oranzovaBarva);//motor
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(28);
        zofka.turnRight(90);
        zofka.penDown();
        kolecko(57,modraBarva);//velke kolo
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnLeft(90);//presun na misto radlice
        Color zelenaBarva;
        zelenaBarva = new Color(0,230,100);
        zofka.penDown();
        zofka.turnLeft(135);
        pravouhlyTrojuhelnik(150, zelenaBarva);//radlice
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penDown();
        kolecko(25, modraBarva);//leve kolecko
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.penDown();
        kolecko(25,modraBarva);//prave kolecko
    }

}
