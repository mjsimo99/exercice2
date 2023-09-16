package dto;

import java.util.List;

public class Supplement {
    private int id;
    private String type;
    private float tarif;
    private List<Reservation> reservations;

    public Supplement(int id, String type, float tarif, List<Reservation> reservations) {
        this.id = id;
        this.type = type;
        this.tarif = tarif;
        this.reservations = reservations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
