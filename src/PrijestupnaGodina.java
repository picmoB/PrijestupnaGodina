public class PrijestupnaGodina {
    public static void main(String[] args) {
        int[] godine = new int[7];
        godine[0] = 16;
        godine[1] = 20;
        godine[2] = 47;
        godine[3] = 31;
        godine[4] = 28;
        godine[5] = 82;
        godine[6] = 53;

        for (int i : godine) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " je prijestupna!");
            } else {
                System.out.println(i + " nije prijestupna!");
            }
        }
    }
}
