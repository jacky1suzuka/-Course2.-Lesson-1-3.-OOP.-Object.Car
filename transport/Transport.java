package transport;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected final int year;
    protected final String country;
    protected String color;
    protected int speed;

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() ) {
            this.brand = brand;
        } else {
            this.brand = "Default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "Default";
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "Черный";
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            this.speed = 100;
        }
    }

    public Transport(String brand, String model, int year, String country, String color, int speed) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = "Default";
        }

        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "Default";
        }

        if (year >= 2000) {
            this.year = year;
        } else {
            this.year = 2000;
        }

        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Default";
        }

        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "Черный";
        }

        if (speed > 0) {
            this.speed = speed;
        } else {
            this.speed = 100;
        }
    }
}
