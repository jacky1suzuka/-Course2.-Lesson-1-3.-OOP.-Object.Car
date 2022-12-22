import transport.Car;
import transport.Car.Key;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("", "Granta", 1.7, "жёлтый", 2015, "Россия", "Автомат", "Седан", "ASD32X", 5);
        Car audi = new Car("Audi", "", 3.0, "Чёрный", 2020, "Германия","Механическая", "универсал", "99ASD923", 7);
        Car bmw = new Car("BMW", "Z8", -3.0, "Чёрный", 2021, "Германия", "Автомат", "пикап", "SDA2321DA", 3);
        Car kia = new Car("Kia", "Sportage", 2.4, "", 2018, "Южная Корея", "Автомат", "Седан", "SADSA23123", 5);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 0, "", "Механическая", "Седан", "AASD231DD", 5);


        Key key1 = new Key(false, true);
        lada.setKey(key1);
        System.out.println(lada.getKey());
        System.out.println(lada);

    }
}