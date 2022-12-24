package transport;

public final class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private boolean winterTires;
    private Key key;


    public Car(String brand, String model,
               int year, String country,
               String color, int speed,
               double engineVolume, String transmission,
               String bodyType, String registrationNumber,
               int seats, boolean winterTires, Key key)

    {
        super(brand, model, year, country, color, speed);
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (transmission != null && !transmission.isEmpty()) {
            this.transmission = transmission;
        } else {
            this.transmission = "Default";
        }

        if (bodyType != null && !bodyType.isEmpty()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "Default";
        }

        if (registrationNumber != null && !registrationNumber.isEmpty()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "XXXXXXX";
        }

        if (seats > 0) {
            this.seats = seats;
        } else {
            this.seats = 5;
        }

        this.winterTires = winterTires;
        this.key = key;
    }

    public Key getKey() {
        return key;
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


    public double getEngineVolume() {
        return engineVolume;
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
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }


    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty()) {
            this.transmission = transmission;
        } else {
            this.transmission = "Default";
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "XXXXXXX";
        }
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



    @Override
    public String toString() {
        return "Марка: " + brand + "; Модель: " + model + "; Объем двигателя: " + engineVolume
                + "; Цвет кузова: " + color + "; Год изготовления: " + year
                + "; Страна изготовления: " + country + "; Коробка передач: " + transmission
                + "; Тип кузова: " + bodyType + "; Номер " + registrationNumber
                + "; Кол-во мест для сидения: " + seats + "; Зимняя резина: " + winterTires
                + "; Доступ: бесключевой доступ - " + key.remoteBoot + ", удалённый запуск - " + key.keylessAccess;
    }
}
