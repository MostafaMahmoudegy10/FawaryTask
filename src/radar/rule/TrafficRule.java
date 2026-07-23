package radar.rule;

import radar.model.Observation;
import radar.model.Violation;

import java.util.Optional;

public interface TrafficRule {

    Optional<Violation> validate(Observation observation);
}
