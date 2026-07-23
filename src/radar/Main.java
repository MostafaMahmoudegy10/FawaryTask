package radar;

import radar.model.Fine;
import radar.model.Observation;
import radar.model.enums.CarType;
import radar.model.enums.SeatbeltStatus;
import radar.rule.PrivateCarSpeedRule;
import radar.rule.SeatbeltRule;
import radar.rule.TrafficRule;
import radar.rule.TruckSpeedRule;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<TrafficRule> rules = List.of(
                new SeatbeltRule(),
                new PrivateCarSpeedRule(),
                new TruckSpeedRule()
        );

        QuRadar radar = new QuRadar(rules);

        Observation observation = new Observation(
                "ABC1234",
                94,
                SeatbeltStatus.NOT_FASTENED,
                LocalDateTime.now(),
                CarType.PRIVATE_CAR
        );

        Observation observation2 = new Observation(
                "ABCD1234",
                94,
                SeatbeltStatus.NOT_FASTENED,
                LocalDateTime.now(),
                CarType.TRUCK
        );

        Optional<Fine> issuedFine = radar.processObservation(observation);
        Optional<Fine> issuedFine2 = radar.processObservation(observation2);

        if (issuedFine.isPresent()) {
            System.out.println(issuedFine.get());
        } else {
            System.out.println("No fine issued");
        }

        System.out.println();

        System.out.println("the fine for observation 2");
        System.out.println();

        if (issuedFine2.isPresent()) {
            System.out.println(issuedFine2.get());
        } else {
            System.out.println("No fine issued");
        }
        System.out.println();

        System.out.println("All possible fines:");

        // get all fines : plate number .. count
        System.out.println(radar.getAllPossibleFines());

        // get all violated rules with there count
        System.out.println(radar.getAllViolations());
    }
}