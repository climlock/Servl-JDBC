package com.dmdev.http.pac1.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flight {
    private Long id;
    private String flightNo;
    private LocalDateTime departureDate;
    private String departureAirportCode;
    private LocalDateTime arrivalDate;
    private String arriveAirportCode;
    private Integer aircraftId;
    private FlightStatus status;

    public Flight(long id, String flightNo, LocalDateTime departureDate, String departureAirportCode, LocalDateTime arrivalDate, String arriveAirportCode, Integer aircraftId, FlightStatus status) {
        this.id = id;
        this.flightNo = flightNo;
        this.departureDate = departureDate;
        this.departureAirportCode = departureAirportCode;
        this.arrivalDate = arrivalDate;
        this.arriveAirportCode = arriveAirportCode;
        this.aircraftId = aircraftId;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArriveAirportCode() {
        return arriveAirportCode;
    }

    public void setArriveAirportCode(String arriveAirportCode) {
        this.arriveAirportCode = arriveAirportCode;
    }

    public Integer getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Integer aircraftId) {
        this.aircraftId = aircraftId;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Flight{" +
               "id=" + id +
               ", flightNo='" + flightNo + '\'' +
               ", departureDate=" + departureDate +
               ", departureAirportCode='" + departureAirportCode + '\'' +
               ", arrivalDate=" + arrivalDate +
               ", arriveAirportCode='" + arriveAirportCode + '\'' +
               ", aircraftId=" + aircraftId +
               ", status=" + status +
               '}';
    }
}
