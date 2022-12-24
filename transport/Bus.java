package transport;

public final class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, int speed) {
        super(brand, model, year, country, color, speed);
    }

    @Override
    public String toString(){
        return "Марка: " + brand + "; Модель: " + model + "; Год изготовления: " + year
                + "Страна изготовления: " + country + "; Цвет: " + color + "; Максимальная скорость: " + speed;
    }
}
