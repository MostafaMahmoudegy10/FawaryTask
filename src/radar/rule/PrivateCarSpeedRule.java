package radar.rule;

import radar.model.Observation;
import radar.model.Violation;
import radar.model.enums.CarType;
import radar.model.enums.ViolationType;

import java.util.Optional;

public class PrivateCarSpeedRule implements TrafficRule {

    private static final int CAR_SPEED = 80;

    @Override
    public Optional<Violation> validate(Observation observation) {
        if(observation.getCarType() == CarType.PRIVATE_CAR && observation.getSpeed()>CAR_SPEED) {
           Violation violation = new Violation(
                   "Private car speed shouldn’t exceed "+ CAR_SPEED,
                   ViolationType.SPEED_LIMIT,
                   observation.getSpeed()
           );
           return Optional.of(violation);
        }
        return Optional.empty();
    }
}
