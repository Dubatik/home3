public class Main {

    public static void main(String[] args) {

        Randoms randoms = new Randoms(95, 100);

        iter(randoms);
    }

    public static void iter(Randoms randoms) {
        while (randoms.iterator().hasNext()) {
            int r = randoms.iterator().next();
            System.out.println("Случайное число: " + r);
            if (r == randoms.getMax()) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}