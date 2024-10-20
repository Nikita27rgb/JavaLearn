public class Suspension {
    private String type; // Тип подвески (например, независимая, зависимая)
    private double springRate; // Жёсткость пружины
    private double damperRate; // Жёсткость амортизатора
    private double groundClearance; // Клиренс

    @Override
    public String toString() {
        return new StringBuilder(getClass().getName()).append(" [ type: " + type + ", spring rate: " + springRate + ", damper rate: " + damperRate + ", clearance: " + groundClearance + "]").toString();

    }

    Suspension(String type, double springRate, double damperRate, double groundClearance) {
        this.type = type;
        this.springRate = springRate;
        this.damperRate = damperRate;
        this.groundClearance = groundClearance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpringRate() {
        return springRate;
    }

    public void setSpringRate(double springRate) {
        this.springRate = springRate;
    }

    public double getDamperRate() {
        return damperRate;
    }

    public void setDamperRate(double damperRate) {
        this.damperRate = damperRate;
    }

    public double getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(double groundClearance) {
        this.groundClearance = groundClearance;
    }
}
