package entities;

import java.time.LocalDate;

public class Contract {
    private LocalDate date;
    private double valuePerHour;
    private Integer hours;

    public Contract() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public double totalValue(){
        return  this.valuePerHour * this.hours;
    }
}
