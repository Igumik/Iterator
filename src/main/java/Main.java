import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Randoms ran = new Randoms(1, 10);
        Iterator iterator = ran.iterator();

        //Я так понял нужен бесконечный цикл с остановкой на числе 10.
        while (iterator.hasNext()) {
            for (Object r : ran) {
                System.out.println("Случайное число: " + r);
                if (r.equals(10)) {
                    System.out.println("Выпало число 10, давайте на этом закончим");
                    break;
                }
            }
        }

        //TODO Либо второй вариант с полной остановкой на числе 10.
//        while (iterator.hasNext()) {
//            Object index = 0;
//            for (Object r : ran) {
//                System.out.println("Случайное число: " + r);
//                index = r;
//                if (r.equals(10)) {
//                    break;
//                }
//            }
//            if (index.equals(10)) {
//                System.out.println("Выпало число 10, давайте на этом закончим");
//                break;
//            }
//        }
    }
}