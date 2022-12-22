package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private boolean winterTires;
    private Key key;


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key != null) {
            this.key = key;
        }
    }

    public static class Key {
        private final boolean remoteBoot;
        private final boolean keylessAccess;

        public Key(boolean remoteBoot, boolean keylessAccess) {
            this.remoteBoot = remoteBoot;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteBoot() {
            return remoteBoot;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Удаленный запуск - " + remoteBoot + ", Бесключевой доступ - " + keylessAccess;
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public void changeTires(int month) {
        if (month < 1 || month > 12) {
            throw new RuntimeException("Неккоректный номер месяца");
        }
        if (month >= 11 || month <= 3) {
            this.winterTires = true;
        } else {
            this.winterTires = false;
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int seats) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }


        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }


        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }


        if (year > 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }


        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }


        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "Автомат";
        } else {
            this.transmission = transmission;
        }


        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }


        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "Default";
        } else {
            this.registrationNumber = registrationNumber;
        }


        if (seats <= 0) {
            this.seats = 5;
        } else {
            this.seats = seats;
        }


    }

    @Override
    public String toString() {
        return "Марка: " + this.brand + "; Модель: " + this.model + "; Объем двигателя: " + this.engineVolume
                + "; Цвет кузова: " + this.color + "; Год изготовления: " + this.year
                + "; Страна изготовления: " + this.country + "; Коробка передач: " + this.transmission
                + "; Тип кузова: " + this.bodyType + "; Номер " + this.registrationNumber
                + "; Кол-во мест для сидения: " + this.seats + "; Зимняя резина: " + winterTires
                + "; Доступ: бесключевой доступ - " + this.key.remoteBoot + ", удалённый запуск - " + this.key.keylessAccess;
    }
}
