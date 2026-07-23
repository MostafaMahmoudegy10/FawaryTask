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
        StringBuilder result = new StringBuilder();

        result.append("Traffic for car ").append(plateNumber)
                .append("\n");

        result.append("Total amount: ").append(totalAmount)
                .append(" EGP\n");

        result.append("Violations:\n");

        for (Violation violation : violations) {
            result.append(violation).append("\n");
        }

        return result.toString().stripTrailing();
    }
}
