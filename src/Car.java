public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }


        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }else{
            this.engineVolume = engineVolume;
        }


        if (color == null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }


        if (year > 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }


        if (country == null || country.equals("")) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    @Override
    public String toString() {
        return "Марка: " + this.brand + "; Модель: " + this.model + "; Объем двигателя: " + this.engineVolume
                + "; Цвет кузова: " + this.color + "; Год изготовления: " + this.year
                + "; Страна изготовления: " + this.country;
    }
}
