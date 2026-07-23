package radar;

import radar.model.Fine;
import radar.model.Observation;
import radar.model.Violation;
import radar.rule.TrafficRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class QuRadar {

    private final List<TrafficRule> rules;
    private final List<Fine> fines;

    public QuRadar(List<TrafficRule> rules) {
        this.rules = rules;
        this.fines = new ArrayList<>();
    }

    public Optional<Fine> processObservation(Observation observation) {
        List<Violation> violations = new ArrayList<>();
        double totalNumber=0;
        for (TrafficRule rule : rules) {
            Optional<Violation> violationOptional = rule.validate(observation);
            if(violationOptional.isPresent()) {
               Violation violation= violationOptional.get();
               totalNumber+=violation.getFee();
               violations.add(violation);
            }
        }
        if(!violations.isEmpty()) {
            Fine fine = new Fine(
                   observation.getPlateNumber(),
                    totalNumber,
                    violations
            );
            fines.add(fine);
            return Optional.of(fine);
        }
        return Optional.empty();
    }

    public List<Fine> getAllPossibleFines() {
        return List.copyOf(fines);
    }
}
