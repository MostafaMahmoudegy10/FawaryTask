package radar.model;

import radar.model.enums.CarType;
import radar.model.enums.SeatbeltStatus;

import java.time.LocalDateTime;

public class Observation{
    private String plateNumber;
    private CarType carType;
    private LocalDateTime date;
    private int speed;
    private SeatbeltStatus seatbeltFastened;

    public Observation() {
    }

    public Observation(String plateNumber, int speed, SeatbeltStatus seatbeltFastened, LocalDateTime date, CarType carType) {
        this.plateNumber = plateNumber;
        this.speed = speed;
        this.seatbeltFastened = seatbeltFastened;
        this.date = date;
        this.carType = carType;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public SeatbeltStatus getSeatbeltFastened() {
        return seatbeltFastened;
    }

    public void setSeatbeltFastened(SeatbeltStatus seatbeltFastened) {
        this.seatbeltFastened = seatbeltFastened;
    }
}
