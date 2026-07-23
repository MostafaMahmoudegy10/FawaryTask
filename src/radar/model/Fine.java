package radar.model;

import java.util.List;

public class Fine {
    private String plateNumber;
    private double totalAmount;
    List<Violation> violations;

    public Fine() {
    }

    public Fine(String plateNumber, double totalAmount, List<Violation> violations) {
        this.plateNumber = plateNumber;
        this.totalAmount = totalAmount;
        this.violations = violations;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Violation> getViolations() {
        return violations;
    }

    public void setViolations(List<Violation> violations) {
        this.violations = violations;
    }

    @Override
    public String toString() {
        return "Traffic fine for car "+this.plateNumber+
                "Total amount:"+this.totalAmount+
                "Violations:"+this.violations;
    }
}
