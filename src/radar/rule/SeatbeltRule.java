package radar.rule;

import radar.model.Observation;
import radar.model.Violation;
import radar.model.enums.SeatbeltStatus;
import radar.model.enums.ViolationType;

import java.util.Optional;

public class SeatbeltRule  implements TrafficRule{

    @Override
    public Optional<Violation> validate(Observation observation) {
        if(observation.getSeatbeltFastened()== SeatbeltStatus.NOT_FASTENED){
            Optional.of(
                    new Violation(
                        " seat belt should be fastened",
                            ViolationType.SEATBELT,
                            observation.getSpeed()
                    )
            );
        }
        return Optional.empty();
    }
}
