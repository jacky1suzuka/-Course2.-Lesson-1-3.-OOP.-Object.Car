import transport.Bus;
import transport.Car;
import transport.Car.Key;


public class Main {
    public static void main(String[] args) {
        Car lada = new Car("", "Granta",
                           2015,"Россия",
                           "желтый", 150,
                           2.5, "автоматическая",
                           "Седан", "SAD23DAS",
                           5, false,
                           new Key(true, false)
                           );

        Car audi = new Car("Audi", "",
                           2020, "Германия",
                           "Черный", 200,
                           2.5, "Автоматическая",
                           "Седан", "99ASD923",
                           5, false,
                           new Key(true,true)
                           );

        Car bmw = new Car("BMW", "Z8",
                          2021, "Германия",
                          "черный", 244,
                          1.5, "Автоматическая",
                          "", "SDA2321DA",
                          4,false,
                          new Key(false,true)
                          );

        Car kia = new Car("Kia", "Sportage",
                          2018, "Южная Корея",
                          "", 140,
                          2.4, "Автоматическая",
                          "Универсал", "ASX23123SD",
                          5, false,
                          new Key(true,true)
                          );

        Car hyundai = new Car("Hyundai", "Avante",
                              0, "", "Оранжевый",
                              230, 2.5,
                              "Автоматическая", "универсал",
                              "AASD231DD", 5,
                              false,new Key(true,false));


        Bus liaz = new Bus("LiAZ", "4292", 2015, "Россия", "Серый", 80);
        Bus man = new Bus("MAN", "Lion's coach", 2018, "Германия", "Красный", 90);
        Bus volvo = new Bus("Volvo", "7900", 2017, "Польша", "Зеленый", 77);


        System.out.println(lada.getBrand());
        System.out.println(lada.getKey());
        System.out.println(hyundai);
        System.out.println(liaz);
        System.out.println(man);
        System.out.println(volvo);
        System.out.println(volvo.getModel());

    }
}