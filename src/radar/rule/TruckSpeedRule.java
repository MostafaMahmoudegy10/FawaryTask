package radar.rule;

import radar.model.Observation;
import radar.model.Violation;
import radar.model.enums.CarType;
import radar.model.enums.ViolationType;

import java.util.Optional;

public class TruckSpeedRule implements  TrafficRule {

    private static final int TRUCK_SPEED = 60;

    @Override
    public Optional<Violation> validate(Observation observation) {
        if(observation.getCarType().equals(CarType.TRUCK)&&observation.getSpeed() > TRUCK_SPEED) {
            Violation violation = new Violation(
              "Truck speed shouldn’t exceed " + TRUCK_SPEED,
               ViolationType.SPEED_LIMIT,
               observation.getSpeed()
            );
            return Optional.of(violation);
        }
        return Optional.empty();
    }
}
