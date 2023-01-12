public class Main {
    public static void main(String[] args) {
        Randoms ran = new Randoms(1, 10);
        Iterator iterator = ran.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}