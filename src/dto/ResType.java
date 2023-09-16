package dto;

import java.util.List;

public class ResType {

    private int id;
    private String pension;
    private float tarif;
    private List<Reservation> reservations;

    public ResType(int id, String pension, float tarif, List<Reservation> reservations) {
        this.id = id;
        this.pension = pension;
        this.tarif = tarif;
        this.reservations = reservations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
