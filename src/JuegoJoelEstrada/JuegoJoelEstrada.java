/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JuegoJoelEstrada;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author j.estrada
 */
public class JuegoJoelEstrada {

//Función para mostrar el mapa)
    static void mostrarMapa(char[][] mapa) {

        //Le pido mostrar todas las posiciones del mapa
        for (int i = 0; i < mapa.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

//Función generar tesoro automáticao
    static void genTesoro(char[][] mapa) throws InterruptedException {
        System.out.println("--------------------");
        System.out.println("Generación del tesoro automática");
        System.out.println("--------------------");
        Thread.sleep(2000);

        //Generamos las coordenadas dentro del array
        int filaTes = (int) (Math.random() * mapa.length + 0), columTes = (int) (Math.random() * mapa[0].length + 0);

        //Le decimos que si es un espacio en blanco ponga el tesoro. Si la posición es una X vuelve a ejecutar la función.
        if (mapa[filaTes][columTes] == ' ') {
            genTesoro(mapa);
        } else if ((mapa[filaTes][columTes] == 'X')) {
            genTesoro(mapa);
        } else {
            mapa[filaTes][columTes] = 'T';
        }
    }

//Función Pelea random
    static void luchaRandom(char[][] mapa, int hp) throws InterruptedException {
        int hit = 26;
        Scanner sc = new Scanner(System.in);

        //Seteo un numero random y el í­ndice de crí­tico
        int randomNum = (int) Math.floor(Math.random() * (2 - 0 + 1)) + 0;
        int critic = (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;

        Random rand2 = new Random();
        int val2 = rand2.nextInt(4) + 1;

        //Si la variable es 1 empezará el evento pelea
        if (val2 == 1) {

            //Inicializamos los 3 bichos con sus stats correspondientes: Vida y daño de ataque 
            String[] enemigo = {"Rata", "Dragón", "Perro Zombie"};
            int[] vida = {5, 100, 45};
            int[] dano = {1, 26, 16};

            System.out.println("¡Prepárate para el combate! Te acabas de cruzar con un " + enemigo[randomNum]);

            //Boolean que nos ayudará más tarde 
            boolean Combate = true;
            do {

                Combate = true;
                System.out.print("¿Qué vas a hacer?\n1. Pelear\n2. Huir\nEscoge una opción: ");
                System.out.println("Información del personaje:\nVida: " + hp);
                int peleaElec = sc.nextInt();

                switch (peleaElec) {

                    //Si el usuario elige pelear
                    case 1:

                        if (hp > 0) {
                            //Miramos mi es un crí­tico o no y si lo es lo mostramos y sumamos el daño extra
                            if (critic > 50) {
                                System.out.println("Le acabas de asestar un golpe crí­tico! Le has quitado " + (hit + (critic / 10)));
                                vida[randomNum] -= hit + (critic / 10);
                            } else {
                                System.out.println("Le has asestado " + hit + " puntos de vida");
                                vida[randomNum] -= hit;
                            }

                            //Si la vida del bicho es menor o igual a cero decimos que ha ganado y ejecutamos la función mostrarmapa
                            if (vida[randomNum] <= 0) {
                                System.out.println("Le has ganado la batalla a " + enemigo[randomNum] + ". Puedes continuar tu aventura.");
                                mostrarMapa(mapa);

                            } else {

                                if (hp > 0) {
                                    //Si la vida no es igual o menor a cero hacemos que el bicho nos dé un hit
                                    System.out.println(enemigo[randomNum] + " tiene todaví­a " + vida[randomNum] + " HP");
                                    System.out.println(enemigo[randomNum] + " te acaba de atacar, inflingiéndote " + dano[randomNum] + ".");
                                    //Quitamos vida a nuestro personaje + la mostramos
                                    hp -= dano[randomNum];
                                    System.out.println("Tu Vida: " + hp);
                                } else {
                                    System.out.println("Has perdido, no puedes continuar.");
                                    System.exit(0);
                                }

                            }
                        } else {
                            //Si hemos perdido paramos el programa
                            System.out.println("Has perdido, no puedes continuar.");
                            System.exit(0);
                        }

                        break;

                    case 2:
                        if (hp > 0) {
                            Random rand = new Random();
                            int val = rand.nextInt(4) + 1;
                            //Si el numero es igual a uno hemos conseguido escapar y continuamos con la pelea 
                            if (val == 1) {
                                Combate = false;
                                System.out.println("¡Has conseguido escapar de la pelea!");
                                mostrarMapa(mapa);
                            } else {
                                if (hp > 0) {
                                    //Si no hemos podido escapar nos atacará
                                    System.out.println("¡No has logrado escapar!");
                                    System.out.println(enemigo[randomNum] + " te atacó y te quitó " + dano[randomNum]);
                                    hp -= dano[randomNum];
                                    System.out.println("Vida restante: " + hp);
                                    System.out.println("Tu Vida: " + hp);
                                } else {
                                    System.out.println("Has perdido, no puedes continuar.");
                                    System.exit(0);
                                }

                            }
                        } else {
                            System.out.println("Has perdido, no puedes continuar.");
                            System.exit(0);
                        }
                        break;

                    default:
                        System.out.println("Introduce una opción correcta");
                        break;
                }
            } while (vida[randomNum] > 0 && Combate == true);
        }

    }

    //Función para limpiar la consola (Chapuza)
    static void limpiarConsola() {
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
    }

    //Generación de la puerta automática (Mismo funcionamieno que el cofre)
    static void genPuerta(char[][] mapa) throws InterruptedException {
        System.out.println("--------------------");
        System.out.println("Generación de la puerta automática");
        System.out.println("--------------------");
        Thread.sleep(2000);
        int filaPuer = (int) (Math.random() * mapa.length + 0), columPuer = (int) (Math.random() * mapa[0].length + 0);

        if (mapa[filaPuer][columPuer] == ' ') {
            genPuerta(mapa);
        } else if ((mapa[filaPuer][columPuer] == 'X')) {
            genPuerta(mapa);
        } else {
            mapa[filaPuer][columPuer] = 'D';

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        //Declaramos los dos mapas 
        char[][] mapa = {{'-', '-', '-', '-', '-'},
        {'-', '-', '-', 'X', 'X'},
        {'-', 'X', '-', '-', '-'},
        {'X', '-', '-', '-', '-'},
        {'-', '-', 'X', 'X', '-'}
        };

        char[][] mapa2 = {{' ', ' ', '-', '-', '-', '-', '-', '-', ' ', ' '},
        {'X', '-', '-', 'X', 'X', '-', '-', '-', '-', '-'},
        {' ', 'X', '-', '-', '-', 'P', '-', '-', 'X', '-'},
        {'X', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
        {' ', '-', 'X', 'X', '-', '-', '-', '-', '-', ' '}
        };

        System.out.println("  1 2 3 4 5");
        mostrarMapa(mapa);

        //Guardamos la vida y variables que usaremos más tarde.
        int filaPer = 0, columPer = 0, hp = 100;
        int stamina = (int) Math.random() * 5 + 25;
        do {
            System.out.println("--------------------");
            System.out.println("Generación del Jugador");
            System.out.println("--------------------");
            Thread.sleep(2000);
            System.out.print("Introduce la fila: ");
            filaPer = sc.nextInt();
            sc.nextLine();
            System.out.print("Introduce la columna: ");
            columPer = sc.nextInt();
            sc.nextLine();
            //Si los parámetros introducidos por el usuario están fuera del mapa lo vlveremos a preguntar
            if (filaPer < 0 || columPer < 0) {
                System.out.println("Eso está fuera del mapa");
            } else {
                if (filaPer > mapa.length || columPer > mapa[0].length) {
                    System.out.println("Eso está fuera del mapa!");
                } else {
                    mapa[filaPer - 1][columPer - 1] = 'P';
                }
            }

        } while (filaPer > mapa.length || columPer > mapa[0].length || filaPer < 0 || columPer < 0);
        limpiarConsola();
        //Generamos la puerta
        genPuerta(mapa);
        limpiarConsola();
        System.out.println("Stage: 1");
        System.out.println("  1 2 3 4 5");
        mostrarMapa(mapa);

        //Guardamos variables que nos serán utiles más tarde
        int filaActual = 0, columActual = 0;
        boolean win = false;
        int stage = 1;
        do {
            //Si estamos en el stage uno ejecutará el primer mapa
            if (stage == 1) {
                do {
                    System.out.println("Stamina: " + stamina);
                    System.out.print("Haci­a que dirección te quieres mover? (w,a,s,d): ");
                    char posi = sc.next().charAt(0);
                    posi = Character.toLowerCase(posi);

                    //Aquí­ buscamos la P en el mapa, cuando la encontremos guardamos su posición
                    for (int i = 0; i < mapa.length; i++) {
                        for (int j = 0; j < mapa[i].length; j++) {
                            if (mapa[i][j] == 'P') {
                                filaActual = j;
                                columActual = i;
                            }
                        }
                    }

                    //Si tenemos estamina deja movernos en las diferentes direcciones
                    //No nos dejará movernos si hay una pared, un espacio en blanco o está fuera del mapa
                    if (stamina != 0) {
                        switch (posi) {
                            case 'w':
                                if (columActual - 1 < 0) {
                                    System.out.println("No te puedes mover en esta dirección");
                                    Thread.sleep(1000);
                                } else {
                                    if (mapa[columActual - 1][filaActual] == 'X') {
                                        System.out.println("No te puedes mover en esa dirección.");
                                        Thread.sleep(1000);
                                    } else if (mapa[columActual - 1][filaActual] == '-') {
                                        mapa[columActual - 1][filaActual] = 'P';
                                        mapa[columActual][filaActual] = '-';
                                        stamina -= 1;
                                    } else if (mapa[columActual - 1][filaActual] == 'D') {
                                        System.out.println("Has logrado cruzar la puerta, pasas al stage 2");
                                        Thread.sleep(1000);
                                        stage = 2;
                                    }
                                }

                                System.out.println("Stage: 1");
                                System.out.println("\n");
                                System.out.println("  1 2 3 4 5");
                                mostrarMapa(mapa);
                                break;
                            case 's':
                                if (columActual + 1 > mapa.length - 1) {
                                    System.out.println("No te puedes mover en esta dirección");
                                    Thread.sleep(1000);
                                } else {
                                    if (mapa[columActual + 1][filaActual] == 'X') {
                                        System.out.println("No te puedes mover en esa dirección.");
                                        Thread.sleep(1000);
                                    } else if (mapa[columActual + 1][filaActual] == '-') {
                                        mapa[columActual + 1][filaActual] = 'P';
                                        mapa[columActual][filaActual] = '-';
                                        stamina = stamina - 1;
                                    } else if (mapa[columActual + 1][filaActual] == 'D') {
                                        System.out.println("Has logrado cruzar la puerta, pasas al stage 2");
                                        Thread.sleep(1000);
                                        stage = 2;
                                    }
                                }
                                System.out.println("  1 2 3 4 5");
                                mostrarMapa(mapa);
                                break;
                            case 'a':
                                if (filaActual - 1 < 0) {
                                    System.out.println("No te puedes mover en esta dirección");
                                    Thread.sleep(1000);
                                } else {
                                    if (mapa[columActual][filaActual - 1] == 'X') {
                                        System.out.println("No te puedes mover en esa dirección.");
                                        Thread.sleep(1000);
                                    } else if (mapa[columActual][filaActual - 1] == '-') {
                                        mapa[columActual][filaActual - 1] = 'P';
                                        mapa[columActual][filaActual] = '-';
                                        stamina = stamina - 1;
                                    } else if (mapa[columActual][filaActual - 1] == 'D') {
                                        System.out.println("Has logrado cruzar la puerta, pasas al stage 2");
                                        Thread.sleep(1000);
                                        stage = 2;
                                    }
                                }
                                System.out.println("Stage: 1");
                                System.out.println("  1 2 3 4 5");
                                mostrarMapa(mapa);
                                break;

                            case 'd':
                                if (filaActual + 1 > mapa[columActual].length - 1) {
                                    System.out.println("No te puedes mover en esta dirección");
                                    Thread.sleep(1000);
                                } else {
                                    if (mapa[columActual][filaActual + 1] == 'X') {
                                        System.out.println("No te puedes mover en esa dirección.");
                                        Thread.sleep(1000);
                                    } else if (mapa[columActual][filaActual + 1] == '-') {
                                        mapa[columActual][filaActual + 1] = 'P';
                                        mapa[columActual][filaActual] = '-';
                                        stamina = stamina - 1;
                                    } else if (mapa[columActual][filaActual + 1] == 'D') {
                                        System.out.println("Has logrado cruzar la puerta, pasas al stage 2");
                                        Thread.sleep(1000);
                                        stage = 2;
                                    }
                                }
                                System.out.println("Stage: 1");
                                System.out.println("  1 2 3 4 5");
                                mostrarMapa(mapa);
                                break;
                            default:
                                System.out.println("Introduce una opción correcta.");
                                break;
                        }
                    } else {
                        //Si nos quedamos sin movimientos abremos perdido
                        System.out.println("Te has quedado sin movimientos.");
                        Thread.sleep(1000);
                        break;
                    }
                    luchaRandom(mapa, hp);
                } while (stage == 1);
            } else if (stage == 2) {
                //En el Stage 2 usamos el segundo mapa y generamos el tesoro
                genTesoro(mapa2);
                limpiarConsola();
                System.out.println("  1 2 3 4 5 6 7 8 9 10");
                mostrarMapa(mapa2);
                System.out.println("Has llegado al stage 2");

                do {
                    //Mismo funcionamiento que el anterior
                    System.out.println("Stamina: " + stamina);
                    System.out.print("Haci­a que dirección te quieres mover? (w,a,s,d): ");
                    char posi = sc.next().charAt(0);
                    posi = Character.toLowerCase(posi);

                    for (int i = 0; i < mapa2.length; i++) {
                        for (int j = 0; j < mapa2[i].length; j++) {
                            if (mapa2[i][j] == 'P') {
                                filaActual = j;
                                columActual = i;
                            }
                        }
                    }

                    if (stamina != 0) {
                        switch (posi) {
                            case 'w':
                                if (columActual - 1 < 0) {
                                    System.out.println("No te puedes mover en esta dirección");
                                    Thread.sleep(1000);
                                } else {
                                    if (mapa2[columActual - 1][filaActual] == 'X') {
                                        System.out.println("No te puedes mover en esa dirección.");
                                        Thread.sleep(1000);
                                    } else if (mapa2[columActual - 1][filaActual] == ' ') {
                                        System.out.println("No te puedes mover en esa dirección.");
                                        Thread.sleep(1000);
                                    } else if (mapa2[columActual - 1][filaActual] == '-') {
                                        mapa2[columActual - 1][filaActual] = 'P';
                                        mapa2[columActual][filaActual] = '-';
                                        stamina = stamina - 1;
                                    } else if (mapa2[columActual - 1][filaActual] == 'T') {
                                        System.out.println("Has ganado");
                                        win = true;
                                        break;
                                    }
                                }

                                System.out.println("Stage: 2");
                                System.out.println("  1 2 3 4 5 6 7 8 9 10");
                                mostrarMapa(mapa2);
                                break;
                            case 's':
                                if (columActual + 1 > mapa2.length - 1) {
                                    System.out.println("No te puedes mover en esta dirección");
                                    Thread.sleep(1000);
                                } else {
                                    if (mapa2[columActual + 1][filaActual] == 'X') {
                                        Thread.sleep(1000);
                                        System.out.println("No te puedes mover en esa dirección.");
                                    } else if (mapa2[columActual + 1][filaActual] == ' ') {
                                        System.out.println("No te puedes mover en esa dirección.");
                                        Thread.sleep(1000);
                                    } else if (mapa2[columActual + 1][filaActual] == '-') {
                                        mapa2[columActual + 1][filaActual] = 'P';
                                        mapa2[columActual][filaActual] = '-';
                                        stamina = stamina - 1;
                                    } else if (mapa2[columActual + 1][filaActual] == 'T') {
                                        System.out.println("Has ganado");
                                        win = true;
                                        break;
                                    }
                                }
                                System.out.println("  1 2 3 4 5 6 7 8 9 10");
                                mostrarMapa(mapa2);
                                break;
                            case 'a':
                                if (filaActual - 1 < 0) {
                                    System.out.println("No te puedes mover en esta dirección");
                                    Thread.sleep(1000);
                                } else {
                                    if (mapa2[columActual][filaActual - 1] == 'X') {
                                        System.out.println("No te puedes mover en esa dirección.");
                                        Thread.sleep(1000);
                                    } else if (mapa2[columActual][filaActual - 1] == ' ') {
                                        System.out.println("No te puedes mover en esa dirección.");
                                        Thread.sleep(1000);
                                    } else if (mapa2[columActual][filaActual - 1] == '-') {
                                        mapa2[columActual][filaActual - 1] = 'P';
                                        mapa2[columActual][filaActual] = '-';
                                        stamina = stamina - 1;
                                    } else if (mapa2[columActual][filaActual - 1] == 'T') {
                                        System.out.println("Has ganado");
                                        win = true;
                                        break;
                                    }
                                }
                                System.out.println("Stage: 2");
                                System.out.println("  1 2 3 4 5 6 7 8 9 10");
                                mostrarMapa(mapa2);
                                break;

                            case 'd':
                                if (filaActual + 1 > mapa2[columActual].length - 1) {
                                    System.out.println("No te puedes mover en esta dirección");
                                    Thread.sleep(1000);
                                } else {
                                    if (mapa2[columActual][filaActual + 1] == 'X') {
                                        System.out.println("No te puedes mover en esa dirección.");
                                        Thread.sleep(1000);
                                    } else if (mapa2[columActual][filaActual + 1] == ' ') {
                                        System.out.println("No te puedes mover en esa dirección.");
                                        Thread.sleep(1000);
                                    } else if (mapa2[columActual][filaActual + 1] == '-') {
                                        mapa2[columActual][filaActual + 1] = 'P';
                                        mapa2[columActual][filaActual] = '-';
                                        stamina = stamina - 1;
                                    } else if (mapa2[columActual][filaActual + 1] == 'T') {
                                        System.out.println("Has ganado");
                                        win = true;
                                        break;
                                    }
                                }
                                System.out.println("Stage: 2");

                                System.out.println("  1 2 3 4 5 6 7 8 9 10");
                                mostrarMapa(mapa2);
                                break;
                            default:
                                System.out.println("Introduce una opción correcta.");
                                break;
                        }
                        luchaRandom(mapa2, hp);

                    } else {
                        System.out.println("Te has quedado sin movimientos.");
                        break;
                    }

                } while (win != true && stamina != 0 && hp > 0);

            }
        } while (win != true && stamina != 0 && hp > 0);
    }
}
