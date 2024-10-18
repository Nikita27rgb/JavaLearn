public class CarInfo {
    private int yearOld;
    private int mileage;
    private String color;
    private int price;
    private boolean wasRoadAccident;
    private boolean onTheGo;

    CarInfo(int yearOld, int mileage, String color, int price, boolean wasRoadAccident, boolean onTheGo) {
        this.yearOld = yearOld;
        this.mileage = mileage;
        this.color = color;
        this.price = price;
        this.wasRoadAccident = wasRoadAccident;
        this.onTheGo = onTheGo;
    }

    public int getYearOld() {
        return yearOld;
    }

    @Override
    public String toString() {
        return getClass().getName() + " [" + yearOld + " years, " + mileage + " miles, " + color + " - color, " + "was road accident - " + wasRoadAccident + ", " + price + "$" + "]";
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isWasRoadAccident() {
        return wasRoadAccident;
    }

    public void setWasRoadAccident(boolean wasRoadAccident) {
        this.wasRoadAccident = wasRoadAccident;
    }

    public boolean isOnTheGo() {
        return onTheGo;
    }

    public void setOnTheGo(boolean onTheGo) {
        this.onTheGo = onTheGo;
    }

}
