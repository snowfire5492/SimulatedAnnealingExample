public class Main {

    public static void main(String[] args) throws Exception{
        long time;
        NQueen nq;
        int tollerence = 0;
        for (int i =1; i < 20; i++) {
            System.out.println("N = " + i);
            System.out.println("Simulated Annealing approach");
            nq = new SimulatedAnnealing(i,tollerence,1000);
            time = System.currentTimeMillis();
            nq.solve();
            time = System.currentTimeMillis()-time;
            nq.show();
            System.out.println("Total Time taken :" + time);
            System.out.println("Brute Force approach");
           // nq = new BruteForce(i,tollerence);
            time = System.currentTimeMillis();
            nq.solve();
            time = System.currentTimeMillis()-time;
            nq.show();
            System.out.println("Total Time taken :" + time);
        }

    }
}