package com.redhat.cajun.navy.responder;

import java.util.Objects;

public class RespondersStats {

    private int active;
    private int total;

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RespondersStats that = (RespondersStats) o;
        return active == that.active &&
                total == that.total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, total);
    }

    @Override
    public String toString() {
        return "RespondersStats{" +
                "active=" + active +
                ", total=" + total +
                '}';
    }
}
