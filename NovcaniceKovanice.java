import java.util.Scanner;

public class NovcaniceKovanice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesi količinu novca: ");
        double novac = input.nextDouble();

        double petsto = 0, dvjesto = 0, sto = 0, pedeset = 0, dvadeset = 0, deset = 0, pet = 0;
        double dva = 0, jedan = 0, pedesetC = 0, dvadesetC = 0, desetC = 0, petC = 0, dvaC = 0, jedanC = 0;

        while (novac != 0) {
            if (novac > 500) {
                novac = novac - 500;
                novac = Math.round(novac * 100.0) / 100.0;
                petsto++;
            } else if (novac >= 200 && novac < 500) {
                novac = novac - 200;
                novac = Math.round(novac * 100.0) / 100.0;
                dvjesto++;
            } else if (novac >= 100 && novac <= 200) {
                novac = novac - 100;
                novac = Math.round(novac * 100.0) / 100.0;
                sto++;
            } else if (novac >= 50 && novac <= 100) {
                novac = novac - 50;
                novac = Math.round(novac * 100.0) / 100.0;
                pedeset++;
            } else if (novac >= 20 && novac <= 50) {
                novac = novac - 20;
                novac = Math.round(novac * 100.0) / 100.0;
                dvadeset++;
            }  else if (novac >= 10 && novac <= 20) {
                novac = novac - 10;
                novac = Math.round(novac * 100.0) / 100.0;
                deset++;
            } else if (novac >= 5 && novac <= 10) {
                novac = novac - 5;
                novac = Math.round(novac * 100.0) / 100.0;
                pet++;
            } else if (novac >= 2 && novac <= 5) {
                novac = novac - 2;
                novac = Math.round(novac * 100.0) / 100.0;
                dva++;
            } else if (novac >= 1 && novac <= 2) {
                novac = novac - 1;
                novac = Math.round(novac * 100.0) / 100.0;
                jedan++;
            } else if (novac >= 0.50 && novac <= 1) {
                novac = novac - 0.50;
                novac = Math.round(novac * 100.0) / 100.0;
                pedesetC++;
            } else if (novac >= 0.2 && novac <= 0.50) {
                novac = novac - 0.20;
                novac = Math.round(novac * 100.0) / 100.0;
                dvadesetC++;
            } else if (novac >= 0.10 && novac <= 0.20) {
                novac = novac - 0.10;
                novac = Math.round(novac * 100.0) / 100.0;
                desetC++;
            } else if (novac >= 0.05 && novac <= 0.10) {
                novac = novac - 0.05;
                novac = Math.round(novac * 100.0) / 100.0;
                petC++;
            } else if (novac >= 0.02 && novac <= 0.05) {
                novac = novac - 0.02;
                novac = Math.round(novac * 100.0) / 100.0;
                dvaC++;
            } else if (novac >= 0.01 && novac <= 0.02) {
                novac = novac - 0.01;
                novac = Math.round(novac * 100.0) / 100.0;
                jedanC++;
            }
        }

        if (petsto > 0) {
            System.out.print(petsto + " x 500 €\n");
        }

        if (dvjesto > 0) {
            System.out.print(dvjesto + " x 200 €\n");
        }

        if (sto > 0) {
            System.out.print(sto + " x 100 €\n");
        }

        if (pedeset > 0) {
            System.out.print(pedeset + " x 50 €\n");
        }

        if (dvadeset > 0) {
            System.out.print(dvadeset + " x 20 €\n");
        }

        if (deset > 0) {
            System.out.print(deset + " x 10 €\n");
        }

        if (pet > 0) {
            System.out.print((pet + " x 5 €\n"));
        }

        if (dva > 0) {
            System.out.print(dva + " x 2 €\n");
        }

        if (jedan > 0) {
            System.out.print(jedan + " x 1 €\n");
        }

        if (pedesetC > 0) {
            System.out.print(pedesetC + " x 0.50 €\n");
        }

        if (dvadesetC > 0) {
            System.out.print(dvadesetC + " x 0.20 €\n");
        }

        if (desetC > 0) {
            System.out.print(desetC + " x 0.10 €\n");
        }

        if (petC > 0) {
            System.out.print(petC + " x 0.05 €\n");
        }

        if (dvaC > 0) {
            System.out.print(dvaC + " x 0.02 €\n");
        }

        if (jedanC > 0) {
            System.out.print(jedanC + " x 0.01 €\n");
        }
    }
}
