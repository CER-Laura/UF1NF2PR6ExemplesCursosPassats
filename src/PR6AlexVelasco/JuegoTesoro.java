/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PR6AlexVelasco;

import java.util.Scanner;

/**
 *
 * @author velas
 */
public class JuegoTesoro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        int fin = 0;
        int fila = 0;
        int pociones = 0;
        int col = 3;
        int vidaP = 100;
        int MasAlla = 0;
        do {
            System.out.println("Selecciona una opcion.");
            System.out.println("Jugar" + "(PULSA 1)");
            System.out.println("Instrucciones" + "(PULSA 2");
            System.out.println("Salir" + "(PULSA3)");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    int eleccion2 = 0;
                    char[][] mapa = {{'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}};
                    char[][] mapa3 = {{'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}};
                    char[][] mapa4 = {{'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-'}};
                    char[][] mapa5 = {{'-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-'}};
                    char[][] mapa2 = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
                    char[][] mapaD = {{'X', 'X', 'X', '-', 'X'}, {'X', 'X', 'X', '-', 'X'}, {'X', '-', '-', '-', 'X'}, {'X', 'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X', 'X'}};
                    char[][] mapaI = {{'X', 'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X', 'X'}, {'X', '-', '-', '-', 'X'}, {'X', 'X', 'X', '-', 'X'}, {'X', 'X', 'X', '-', 'X'}};
                    String[] preg = {"¿Que es mas importante para ti?", "¿Crees que tu vida ha sido buena?", "¿Si consiguieses mucho dinero para que lo usarías?", "¿Que harias ante un desastre que ha probocado alguien?", "¿Porque crees que moriste?", "¿Donde te gustaria tener tu descanso eterno?", "¿Que mas te gustaria decirme?"};
                    int[] resp = {2, 2, 2, 3, 2, 3, 2, 2};
                    char personaje = 'P';
                    char sala = 'S';
                    char columna = 'C';
                    mapa[fila][col] = personaje;
                    mapa[6][3] = sala;
                    mapa[1][1] = columna;
                    mapa[1][5] = columna;
                    mapa[3][1] = columna;
                    mapa[3][5] = columna;
                    mapa[5][1] = columna;
                    mapa[5][5] = columna;
                    System.out.println("\33[31mTienes " + vidaP + " puntos de vida.\33[0m");
                    System.out.println("Eres una persona que quiere consegir el santo grial, para...");
                    System.out.println("Selecciona una opción.");
                    System.out.println("Quiero dinero. " + " (PULSA 1)");
                    System.out.println("Quiero la salvacion de la humanidad. " + " (PULSA 2)");
                    eleccion2 = sc.nextInt();
                    sc.nextLine();
                    switch (eleccion2) {
                        case 1:
                            fila = 0;
                            col = 1;
                            mapa2[fila][col] = 'P';
                            mapa2[2][1] = 'Q';
                            System.out.println("Tu egoismo te llevó a la muerte. supera las 7 ");
                            System.out.println("puertas de la verdad para poder disfrutar de un descanso eterno.");
                            System.out.println("Mueve tu personaje con los botones w,a,s,d.");
                            do {
                                System.out.println("  " + "1 " + "2 " + "3 ");
                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                    System.out.print(mapay + 1 + " ");
                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                        System.out.print(mapa2[mapay][mapax] + " ");
                                    }
                                    System.out.println("");
                                }
                                char wasd = sc.next().charAt(0);
                                sc.nextLine();
                                if (wasd == 'w') {
                                    if (fila - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                        System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'a') {
                                    if (col - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                        System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    }

                                } else if (wasd == 's') {
                                    if (fila + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                        System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'd') {
                                    if (col + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                        System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else {
                                    System.err.println("Tecla incorrecta.");
                                }
                            } while ('P' != mapa2[2][1]);
                            System.out.println("La primera pregunta es: " + preg[0]);
                            System.out.println("El dinero OVIAMENTE (PULSA 1)");
                            System.out.println("El bien de los demas (PULSA 2)");
                            int respuesta = sc.nextInt();
                            sc.nextLine();
                            if (respuesta == resp[0]) {
                                MasAlla++;
                            }
                            fila = 0;
                            col = 1;
                            mapa2[fila][col] = 'P';
                            mapa2[2][1] = 'Q';
                            do {
                                System.out.println("  " + "1 " + "2 " + "3 ");
                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                    System.out.print(mapay + 1 + " ");
                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                        System.out.print(mapa2[mapay][mapax] + " ");
                                    }
                                    System.out.println("");
                                }
                                char wasd = sc.next().charAt(0);
                                sc.nextLine();
                                if (wasd == 'w') {
                                    if (fila - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                        System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'a') {
                                    if (col - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                        System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    }

                                } else if (wasd == 's') {
                                    if (fila + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                        System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'd') {
                                    if (col + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                        System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else {
                                    System.err.println("Tecla incorrecta.");
                                }
                            } while ('P' != mapa2[2][1]);
                            System.out.println("La segunda pregunta es: " + preg[1]);
                            System.out.println("Si, no me arrepiento de nada. (PULSA 1)");
                            System.out.println("No, he hecho cosas que me gustaria remediar. (PULSA 2)");
                            respuesta = sc.nextInt();
                            sc.nextLine();
                            if (respuesta == resp[1]) {
                                MasAlla++;
                            }
                            fila = 0;
                            col = 1;
                            mapa2[fila][col] = 'P';
                            mapa2[2][1] = 'Q';
                            do {
                                System.out.println("  " + "1 " + "2 " + "3 ");
                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                    System.out.print(mapay + 1 + " ");
                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                        System.out.print(mapa2[mapay][mapax] + " ");
                                    }
                                    System.out.println("");
                                }
                                char wasd = sc.next().charAt(0);
                                sc.nextLine();
                                if (wasd == 'w') {
                                    if (fila - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                        System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'a') {
                                    if (col - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                        System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    }

                                } else if (wasd == 's') {
                                    if (fila + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                        System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'd') {
                                    if (col + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                        System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else {
                                    System.err.println("Tecla incorrecta.");
                                }
                            } while ('P' != mapa2[2][1]);
                            System.out.println("La tercera pregunta es: " + preg[2]);
                            System.out.println("En mi mismo, no necesito a nadie. (PULSA 1)");
                            System.out.println("En ayudar a los demas, la soledad puede ser cruel. (PULSA 2)");
                            System.out.println("En mi familia, es lo mas importante para mi. (PULSA 3)");
                            respuesta = sc.nextInt();
                            sc.nextLine();
                            if (respuesta == resp[2] || respuesta == resp[3]) {
                                MasAlla++;
                            }
                            fila = 0;
                            col = 1;
                            mapa2[fila][col] = 'P';
                            mapa2[2][1] = 'Q';
                            do {
                                System.out.println("  " + "1 " + "2 " + "3 ");
                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                    System.out.print(mapay + 1 + " ");
                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                        System.out.print(mapa2[mapay][mapax] + " ");
                                    }
                                    System.out.println("");
                                }
                                char wasd = sc.next().charAt(0);
                                sc.nextLine();
                                if (wasd == 'w') {
                                    if (fila - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                        System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'a') {
                                    if (col - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                        System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    }

                                } else if (wasd == 's') {
                                    if (fila + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                        System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'd') {
                                    if (col + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                        System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else {
                                    System.err.println("Tecla incorrecta.");
                                }
                            } while ('P' != mapa2[2][1]);
                            System.out.println("La cuarta pregunta es: " + preg[3]);
                            System.out.println("¿Porque deberia importarme? (PULSA 1)");
                            System.out.println("Si, el desastre lo ha probocado alguien conocido intento hacerle entrar en razón. (PULSA 2)");
                            System.out.println("Una cosa asi no tiene perdón. (PULSA 3)");
                            respuesta = sc.nextInt();
                            sc.nextLine();
                            if (respuesta == resp[4] || respuesta == resp[5]) {
                                MasAlla++;
                            }
                            fila = 0;
                            col = 1;
                            mapa2[fila][col] = 'P';
                            mapa2[2][1] = 'Q';
                            do {
                                System.out.println("  " + "1 " + "2 " + "3 ");
                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                    System.out.print(mapay + 1 + " ");
                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                        System.out.print(mapa2[mapay][mapax] + " ");
                                    }
                                    System.out.println("");
                                }
                                char wasd = sc.next().charAt(0);
                                sc.nextLine();
                                if (wasd == 'w') {
                                    if (fila - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                        System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'a') {
                                    if (col - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                        System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    }

                                } else if (wasd == 's') {
                                    if (fila + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                        System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'd') {
                                    if (col + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                        System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else {
                                    System.err.println("Tecla incorrecta.");
                                }
                            } while ('P' != mapa2[2][1]);
                            System.out.println("La quinta pregunta es: " + preg[4]);
                            System.out.println("Por mi egoísmo. (PULSA 1)");
                            System.out.println("Por un movimiento en falso. (PULSA 2)");
                            respuesta = sc.nextInt();
                            sc.nextLine();
                            if (respuesta == resp[6]) {
                                MasAlla++;
                            }
                            fila = 0;
                            col = 1;
                            mapa2[fila][col] = 'P';
                            mapa2[2][1] = 'Q';
                            do {
                                System.out.println("  " + "1 " + "2 " + "3 ");
                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                    System.out.print(mapay + 1 + " ");
                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                        System.out.print(mapa2[mapay][mapax] + " ");
                                    }
                                    System.out.println("");
                                }
                                char wasd = sc.next().charAt(0);
                                sc.nextLine();
                                if (wasd == 'w') {
                                    if (fila - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                        System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'a') {
                                    if (col - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                        System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    }

                                } else if (wasd == 's') {
                                    if (fila + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                        System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'd') {
                                    if (col + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                        System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else {
                                    System.err.println("Tecla incorrecta.");
                                }
                            } while ('P' != mapa2[2][1]);
                            System.out.println("La sexta pregunta es: " + preg[5]);
                            System.out.println("Al cielo (PULSA 1)");
                            System.out.println("Al infierno (PULSA 2)");
                            respuesta = sc.nextInt();
                            sc.nextLine();
                            if (respuesta == resp[7]) {
                                MasAlla++;
                            }
                            fila = 0;
                            col = 1;
                            mapa2[fila][col] = 'P';
                            mapa2[2][1] = 'Q';
                            do {
                                System.out.println("  " + "1 " + "2 " + "3 ");
                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                    System.out.print(mapay + 1 + " ");
                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                        System.out.print(mapa2[mapay][mapax] + " ");
                                    }
                                    System.out.println("");
                                }
                                char wasd = sc.next().charAt(0);
                                sc.nextLine();
                                if (wasd == 'w') {
                                    if (fila - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                        System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'a') {
                                    if (col - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                        System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col - 1;
                                        mapa2[fila][col] = 'P';
                                    }

                                } else if (wasd == 's') {
                                    if (fila + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                        System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else if (wasd == 'd') {
                                    if (col + 1 > 2) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                        System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    } else {
                                        mapa2[fila][col] = '-';
                                        col = col + 1;
                                        mapa2[fila][col] = 'P';
                                    }
                                } else {
                                    System.err.println("Tecla incorrecta.");
                                }
                            } while ('P' != mapa2[2][1]);
                            System.out.println("La última pregunta es: " + preg[6]);
                            char respuestaU = sc.next().charAt(0);
                            sc.nextLine();
                            if (MasAlla >= 3) {
                                mapaD[2][0] = 'P';
                                mapaD[0][4] = 'D';
                                mapaD[4][4] = 'I';

                                do {
                                    System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 ");
                                    for (int mapay = 0; mapay < mapaD.length; mapay++) {
                                        System.out.print(mapay + 1 + " ");
                                        for (int mapax = 0; mapax < mapaD[mapay].length; mapax++) {
                                            System.out.print(mapaD[mapay][mapax] + " ");
                                        }
                                        System.out.println("");
                                    }
                                    char wasd = sc.next().charAt(0);
                                    sc.nextLine();
                                    if (wasd == 'w') {
                                        if (fila - 1 < 0) {
                                            System.err.println("Te has salido del mapa.");
                                        } else if (mapaD[fila - 1][col] == 'X') {
                                            System.err.println("Te has chocado con un muro.");
                                        } else {
                                            mapaD[fila][col] = '-';
                                            fila = fila - 1;
                                            mapaD[fila][col] = 'P';
                                        }
                                    } else if (wasd == 'a') {
                                        if (col - 1 < 0) {
                                            System.err.println("Te has salido del mapa.");
                                        } else if (mapaD[fila][col - 1] == 'X') {
                                            System.err.println("Te has chocado con un muro.");
                                        } else {
                                            mapaD[fila][col] = '-';
                                            col = col - 1;
                                            mapaD[fila][col] = 'P';
                                        }

                                    } else if (wasd == 's') {
                                        if (fila + 1 > 4) {
                                            System.err.println("Te has salido del mapa.");
                                        } else if (mapaD[fila + 1][col] == 'X') {
                                            System.err.println("Te has chocado con un muro.");
                                        } else {
                                            mapaD[fila][col] = '-';
                                            fila = fila + 1;
                                            mapaD[fila][col] = 'P';
                                        }
                                    } else if (wasd == 'd') {
                                        if (col + 1 > 4) {
                                            System.err.println("Te has salido del mapa.");
                                        } else if (mapaD[fila][col + 1] == 'X') {
                                            System.err.println("Te has chocado con un muro.");
                                        } else {
                                            mapaD[fila][col] = '-';
                                            col = col + 1;
                                            mapaD[fila][col] = 'P';
                                        }
                                    } else {
                                        System.err.println("Tecla incorrecta.");
                                    }
                                } while ('P' != mapaD[0][4]);
                                System.out.println("La diosa Ereskigal ha decidido que disfrutaras de un merecido descanso en el paraiso donde todos descansan en paz.");
                            } else {
                                fila = 2;
                                col = 0;
                                mapaI[fila][col] = 'P';
                                mapaI[0][4] = 'D';
                                mapaI[4][4] = 'I';
                                do {
                                    System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 ");
                                    for (int mapay = 0; mapay < mapaI.length; mapay++) {
                                        System.out.print(mapay + 1 + " ");
                                        for (int mapax = 0; mapax < mapaI[mapay].length; mapax++) {
                                            System.out.print(mapaI[mapay][mapax] + " ");
                                        }
                                        System.out.println("");
                                    }
                                    char wasd = sc.next().charAt(0);
                                    sc.nextLine();
                                    if (wasd == 'w') {
                                        if (fila - 1 < 0) {
                                            System.err.println("Te has salido del mapa.");
                                        } else if (mapaI[fila - 1][col] == 'X') {
                                            System.err.println("Te has chocado con un muro.");
                                        } else {
                                            mapaI[fila][col] = '-';
                                            fila = fila - 1;
                                            mapaI[fila][col] = 'P';
                                        }
                                    } else if (wasd == 'a') {
                                        if (col - 1 < 0) {
                                            System.err.println("Te has salido del mapa.");
                                        } else if (mapaI[fila][col - 1] == 'X') {
                                            System.err.println("Te has chocado con un muro.");
                                        } else {
                                            mapaI[fila][col] = '-';
                                            col = col - 1;
                                            mapaI[fila][col] = 'P';
                                        }

                                    } else if (wasd == 's') {
                                        if (fila + 1 > 4) {
                                            System.err.println("Te has salido del mapa.");
                                        } else if (mapaI[fila + 1][col] == 'X') {
                                            System.err.println("Te has chocado con un muro.");
                                        } else {
                                            mapaI[fila][col] = '-';
                                            fila = fila + 1;
                                            mapaI[fila][col] = 'P';
                                        }
                                    } else if (wasd == 'd') {
                                        if (col + 1 > 4) {
                                            System.err.println("Te has salido del mapa.");
                                        } else if (mapaI[fila][col + 1] == 'X') {
                                            System.err.println("Te has chocado con un muro.");
                                        } else {
                                            mapaI[fila][col] = '-';
                                            col = col + 1;
                                            mapaI[fila][col] = 'P';
                                        }
                                    } else {
                                        System.err.println("Tecla incorrecta.");
                                    }
                                } while ('P' != mapaI[4][4]);
                                System.out.println("La diosa Ereskigal ha decidido que vas al infierno, tus decisiones fueron erroneas asi que aqui esta lo que te mereces.");
                            }
                            break;
                        case 2:
                            System.out.println("Ese deseo dará fuerzas en tu viaje.");
                            System.out.println("Mueve tu personaje con los botones w,a,s,d.");
                            do {
                                System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 " + "6 " + "7 ");
                                for (int mapay = 0; mapay < mapa.length; mapay++) {
                                    System.out.print(mapay + 1 + " ");
                                    for (int mapax = 0; mapax < mapa[mapay].length; mapax++) {
                                        System.out.print(mapa[mapay][mapax] + " ");
                                    }
                                    System.out.println("");
                                }
                                char wasd = sc.next().charAt(0);
                                sc.nextLine();
                                if (wasd == 'w') {
                                    if (fila - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa[fila - 1][col] == 'C') {
                                        System.err.println("Te has chocado contra una columna.");
                                    } else {
                                        mapa[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa[fila][col] = 'P';
                                    }
                                } else if (wasd == 'a') {
                                    if (col - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa[fila][col - 1] == 'C') {
                                        System.err.println("Te has chocado contra una columna.");
                                    } else {
                                        mapa[fila][col] = '-';
                                        col = col - 1;
                                        mapa[fila][col] = 'P';
                                    }

                                } else if (wasd == 's') {
                                    if (fila + 1 > 6) {
                                        System.err.println("Te has chocado contra una columna.");
                                    } else if (mapa[fila + 1][col] == 'C') {
                                        System.err.println("Te has salido del mapa.");
                                    } else {
                                        mapa[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa[fila][col] = 'P';
                                    }
                                } else if (wasd == 'd') {
                                    if (col + 1 > 6) {
                                        System.err.println("Te has chocado contra una columna.");
                                    } else if (mapa[fila][col + 1] == 'C') {
                                        System.err.println("Te has salido del mapa.");
                                    } else {
                                        mapa[fila][col] = '-';
                                        col = col + 1;
                                        mapa[fila][col] = 'P';
                                    }
                                } else {
                                    System.err.println("Tecla incorrecta.");
                                }
                            } while ('P' != mapa[6][3]);
                            fila = 0;
                            col = 2;
                            mapa3[fila][col] = 'P';
                            mapa3[3][5] = 'E';
                            mapa3[4][0] = 'X';
                            mapa3[4][1] = 'X';
                            mapa3[4][2] = 'X';
                            mapa3[4][3] = 'X';
                            mapa3[5][3] = 'X';
                            mapa3[5][4] = 'X';
                            mapa3[6][4] = 'X';
                            mapa3[0][0] = 'B';
                            mapa3[6][0] = 'O';
                            mapa3[6][2] = 'O';
                            do {
                                System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 " + "6 " + "7 ");
                                for (int mapay = 0; mapay < mapa3.length; mapay++) {
                                    System.out.print(mapay + 1 + " ");
                                    for (int mapax = 0; mapax < mapa3[mapay].length; mapax++) {
                                        System.out.print(mapa3[mapay][mapax] + " ");
                                    }
                                    System.out.println("");
                                }
                                char wasd = sc.next().charAt(0);
                                sc.nextLine();
                                if (wasd == 'w') {
                                    if (fila - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa3[fila - 1][col] == 'B') {
                                        mapa3[4][1] = '-';
                                        System.out.println("Has pulsado un boton.");
                                    } else if (mapa3[fila - 1][col] == 'O') {
                                        System.out.println("Has conseguido una pocion");
                                        pociones++;
                                    } else if (mapa3[fila - 1][col] == 'X') {
                                        System.out.println("Te has chocado contra una pared.");
                                    } else if (mapa3[fila - 1][col] == 'E') {
                                        System.out.println("!CUIDADO¡ te has topado con un enemigo");
                                        System.out.println("Peleas o huyes. Tu eliges.");
                                        System.out.println("Pulsa 1 si peleas, 2 si huyes.");
                                        int eleccion3 = sc.nextInt();
                                        sc.nextLine();
                                        if (eleccion3 == 1) {
                                            System.out.println("Preparate para el combate.");
                                            mapa3[fila][col] = '-';
                                            fila = fila - 1;
                                            mapa3[fila][col] = 'P';
                                        } else {
                                            System.out.println("Busca haber si te has dejado algun objeto.");
                                        }
                                    } else {
                                        mapa3[fila][col] = '-';
                                        fila = fila - 1;
                                        mapa3[fila][col] = 'P';
                                    }
                                } else if (wasd == 'a') {
                                    if (col - 1 < 0) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa3[fila][col - 1] == 'B') {
                                        mapa3[4][1] = '-';
                                        System.out.println("Has pulsado un boton.");
                                    } else if (mapa3[fila][col - 1] == 'O') {
                                        System.out.println("Has conseguido una pocion");
                                        pociones++;
                                    } else if (mapa3[fila][col - 1] == 'X') {
                                        System.out.println("Te has chocado contra una pared.");
                                    } else if (mapa3[fila][col - 1] == 'E') {
                                        System.out.println("!CUIDADO¡ te has topado con un enemigo");
                                        System.out.println("Peleas o huyes. Tu eliges.");
                                        System.out.println("Pulsa 1 si peleas, 2 si huyes.");
                                        int eleccion3 = sc.nextInt();
                                        sc.nextLine();
                                        if (eleccion3 == 1) {
                                            System.out.println("Preparate para el combate.");
                                            mapa3[fila][col] = '-';
                                            col = col - 1;
                                            mapa3[fila][col] = 'P';
                                        } else {
                                            System.out.println("Busca haber si te has dejado algun objeto.");
                                        }
                                    } else {
                                        mapa3[fila][col] = '-';
                                        col = col - 1;
                                        mapa3[fila][col] = 'P';
                                    }

                                } else if (wasd == 's') {
                                    if (fila + 1 > 6) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa3[fila + 1][col] == 'O') {
                                        System.out.println("Has conseguido una pocion");
                                        pociones++;
                                    } else if (mapa3[fila + 1][col] == 'X') {
                                        System.out.println("Te has chocado contra una pared.");
                                    } else if (mapa3[fila + 1][col] == 'E') {
                                        System.out.println("!CUIDADO¡ te has topado con un enemigo");
                                        System.out.println("Peleas o huyes. Tu eliges.");
                                        System.out.println("Pulsa 1 si peleas, 2 si huyes.");
                                        int eleccion3 = sc.nextInt();
                                        sc.nextLine();
                                        if (eleccion3 == 1) {
                                            System.out.println("Preparate para el combate.");
                                            mapa3[fila][col] = '-';
                                            fila = fila + 1;
                                            mapa3[fila][col] = 'P';
                                        } else {
                                            System.out.println("Busca haber si te has dejado algun objeto.");
                                        }
                                    } else {
                                        mapa3[fila][col] = '-';
                                        fila = fila + 1;
                                        mapa3[fila][col] = 'P';
                                    }
                                } else if (wasd == 'd') {
                                    if (col + 1 > 6) {
                                        System.err.println("Te has salido del mapa.");
                                    } else if (mapa3[fila][col + 1] == 'O') {
                                        System.out.println("Has conseguido una pocion");
                                        pociones++;
                                    } else if (mapa3[fila][col + 1] == 'X') {
                                        System.out.println("Te has chocado contra una pared.");
                                    } else if (mapa3[fila][col + 1] == 'E') {
                                        System.out.println("!CUIDADO¡ te has topado con un enemigo");
                                        System.out.println("Peleas o huyes. Tu eliges.");
                                        System.out.println("Pulsa 1 si peleas, 2 si huyes.");
                                        int eleccion3 = sc.nextInt();
                                        sc.nextLine();
                                        if (eleccion3 == 1) {
                                            System.out.println("Preparate para el combate.");
                                            mapa3[fila][col] = '-';
                                            col = col + 1;
                                            mapa3[fila][col] = 'P';
                                        } else {
                                            System.out.println("Busca haber si te has dejado algun objeto.");
                                        }
                                    } else {
                                        mapa3[fila][col] = '-';
                                        col = col + 1;
                                        mapa3[fila][col] = 'P';
                                    }
                                } else {
                                    System.err.println("Tecla incorrecta.");
                                }
                            } while ('P' != mapa3[3][5]);
                            int vidaE1 = 100;
                            int eleccion4 = 0;
                            do {
                                System.out.println("Tienes " + vidaP + " PS");
                                System.out.println("El enemigo tiene " + vidaE1 + " PS");
                                System.out.println("¿Qué quieres hacer?");
                                System.out.println("Atacar.(PULSA 1)");
                                System.out.println("Defender.(PULSA 2)");
                                System.out.println("Objeto.(PULSA 3)");
                                System.out.println("Huir.(PULSA 4)");
                                eleccion4 = sc.nextInt();
                                sc.nextLine();
                                switch (eleccion4) {
                                    case 1:

                                        System.out.println("Elige como quieres atacar:");
                                        System.out.println("Con la espada (si la tienes)(PULSA 1).");
                                        System.out.println("A puños no me gana nadie. (PULSA 2)");
                                        System.out.println("Volver. (PULSA 3)");
                                        int combate1 = sc.nextInt();
                                        sc.nextLine();
                                        if (combate1 == 1) {
                                            vidaE1 = vidaE1 - 75;
                                            vidaP = vidaP - 20;
                                        } else if (combate1 == 2) {
                                            vidaE1 = vidaE1 - 30;
                                            vidaP = vidaP - 50;
                                        } else {

                                        }
                                        break;
                                    case 2:
                                        System.out.println("Elige como defenderte:");
                                        System.out.println("Simplemente con el pecho.(PULSA 1)");
                                        System.out.println("El escudo no es mala opcion.(PULSA 2)");
                                        System.out.println("Volver.(PULSA 3)");
                                        int defensa1 = sc.nextInt();
                                        sc.nextLine();
                                        if (defensa1 == 1) {
                                            vidaP = vidaP - 15;
                                        } else if (defensa1 == 2) {
                                            vidaP = vidaP - 10;
                                        }
                                        break;
                                    case 3:
                                        System.out.println("¿Qué objeto quieres usar?");
                                        System.out.print("Pocion de curacion. (PULSA 1)");
                                        System.out.println("   " + "Tienes " + pociones + " pociones");
                                        System.out.println("Volver. (PULSA 2)");
                                        int objeto1 = sc.nextInt();
                                        sc.nextLine();
                                        if (objeto1 == 1 && pociones > 0) {
                                            if (vidaP + 50 > 100) {
                                                System.err.println("Tienes demasiada vida para usar una pocion.");
                                            } else {
                                                vidaP = vidaP + 50;
                                                vidaP = vidaP - 20;
                                                pociones--;
                                            }
                                        } else if (objeto1 == 2) {

                                        } else {
                                            System.err.println("No te quedan pociones.");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Has huido del combate.");
                                        break;
                                    default:
                                        System.err.println("No puedes hacer eso.");
                                }
                            } while (vidaE1 > 0 && vidaP > 0);
                            int opcion = 0;
                            if (vidaP <= 0) {
                                opcion++;
                                System.err.println("Has muerto. (Continua la aventura en el mas alla.)");
                            } else {
                                opcion--;
                                System.out.println("Has derrotado al enemigo y te diriges a la siguiente sala.");
                            }
                            switch (opcion) {
                                case 1:
                                    fila = 0;
                                    col = 1;
                                    mapa2[fila][col] = 'P';
                                    mapa2[2][1] = 'Q';
                                    System.out.println("Mueve tu personaje con los botones w,a,s,d.");
                                    do {
                                        System.out.println("  " + "1 " + "2 " + "3 ");
                                        for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                            System.out.print(mapay + 1 + " ");
                                            for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                System.out.print(mapa2[mapay][mapax] + " ");
                                            }
                                            System.out.println("");
                                        }
                                        char wasd = sc.next().charAt(0);
                                        sc.nextLine();
                                        if (wasd == 'w') {
                                            if (fila - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila - 1][col] == 'Q') {
                                                System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'a') {
                                            if (col - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col - 1] == 'Q') {
                                                System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            }

                                        } else if (wasd == 's') {
                                            if (fila + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila + 1][col] == 'Q') {
                                                System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'd') {
                                            if (col + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col + 1] == 'Q') {
                                                System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else {
                                            System.err.println("Tecla incorrecta.");
                                        }
                                    } while ('P' != mapa2[2][1]);
                                    System.out.println("La primera pregunta es: " + preg[0]);
                                    System.out.println("El dinero OVIAMENTE (PULSA 1)");
                                    System.out.println("El bien de los demas (PULSA 2)");
                                    respuesta = sc.nextInt();
                                    sc.nextLine();
                                    if (respuesta == resp[0]) {
                                        MasAlla++;
                                    }
                                    fila = 0;
                                    col = 1;
                                    mapa2[fila][col] = 'P';
                                    mapa2[2][1] = 'Q';
                                    do {
                                        System.out.println("  " + "1 " + "2 " + "3 ");
                                        for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                            System.out.print(mapay + 1 + " ");
                                            for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                System.out.print(mapa2[mapay][mapax] + " ");
                                            }
                                            System.out.println("");
                                        }
                                        char wasd = sc.next().charAt(0);
                                        sc.nextLine();
                                        if (wasd == 'w') {
                                            if (fila - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila - 1][col] == 'Q') {
                                                System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'a') {
                                            if (col - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col - 1] == 'Q') {
                                                System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            }

                                        } else if (wasd == 's') {
                                            if (fila + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila + 1][col] == 'Q') {
                                                System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'd') {
                                            if (col + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col + 1] == 'Q') {
                                                System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else {
                                            System.err.println("Tecla incorrecta.");
                                        }
                                    } while ('P' != mapa2[2][1]);
                                    System.out.println("La segunda pregunta es: " + preg[1]);
                                    System.out.println("Si, no me arrepiento de nada. (PULSA 1)");
                                    System.out.println("No, he hecho cosas que me gustaria remediar. (PULSA 2)");
                                    respuesta = sc.nextInt();
                                    sc.nextLine();
                                    if (respuesta == resp[1]) {
                                        MasAlla++;
                                    }
                                    fila = 0;
                                    col = 1;
                                    mapa2[fila][col] = 'P';
                                    mapa2[2][1] = 'Q';
                                    do {
                                        System.out.println("  " + "1 " + "2 " + "3 ");
                                        for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                            System.out.print(mapay + 1 + " ");
                                            for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                System.out.print(mapa2[mapay][mapax] + " ");
                                            }
                                            System.out.println("");
                                        }
                                        char wasd = sc.next().charAt(0);
                                        sc.nextLine();
                                        if (wasd == 'w') {
                                            if (fila - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila - 1][col] == 'Q') {
                                                System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'a') {
                                            if (col - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col - 1] == 'Q') {
                                                System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            }

                                        } else if (wasd == 's') {
                                            if (fila + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila + 1][col] == 'Q') {
                                                System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'd') {
                                            if (col + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col + 1] == 'Q') {
                                                System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else {
                                            System.err.println("Tecla incorrecta.");
                                        }
                                    } while ('P' != mapa2[2][1]);
                                    System.out.println("La tercera pregunta es: " + preg[2]);
                                    System.out.println("En mi mismo, no necesito a nadie. (PULSA 1)");
                                    System.out.println("En ayudar a los demas, la soledad puede ser cruel. (PULSA 2)");
                                    System.out.println("En mi familia, es lo mas importante para mi. (PULSA 3)");
                                    respuesta = sc.nextInt();
                                    sc.nextLine();
                                    if (respuesta == resp[2] || respuesta == resp[3]) {
                                        MasAlla++;
                                    }
                                    fila = 0;
                                    col = 1;
                                    mapa2[fila][col] = 'P';
                                    mapa2[2][1] = 'Q';
                                    do {
                                        System.out.println("  " + "1 " + "2 " + "3 ");
                                        for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                            System.out.print(mapay + 1 + " ");
                                            for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                System.out.print(mapa2[mapay][mapax] + " ");
                                            }
                                            System.out.println("");
                                        }
                                        char wasd = sc.next().charAt(0);
                                        sc.nextLine();
                                        if (wasd == 'w') {
                                            if (fila - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila - 1][col] == 'Q') {
                                                System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'a') {
                                            if (col - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col - 1] == 'Q') {
                                                System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            }

                                        } else if (wasd == 's') {
                                            if (fila + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila + 1][col] == 'Q') {
                                                System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'd') {
                                            if (col + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col + 1] == 'Q') {
                                                System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else {
                                            System.err.println("Tecla incorrecta.");
                                        }
                                    } while ('P' != mapa2[2][1]);
                                    System.out.println("La cuarta pregunta es: " + preg[3]);
                                    System.out.println("¿Porque deberia importarme? (PULSA 1)");
                                    System.out.println("Si, el desastre lo ha probocado alguien conocido intento hacerle entrar en razón. (PULSA 2)");
                                    System.out.println("Una cosa asi no tiene perdón. (PULSA 3)");
                                    respuesta = sc.nextInt();
                                    sc.nextLine();
                                    if (respuesta == resp[4] || respuesta == resp[5]) {
                                        MasAlla++;
                                    }
                                    fila = 0;
                                    col = 1;
                                    mapa2[fila][col] = 'P';
                                    mapa2[2][1] = 'Q';
                                    do {
                                        System.out.println("  " + "1 " + "2 " + "3 ");
                                        for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                            System.out.print(mapay + 1 + " ");
                                            for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                System.out.print(mapa2[mapay][mapax] + " ");
                                            }
                                            System.out.println("");
                                        }
                                        char wasd = sc.next().charAt(0);
                                        sc.nextLine();
                                        if (wasd == 'w') {
                                            if (fila - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila - 1][col] == 'Q') {
                                                System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'a') {
                                            if (col - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col - 1] == 'Q') {
                                                System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            }

                                        } else if (wasd == 's') {
                                            if (fila + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila + 1][col] == 'Q') {
                                                System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'd') {
                                            if (col + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col + 1] == 'Q') {
                                                System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else {
                                            System.err.println("Tecla incorrecta.");
                                        }
                                    } while ('P' != mapa2[2][1]);
                                    System.out.println("La quinta pregunta es: " + preg[4]);
                                    System.out.println("Por mi egoísmo. (PULSA 1)");
                                    System.out.println("Por un movimiento en falso. (PULSA 2)");
                                    respuesta = sc.nextInt();
                                    sc.nextLine();
                                    if (respuesta == resp[6]) {
                                        MasAlla++;
                                    }
                                    fila = 0;
                                    col = 1;
                                    mapa2[fila][col] = 'P';
                                    mapa2[2][1] = 'Q';
                                    do {
                                        System.out.println("  " + "1 " + "2 " + "3 ");
                                        for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                            System.out.print(mapay + 1 + " ");
                                            for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                System.out.print(mapa2[mapay][mapax] + " ");
                                            }
                                            System.out.println("");
                                        }
                                        char wasd = sc.next().charAt(0);
                                        sc.nextLine();
                                        if (wasd == 'w') {
                                            if (fila - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila - 1][col] == 'Q') {
                                                System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'a') {
                                            if (col - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col - 1] == 'Q') {
                                                System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            }

                                        } else if (wasd == 's') {
                                            if (fila + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila + 1][col] == 'Q') {
                                                System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'd') {
                                            if (col + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col + 1] == 'Q') {
                                                System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else {
                                            System.err.println("Tecla incorrecta.");
                                        }
                                    } while ('P' != mapa2[2][1]);
                                    System.out.println("La sexta pregunta es: " + preg[5]);
                                    System.out.println("Al cielo (PULSA 1)");
                                    System.out.println("Al infierno (PULSA 2)");
                                    respuesta = sc.nextInt();
                                    sc.nextLine();
                                    if (respuesta == resp[7]) {
                                        MasAlla++;
                                    }
                                    fila = 0;
                                    col = 1;
                                    mapa2[fila][col] = 'P';
                                    mapa2[2][1] = 'Q';
                                    do {
                                        System.out.println("  " + "1 " + "2 " + "3 ");
                                        for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                            System.out.print(mapay + 1 + " ");
                                            for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                System.out.print(mapa2[mapay][mapax] + " ");
                                            }
                                            System.out.println("");
                                        }
                                        char wasd = sc.next().charAt(0);
                                        sc.nextLine();
                                        if (wasd == 'w') {
                                            if (fila - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila - 1][col] == 'Q') {
                                                System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'a') {
                                            if (col - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col - 1] == 'Q') {
                                                System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col - 1;
                                                mapa2[fila][col] = 'P';
                                            }

                                        } else if (wasd == 's') {
                                            if (fila + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila + 1][col] == 'Q') {
                                                System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'd') {
                                            if (col + 1 > 2) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa2[fila][col + 1] == 'Q') {
                                                System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            } else {
                                                mapa2[fila][col] = '-';
                                                col = col + 1;
                                                mapa2[fila][col] = 'P';
                                            }
                                        } else {
                                            System.err.println("Tecla incorrecta.");
                                        }
                                    } while ('P' != mapa2[2][1]);
                                    System.out.println("La última pregunta es: " + preg[6]);
                                    respuestaU = sc.next().charAt(0);
                                    sc.nextLine();
                                    if (MasAlla >= 3) {
                                        mapaD[2][0] = 'P';
                                        mapaD[0][4] = 'D';
                                        mapaD[4][4] = 'I';

                                        do {
                                            System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 ");
                                            for (int mapay = 0; mapay < mapaD.length; mapay++) {
                                                System.out.print(mapay + 1 + " ");
                                                for (int mapax = 0; mapax < mapaD[mapay].length; mapax++) {
                                                    System.out.print(mapaD[mapay][mapax] + " ");
                                                }
                                                System.out.println("");
                                            }
                                            char wasd = sc.next().charAt(0);
                                            sc.nextLine();
                                            if (wasd == 'w') {
                                                if (fila - 1 < 0) {
                                                    System.err.println("Te has salido del mapa.");
                                                } else if (mapaD[fila - 1][col] == 'X') {
                                                    System.err.println("Te has chocado con un muro.");
                                                } else {
                                                    mapaD[fila][col] = '-';
                                                    fila = fila - 1;
                                                    mapaD[fila][col] = 'P';
                                                }
                                            } else if (wasd == 'a') {
                                                if (col - 1 < 0) {
                                                    System.err.println("Te has salido del mapa.");
                                                } else if (mapaD[fila][col - 1] == 'X') {
                                                    System.err.println("Te has chocado con un muro.");
                                                } else {
                                                    mapaD[fila][col] = '-';
                                                    col = col - 1;
                                                    mapaD[fila][col] = 'P';
                                                }

                                            } else if (wasd == 's') {
                                                if (fila + 1 > 4) {
                                                    System.err.println("Te has salido del mapa.");
                                                } else if (mapaD[fila + 1][col] == 'X') {
                                                    System.err.println("Te has chocado con un muro.");
                                                } else {
                                                    mapaD[fila][col] = '-';
                                                    fila = fila + 1;
                                                    mapaD[fila][col] = 'P';
                                                }
                                            } else if (wasd == 'd') {
                                                if (col + 1 > 4) {
                                                    System.err.println("Te has salido del mapa.");
                                                } else if (mapaD[fila][col + 1] == 'X') {
                                                    System.err.println("Te has chocado con un muro.");
                                                } else {
                                                    mapaD[fila][col] = '-';
                                                    col = col + 1;
                                                    mapaD[fila][col] = 'P';
                                                }
                                            } else {
                                                System.err.println("Tecla incorrecta.");
                                            }
                                        } while ('P' != mapaD[0][4]);
                                        System.out.println("La diosa Ereskigal ha decidido que disfrutaras de un merecido descanso en el paraiso donde todos descansan en paz.");
                                    } else {
                                        fila = 2;
                                        col = 0;
                                        mapaI[fila][col] = 'P';
                                        mapaI[0][4] = 'D';
                                        mapaI[4][4] = 'I';
                                        do {
                                            System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 ");
                                            for (int mapay = 0; mapay < mapaI.length; mapay++) {
                                                System.out.print(mapay + 1 + " ");
                                                for (int mapax = 0; mapax < mapaI[mapay].length; mapax++) {
                                                    System.out.print(mapaI[mapay][mapax] + " ");
                                                }
                                                System.out.println("");
                                            }
                                            char wasd = sc.next().charAt(0);
                                            sc.nextLine();
                                            if (wasd == 'w') {
                                                if (fila - 1 < 0) {
                                                    System.err.println("Te has salido del mapa.");
                                                } else if (mapaI[fila - 1][col] == 'X') {
                                                    System.err.println("Te has chocado con un muro.");
                                                } else {
                                                    mapaI[fila][col] = '-';
                                                    fila = fila - 1;
                                                    mapaI[fila][col] = 'P';
                                                }
                                            } else if (wasd == 'a') {
                                                if (col - 1 < 0) {
                                                    System.err.println("Te has salido del mapa.");
                                                } else if (mapaI[fila][col - 1] == 'X') {
                                                    System.err.println("Te has chocado con un muro.");
                                                } else {
                                                    mapaI[fila][col] = '-';
                                                    col = col - 1;
                                                    mapaI[fila][col] = 'P';
                                                }

                                            } else if (wasd == 's') {
                                                if (fila + 1 > 4) {
                                                    System.err.println("Te has salido del mapa.");
                                                } else if (mapaI[fila + 1][col] == 'X') {
                                                    System.err.println("Te has chocado con un muro.");
                                                } else {
                                                    mapaI[fila][col] = '-';
                                                    fila = fila + 1;
                                                    mapaI[fila][col] = 'P';
                                                }
                                            } else if (wasd == 'd') {
                                                if (col + 1 > 4) {
                                                    System.err.println("Te has salido del mapa.");
                                                } else if (mapaI[fila][col + 1] == 'X') {
                                                    System.err.println("Te has chocado con un muro.");
                                                } else {
                                                    mapaI[fila][col] = '-';
                                                    col = col + 1;
                                                    mapaI[fila][col] = 'P';
                                                }
                                            } else {
                                                System.err.println("Tecla incorrecta.");
                                            }
                                        } while ('P' != mapaI[4][4]);
                                        System.out.println("La diosa Ereskigal ha decidido que vas al infierno, tus decisiones fueron erroneas asi que aqui esta lo que te mereces.");
                                    }
                                    break;
                                case -1:
                                    fila = 0;
                                    col = 3;
                                    mapa4[fila][col] = 'P';
                                    mapa4[6][1] = 'E';
                                    mapa4[0][0] = 'X';
                                    mapa4[1][1] = 'X';
                                    mapa4[2][2] = 'X';
                                    mapa4[2][3] = 'X';
                                    mapa4[2][4] = 'X';
                                    mapa4[1][5] = 'X';
                                    mapa4[0][6] = 'X';
                                    mapa4[0][1] = 'B';
                                    mapa4[0][5] = 'F';
                                    do {
                                        System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 " + "6 " + "7 ");
                                        for (int mapay = 0; mapay < mapa4.length; mapay++) {
                                            System.out.print(mapay + 1 + " ");
                                            for (int mapax = 0; mapax < mapa4[mapay].length; mapax++) {
                                                System.out.print(mapa4[mapay][mapax] + " ");
                                            }
                                            System.out.println("");
                                        }
                                        char wasd = sc.next().charAt(0);
                                        sc.nextLine();
                                        if (wasd == 'w') {
                                            if (fila - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa4[fila - 1][col] == 'X') {
                                                System.out.println("Te has chocado contra una pared.");
                                            } else if (mapa4[fila - 1][col] == 'E') {
                                                System.out.println("!CUIDADO¡ te has topado con un enemigo");
                                                System.out.println("Peleas o huyes. Tu eliges.");
                                                System.out.println("Pulsa 1 si peleas, 2 si huyes.");
                                                int eleccion3 = sc.nextInt();
                                                sc.nextLine();
                                                if (eleccion3 == 1) {
                                                    System.out.println("Preparate para el combate.");
                                                    mapa4[fila][col] = '-';
                                                    fila = fila - 1;
                                                    mapa4[fila][col] = 'P';
                                                } else {
                                                    System.out.println("Busca haber si te has dejado algun objeto.");
                                                }
                                            } else {
                                                mapa4[fila][col] = '-';
                                                fila = fila - 1;
                                                mapa4[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'a') {
                                            if (col - 1 < 0) {
                                                System.err.println("Te has salido del mapa.");
                                            } else if (mapa4[fila][col - 1] == 'X') {
                                                System.out.println("Te has chocado contra una pared.");
                                            } else if (mapa4[fila][col - 1] == 'B') {
                                                System.out.println("Has pulsado una boton.");
                                                mapa4[2][3] = '-';
                                            } else if (mapa4[fila][col - 1] == 'E') {
                                                System.out.println("!CUIDADO¡ te has topado con un enemigo");
                                                System.out.println("Peleas o huyes. Tu eliges.");
                                                System.out.println("Pulsa 1 si peleas, 2 si huyes.");
                                                int eleccion3 = sc.nextInt();
                                                sc.nextLine();
                                                if (eleccion3 == 1) {
                                                    System.out.println("Preparate para el combate.");
                                                    mapa4[fila][col] = '-';
                                                    col = col - 1;
                                                    mapa4[fila][col] = 'P';
                                                } else {
                                                    System.out.println("Busca haber si te has dejado algun objeto.");
                                                }
                                            } else {
                                                mapa4[fila][col] = '-';
                                                col = col - 1;
                                                mapa4[fila][col] = 'P';
                                            }

                                        } else if (wasd == 's') {
                                            if (fila + 1 > 6) {
                                                System.err.println("Te has chocado contra una columna.");
                                            } else if (mapa4[fila + 1][col] == 'X') {
                                                System.out.println("Te has chocado contra una pared.");
                                            } else if (mapa4[fila + 1][col] == 'E') {
                                                System.out.println("!CUIDADO¡ te has topado con un enemigo");
                                                System.out.println("Peleas o huyes. Tu eliges.");
                                                System.out.println("Pulsa 1 si peleas, 2 si huyes.");
                                                int eleccion3 = sc.nextInt();
                                                sc.nextLine();
                                                if (eleccion3 == 1) {
                                                    System.out.println("Preparate para el combate.");
                                                    mapa4[fila][col] = '-';
                                                    fila = fila + 1;
                                                    mapa4[fila][col] = 'P';
                                                } else {
                                                    System.out.println("Busca haber si te has dejado algun objeto.");
                                                }
                                            } else {
                                                mapa4[fila][col] = '-';
                                                fila = fila + 1;
                                                mapa4[fila][col] = 'P';
                                            }
                                        } else if (wasd == 'd') {
                                            if (col + 1 > 6) {
                                                System.err.println("Te has chocado contra una columna.");
                                            } else if (mapa4[fila][col + 1] == 'X') {
                                                System.out.println("Te has chocado contra una pared.");
                                            } else if (mapa4[fila][col + 1] == 'F') {
                                                System.out.println("Has conseguido la legendaria ESCALIBUR.");
                                                mapa[0][5] = '-';
                                            } else if (mapa4[fila][col + 1] == 'E') {
                                                System.out.println("!CUIDADO¡ te has topado con un enemigo");
                                                System.out.println("Peleas o huyes. Tu eliges.");
                                                System.out.println("Pulsa 1 si peleas, 2 si huyes.");
                                                int eleccion3 = sc.nextInt();
                                                sc.nextLine();
                                                if (eleccion3 == 1) {
                                                    System.out.println("Preparate para el combate.");
                                                    mapa4[fila][col] = '-';
                                                    col = col + 1;
                                                    mapa4[fila][col] = 'P';
                                                } else {
                                                    System.out.println("Busca haber si te has dejado algun objeto.");
                                                }
                                            } else {
                                                mapa4[fila][col] = '-';
                                                col = col + 1;
                                                mapa4[fila][col] = 'P';
                                            }
                                        } else {
                                            System.err.println("Tecla incorrecta.");
                                        }
                                    } while ('P' != mapa4[6][1]);
                                    int vidaE2 = 100;
                                    int eleccion5 = 0;
                                    do {
                                        System.out.println("Tienes " + vidaP + " PS");
                                        System.out.println("El enemigo tiene " + vidaE2 + " PS");
                                        System.out.println("¿Qué quieres hacer?");
                                        System.out.println("Atacar.(PULSA 1)");
                                        System.out.println("Defender.(PULSA 2)");
                                        System.out.println("Objeto.(PULSA 3)");
                                        System.out.println("Huir.(PULSA)");
                                        eleccion4 = sc.nextInt();
                                        sc.nextLine();
                                        switch (eleccion4) {
                                            case 1:

                                                System.out.println("Elige como quieres atacar:");
                                                System.out.println("Con la espada(PULSA 1).");
                                                System.out.println("A puños no me gana nadie. (PULSA 2)");
                                                System.out.println("Volver. (PULSA 3)");
                                                int combate1 = sc.nextInt();
                                                sc.nextLine();
                                                if (combate1 == 1) {
                                                    if (mapa[0][5] == '-') {
                                                        vidaE2 = vidaE2 - 1000;
                                                        vidaP = vidaP - 20;
                                                    } else {
                                                        vidaE2 = vidaE2 - 75;
                                                        vidaP = vidaP - 20;
                                                    }

                                                } else if (combate1 == 2) {
                                                    vidaE2 = vidaE2 - 30;
                                                    vidaP = vidaP - 50;
                                                } else {

                                                }
                                                break;
                                            case 2:
                                                System.out.println("Elige como defenderte:");
                                                System.out.println("Simplemente con el pecho.(PULSA 1)");
                                                System.out.println("El escudo no es mala opcion.(PULSA 2)");
                                                System.out.println("Volver.(PULSA 3)");
                                                int defensa1 = sc.nextInt();
                                                sc.nextLine();
                                                if (defensa1 == 1) {
                                                    vidaP = vidaP - 15;
                                                } else if (defensa1 == 2) {
                                                    vidaP = vidaP - 10;
                                                }
                                                break;
                                            case 3:
                                                System.out.println("¿Qué objeto quieres usar?");
                                                System.out.println("Pocion de curacion. (PULSA 1)");
                                                System.out.println("Volver. (PULSA 2)");
                                                int objeto1 = sc.nextInt();
                                                sc.nextLine();
                                                if (objeto1 == 1 && pociones > 0) {
                                                    if (vidaP + 50 > 100) {
                                                        System.err.println("Tienes demasiada vida para usar una pocion.");
                                                    } else {
                                                        vidaP = vidaP - 20;
                                                        vidaP = vidaP + 50;
                                                        pociones--;
                                                    }
                                                } else if (objeto1 == 2) {

                                                } else {
                                                    System.err.println("No te quedan pociones.");
                                                }
                                                break;
                                            case 4:
                                                System.out.println("Has huido del combate.");
                                                break;
                                            default:
                                                System.err.println("No puedes hacer eso.");
                                        }
                                    } while (vidaE2 > 0 && vidaP > 0);
                                    int opcion1 = 0;
                                    if (vidaP < 0) {
                                        opcion1++;
                                        System.err.println("Has muerto. (Continua la aventura en el mas alla.)");
                                    } else {
                                        opcion1--;
                                        System.out.println("Has derrotado al enemigo y te diriges a la siguiente sala.");
                                    }
                                    switch (opcion1) {
                                        case 1:
                                            fila = 0;
                                            col = 1;
                                            mapa2[fila][col] = 'P';
                                            mapa2[2][1] = 'Q';
                                            System.out.println("Mueve tu personaje con los botones w,a,s,d.");
                                            do {
                                                System.out.println("  " + "1 " + "2 " + "3 ");
                                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                                    System.out.print(mapay + 1 + " ");
                                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                        System.out.print(mapa2[mapay][mapax] + " ");
                                                    }
                                                    System.out.println("");
                                                }
                                                char wasd = sc.next().charAt(0);
                                                sc.nextLine();
                                                if (wasd == 'w') {
                                                    if (fila - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'a') {
                                                    if (col - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                                        System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }

                                                } else if (wasd == 's') {
                                                    if (fila + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'd') {
                                                    if (col + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                                        System.out.println("Has llegado a la primera pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else {
                                                    System.err.println("Tecla incorrecta.");
                                                }
                                            } while ('P' != mapa2[2][1]);
                                            System.out.println("La primera pregunta es: " + preg[0]);
                                            System.out.println("El dinero OVIAMENTE (PULSA 1)");
                                            System.out.println("El bien de los demas (PULSA 2)");
                                            respuesta = sc.nextInt();
                                            sc.nextLine();
                                            if (respuesta == resp[0]) {
                                                MasAlla++;
                                            }
                                            fila = 0;
                                            col = 1;
                                            mapa2[fila][col] = 'P';
                                            mapa2[2][1] = 'Q';
                                            do {
                                                System.out.println("  " + "1 " + "2 " + "3 ");
                                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                                    System.out.print(mapay + 1 + " ");
                                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                        System.out.print(mapa2[mapay][mapax] + " ");
                                                    }
                                                    System.out.println("");
                                                }
                                                char wasd = sc.next().charAt(0);
                                                sc.nextLine();
                                                if (wasd == 'w') {
                                                    if (fila - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'a') {
                                                    if (col - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                                        System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }

                                                } else if (wasd == 's') {
                                                    if (fila + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'd') {
                                                    if (col + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                                        System.out.println("Has llegado a la segunda pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else {
                                                    System.err.println("Tecla incorrecta.");
                                                }
                                            } while ('P' != mapa2[2][1]);
                                            System.out.println("La segunda pregunta es: " + preg[1]);
                                            System.out.println("Si, no me arrepiento de nada. (PULSA 1)");
                                            System.out.println("No, he hecho cosas que me gustaria remediar. (PULSA 2)");
                                            respuesta = sc.nextInt();
                                            sc.nextLine();
                                            if (respuesta == resp[1]) {
                                                MasAlla++;
                                            }
                                            fila = 0;
                                            col = 1;
                                            mapa2[fila][col] = 'P';
                                            mapa2[2][1] = 'Q';
                                            do {
                                                System.out.println("  " + "1 " + "2 " + "3 ");
                                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                                    System.out.print(mapay + 1 + " ");
                                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                        System.out.print(mapa2[mapay][mapax] + " ");
                                                    }
                                                    System.out.println("");
                                                }
                                                char wasd = sc.next().charAt(0);
                                                sc.nextLine();
                                                if (wasd == 'w') {
                                                    if (fila - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'a') {
                                                    if (col - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                                        System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }

                                                } else if (wasd == 's') {
                                                    if (fila + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'd') {
                                                    if (col + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                                        System.out.println("Has llegado a la tercera pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else {
                                                    System.err.println("Tecla incorrecta.");
                                                }
                                            } while ('P' != mapa2[2][1]);
                                            System.out.println("La tercera pregunta es: " + preg[2]);
                                            System.out.println("En mi mismo, no necesito a nadie. (PULSA 1)");
                                            System.out.println("En ayudar a los demas, la soledad puede ser cruel. (PULSA 2)");
                                            System.out.println("En mi familia, es lo mas importante para mi. (PULSA 3)");
                                            respuesta = sc.nextInt();
                                            sc.nextLine();
                                            if (respuesta == resp[2] || respuesta == resp[3]) {
                                                MasAlla++;
                                            }
                                            fila = 0;
                                            col = 1;
                                            mapa2[fila][col] = 'P';
                                            mapa2[2][1] = 'Q';
                                            do {
                                                System.out.println("  " + "1 " + "2 " + "3 ");
                                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                                    System.out.print(mapay + 1 + " ");
                                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                        System.out.print(mapa2[mapay][mapax] + " ");
                                                    }
                                                    System.out.println("");
                                                }
                                                char wasd = sc.next().charAt(0);
                                                sc.nextLine();
                                                if (wasd == 'w') {
                                                    if (fila - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'a') {
                                                    if (col - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                                        System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }

                                                } else if (wasd == 's') {
                                                    if (fila + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'd') {
                                                    if (col + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                                        System.out.println("Has llegado a la cuarta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else {
                                                    System.err.println("Tecla incorrecta.");
                                                }
                                            } while ('P' != mapa2[2][1]);
                                            System.out.println("La cuarta pregunta es: " + preg[3]);
                                            System.out.println("¿Porque deberia importarme? (PULSA 1)");
                                            System.out.println("Si, el desastre lo ha probocado alguien conocido intento hacerle entrar en razón. (PULSA 2)");
                                            System.out.println("Una cosa asi no tiene perdón. (PULSA 3)");
                                            respuesta = sc.nextInt();
                                            sc.nextLine();
                                            if (respuesta == resp[4] || respuesta == resp[5]) {
                                                MasAlla++;
                                            }
                                            fila = 0;
                                            col = 1;
                                            mapa2[fila][col] = 'P';
                                            mapa2[2][1] = 'Q';
                                            do {
                                                System.out.println("  " + "1 " + "2 " + "3 ");
                                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                                    System.out.print(mapay + 1 + " ");
                                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                        System.out.print(mapa2[mapay][mapax] + " ");
                                                    }
                                                    System.out.println("");
                                                }
                                                char wasd = sc.next().charAt(0);
                                                sc.nextLine();
                                                if (wasd == 'w') {
                                                    if (fila - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'a') {
                                                    if (col - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                                        System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }

                                                } else if (wasd == 's') {
                                                    if (fila + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'd') {
                                                    if (col + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                                        System.out.println("Has llegado a la quinta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else {
                                                    System.err.println("Tecla incorrecta.");
                                                }
                                            } while ('P' != mapa2[2][1]);
                                            System.out.println("La quinta pregunta es: " + preg[4]);
                                            System.out.println("Por mi egoísmo. (PULSA 1)");
                                            System.out.println("Por un movimiento en falso. (PULSA 2)");
                                            respuesta = sc.nextInt();
                                            sc.nextLine();
                                            if (respuesta == resp[6]) {
                                                MasAlla++;
                                            }
                                            fila = 0;
                                            col = 1;
                                            mapa2[fila][col] = 'P';
                                            mapa2[2][1] = 'Q';
                                            do {
                                                System.out.println("  " + "1 " + "2 " + "3 ");
                                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                                    System.out.print(mapay + 1 + " ");
                                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                        System.out.print(mapa2[mapay][mapax] + " ");
                                                    }
                                                    System.out.println("");
                                                }
                                                char wasd = sc.next().charAt(0);
                                                sc.nextLine();
                                                if (wasd == 'w') {
                                                    if (fila - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'a') {
                                                    if (col - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                                        System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }

                                                } else if (wasd == 's') {
                                                    if (fila + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'd') {
                                                    if (col + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                                        System.out.println("Has llegado a la sexta pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else {
                                                    System.err.println("Tecla incorrecta.");
                                                }
                                            } while ('P' != mapa2[2][1]);
                                            System.out.println("La sexta pregunta es: " + preg[5]);
                                            System.out.println("Al cielo (PULSA 1)");
                                            System.out.println("Al infierno (PULSA 2)");
                                            respuesta = sc.nextInt();
                                            sc.nextLine();
                                            if (respuesta == resp[7]) {
                                                MasAlla++;
                                            }
                                            fila = 0;
                                            col = 1;
                                            mapa2[fila][col] = 'P';
                                            mapa2[2][1] = 'Q';
                                            do {
                                                System.out.println("  " + "1 " + "2 " + "3 ");
                                                for (int mapay = 0; mapay < mapa2.length; mapay++) {
                                                    System.out.print(mapay + 1 + " ");
                                                    for (int mapax = 0; mapax < mapa2[mapay].length; mapax++) {
                                                        System.out.print(mapa2[mapay][mapax] + " ");
                                                    }
                                                    System.out.println("");
                                                }
                                                char wasd = sc.next().charAt(0);
                                                sc.nextLine();
                                                if (wasd == 'w') {
                                                    if (fila - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila - 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'a') {
                                                    if (col - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col - 1] == 'Q') {
                                                        System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa2[fila][col] = 'P';
                                                    }

                                                } else if (wasd == 's') {
                                                    if (fila + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila + 1][col] == 'Q') {
                                                        System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'd') {
                                                    if (col + 1 > 2) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa2[fila][col + 1] == 'Q') {
                                                        System.out.println("Has llegado a la última pregunta. Responde para avanzar.");
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    } else {
                                                        mapa2[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa2[fila][col] = 'P';
                                                    }
                                                } else {
                                                    System.err.println("Tecla incorrecta.");
                                                }
                                            } while ('P' != mapa2[2][1]);
                                            System.out.println("La última pregunta es: " + preg[6]);
                                            respuestaU = sc.next().charAt(0);
                                            sc.nextLine();
                                            if (MasAlla >= 3) {
                                                mapaD[2][0] = 'P';
                                                mapaD[0][4] = 'D';
                                                mapaD[4][4] = 'I';

                                                do {
                                                    System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 ");
                                                    for (int mapay = 0; mapay < mapaD.length; mapay++) {
                                                        System.out.print(mapay + 1 + " ");
                                                        for (int mapax = 0; mapax < mapaD[mapay].length; mapax++) {
                                                            System.out.print(mapaD[mapay][mapax] + " ");
                                                        }
                                                        System.out.println("");
                                                    }
                                                    char wasd = sc.next().charAt(0);
                                                    sc.nextLine();
                                                    if (wasd == 'w') {
                                                        if (fila - 1 < 0) {
                                                            System.err.println("Te has salido del mapa.");
                                                        } else if (mapaD[fila - 1][col] == 'X') {
                                                            System.err.println("Te has chocado con un muro.");
                                                        } else {
                                                            mapaD[fila][col] = '-';
                                                            fila = fila - 1;
                                                            mapaD[fila][col] = 'P';
                                                        }
                                                    } else if (wasd == 'a') {
                                                        if (col - 1 < 0) {
                                                            System.err.println("Te has salido del mapa.");
                                                        } else if (mapaD[fila][col - 1] == 'X') {
                                                            System.err.println("Te has chocado con un muro.");
                                                        } else {
                                                            mapaD[fila][col] = '-';
                                                            col = col - 1;
                                                            mapaD[fila][col] = 'P';
                                                        }

                                                    } else if (wasd == 's') {
                                                        if (fila + 1 > 4) {
                                                            System.err.println("Te has salido del mapa.");
                                                        } else if (mapaD[fila + 1][col] == 'X') {
                                                            System.err.println("Te has chocado con un muro.");
                                                        } else {
                                                            mapaD[fila][col] = '-';
                                                            fila = fila + 1;
                                                            mapaD[fila][col] = 'P';
                                                        }
                                                    } else if (wasd == 'd') {
                                                        if (col + 1 > 4) {
                                                            System.err.println("Te has salido del mapa.");
                                                        } else if (mapaD[fila][col + 1] == 'X') {
                                                            System.err.println("Te has chocado con un muro.");
                                                        } else {
                                                            mapaD[fila][col] = '-';
                                                            col = col + 1;
                                                            mapaD[fila][col] = 'P';
                                                        }
                                                    } else {
                                                        System.err.println("Tecla incorrecta.");
                                                    }
                                                } while ('P' != mapaD[0][4]);
                                                System.out.println("La diosa Ereskigal ha decidido que disfrutaras de un merecido descanso en el paraiso donde todos descansan en paz.");
                                            } else {
                                                fila = 2;
                                                col = 0;
                                                mapaI[fila][col] = 'P';
                                                mapaI[0][4] = 'D';
                                                mapaI[4][4] = 'I';
                                                do {
                                                    System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 ");
                                                    for (int mapay = 0; mapay < mapaI.length; mapay++) {
                                                        System.out.print(mapay + 1 + " ");
                                                        for (int mapax = 0; mapax < mapaI[mapay].length; mapax++) {
                                                            System.out.print(mapaI[mapay][mapax] + " ");
                                                        }
                                                        System.out.println("");
                                                    }
                                                    char wasd = sc.next().charAt(0);
                                                    sc.nextLine();
                                                    if (wasd == 'w') {
                                                        if (fila - 1 < 0) {
                                                            System.err.println("Te has salido del mapa.");
                                                        } else if (mapaI[fila - 1][col] == 'X') {
                                                            System.err.println("Te has chocado con un muro.");
                                                        } else {
                                                            mapaI[fila][col] = '-';
                                                            fila = fila - 1;
                                                            mapaI[fila][col] = 'P';
                                                        }
                                                    } else if (wasd == 'a') {
                                                        if (col - 1 < 0) {
                                                            System.err.println("Te has salido del mapa.");
                                                        } else if (mapaI[fila][col - 1] == 'X') {
                                                            System.err.println("Te has chocado con un muro.");
                                                        } else {
                                                            mapaI[fila][col] = '-';
                                                            col = col - 1;
                                                            mapaI[fila][col] = 'P';
                                                        }

                                                    } else if (wasd == 's') {
                                                        if (fila + 1 > 4) {
                                                            System.err.println("Te has salido del mapa.");
                                                        } else if (mapaI[fila + 1][col] == 'X') {
                                                            System.err.println("Te has chocado con un muro.");
                                                        } else {
                                                            mapaI[fila][col] = '-';
                                                            fila = fila + 1;
                                                            mapaI[fila][col] = 'P';
                                                        }
                                                    } else if (wasd == 'd') {
                                                        if (col + 1 > 4) {
                                                            System.err.println("Te has salido del mapa.");
                                                        } else if (mapaI[fila][col + 1] == 'X') {
                                                            System.err.println("Te has chocado con un muro.");
                                                        } else {
                                                            mapaI[fila][col] = '-';
                                                            col = col + 1;
                                                            mapaI[fila][col] = 'P';
                                                        }
                                                    } else {
                                                        System.err.println("Tecla incorrecta.");
                                                    }
                                                } while ('P' != mapaI[4][4]);
                                                System.out.println("La diosa Ereskigal ha decidido que vas al infierno, tus decisiones fueron erroneas asi que aqui esta lo que te mereces.");
                                            }
                                            break;
                                        case -1:
                                            fila = 0;
                                            col = 2;
                                            mapa5[fila][col] = 'P';
                                            mapa5[2][2] = 'G';
                                            mapa5[0][0] = 'C';
                                            mapa5[0][4] = 'C';
                                            mapa5[4][4] = 'C';
                                            mapa5[4][0] = 'C';
                                            do {
                                                System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 ");
                                                for (int mapay = 0; mapay < mapa5.length; mapay++) {
                                                    System.out.print(mapay + 1 + " ");
                                                    for (int mapax = 0; mapax < mapa5[mapay].length; mapax++) {
                                                        System.out.print(mapa5[mapay][mapax] + " ");
                                                    }
                                                    System.out.println("");
                                                }
                                                char wasd = sc.next().charAt(0);
                                                sc.nextLine();
                                                if (wasd == 'w') {
                                                    if (fila - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa5[fila - 1][col] == 'C') {
                                                        System.out.println("Te has chocado contra una columna.");
                                                    } else {
                                                        mapa5[fila][col] = '-';
                                                        fila = fila - 1;
                                                        mapa5[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'a') {
                                                    if (col - 1 < 0) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa5[fila][col - 1] == 'C') {
                                                        System.out.println("Te has chocado contra una columna.");
                                                    } else {
                                                        mapa5[fila][col] = '-';
                                                        col = col - 1;
                                                        mapa5[fila][col] = 'P';
                                                    }

                                                } else if (wasd == 's') {
                                                    if (fila + 1 > 4) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa5[fila + 1][col] == 'C') {
                                                        System.out.println("Te has chocado contra una columna.");
                                                    } else {
                                                        mapa5[fila][col] = '-';
                                                        fila = fila + 1;
                                                        mapa5[fila][col] = 'P';
                                                    }
                                                } else if (wasd == 'd') {
                                                    if (col + 1 > 4) {
                                                        System.err.println("Te has salido del mapa.");
                                                    } else if (mapa5[fila][col + 1] == 'C') {
                                                        System.out.println("Te has chocado contra una columna.");
                                                    } else {
                                                        mapa5[fila][col] = '-';
                                                        col = col + 1;
                                                        mapa5[fila][col] = 'P';
                                                    }
                                                } else {
                                                    System.err.println("Tecla incorrecta.");
                                                }

                                            } while ('P' != mapa5[2][2]);
                                            System.out.println("Enorabuena has encontrado el santo grial.");
                                            System.out.println("Gracias a ti la humanidad fue salvada.");
                                            break;
                                        default:
                                            System.err.println("Algo salió mal reinicie el juego por favor.");
                                    }
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                            break;
                        default:
                            System.err.println("Tecle incorrecta");
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("INSTRUCCIONES Y CONTROLES");
                    System.out.println("NORMAS DEL MAPA:");
                    System.out.println(" F = legendaria espada escalibur (el filo legendario que tubo en su poder el rey arturo perndragon.)");
                    System.out.println(" B = boton (ponte encima de el para abrir caminos secretos.)");
                    System.out.println(" X = pared (NO puerdes atravesar una pared.)");
                    System.out.println(" C = columna (NO puedes pasar atravesando esto. ");
                    System.out.println(" P = protagonista (El personaje que controlas) ");
                    System.out.println(" S = cambio de sala o puerta (Si sale un mensaje en la parte de abajo del mapa significa que hay una puerta.) ");
                    System.out.println(" G = el santo grial (Tesoro y objetivo del juego.) ");
                    System.out.println(" E = cuando veas una E en el mapa significa que hay un enemigo que debes derrotar para pasar de sala.");
                    System.out.println(" Antes de pelear contra un enemigo asegurate de que no te dejas nada por recoger.");
                    System.out.println(" Q = preguntas de las puertas (Si mueres iras al mas allá, alli deberas contestar unas preguntas para poder pasar al cielo o al infierno.)");
                    System.out.println(" O = cofre con ojetos que puedes recoger y utilizar.");
                    System.out.println(" Las preguntas de la letra Q son de eleccion asi que solo tendras que pulsar un numero.");
                    System.out.println(" ... = preguntas o elecciones (En la historia habra preguntas que habra que responder o hacer elecciones) ");
                    System.out.println("CONTROLES");
                    System.out.println("Puedes mover al personaje con los botones w,a,s,d");
                    System.out.println("");
                    break;
                case 3:
                    fin++;
                    break;
                default:
                    System.err.println("Tecla incorrecta.");
            }
        } while (fin == 0);
    }

}
