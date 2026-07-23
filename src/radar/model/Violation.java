package radar.model;

import radar.model.enums.ViolationType;

public class Violation {
    private String description;
    private ViolationType violationType;
    private double fee;

    public Violation() {}

    public Violation(String description, ViolationType violationType, double fee) {
        this.description = description;
        this.violationType = violationType;
        this.fee = fee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ViolationType getViolationType() {
        return violationType;
    }

    public void setViolationType(ViolationType violationType) {
        this.violationType = violationType;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "- "+this.description+" : "+ this.fee+" EGP";
    }
}
