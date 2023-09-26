public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private int weigth;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>1903&&year<2021){
        this.year = year;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours>0&&hours<1000) {
            this.hours = hours;
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        if (weigth>10000&&weigth<160000) {
            this.weigth = weigth;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan>10&&wingspan<45) {
            this.wingspan = wingspan;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed>0&&topSpeed<1000) {
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats>0) {
            this.seats = seats;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost>0) {
            this.cost = cost;
        }
    }
}
