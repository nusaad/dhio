package brutepass;

public class Main {
    public static void main(String[] args) {

        String
                password
                = "jerapah";
        char[] charset =   "abcdefghijklmnopqrstuvwxyz".toCharArray();
        brutepass.BruteForce bf = new brutepass.BruteForce(charset, 1);

        String katacoba = bf.PasstoString();
        long i=0;
        long timebefore=System.currentTimeMillis();
        while (true)
        {
            i++;
            if (katacoba.equals(password))
            {
                System.out.println(" Password di temukan: " + katacoba);
                System.out.println("Dilakukan percobaan sebanyak "+i+" kali");
                long timeafter=System.currentTimeMillis() - timebefore;
                System.out.println("Waktu pencarian "+timeafter+" milidetik");
                break;
            }
            katacoba = bf.PasstoString();
            System.out.println("Percobaan: " + katacoba);
            bf.increment();
        }
    }
}

