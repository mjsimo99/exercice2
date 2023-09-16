package dto;

import java.util.Date;
import java.util.List;

public class Reservation {
    private Client client;
    private Room room;
    private int id;
    private Date reservDate;
    private Date arrivDate;
    private Date dprtDate;
    private int nightsNbr;
    private int roomsNbr;
    private ResType resType;
    private List<Supplement> supplements;

    public Reservation(Client client, Room room, int id, Date reservDate, Date arrivDate, Date dprtDate, int nightsNbr, int roomsNbr, ResType resType, List<Supplement> supplements) {
        this.client = client;
        this.room = room;
        this.id = id;
        this.reservDate = reservDate;
        this.arrivDate = arrivDate;
        this.dprtDate = dprtDate;
        this.nightsNbr = nightsNbr;
        this.roomsNbr = roomsNbr;
        this.resType = resType;
        this.supplements = supplements;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getReservDate() {
        return reservDate;
    }

    public void setReservDate(Date reservDate) {
        this.reservDate = reservDate;
    }

    public Date getArrivDate() {
        return arrivDate;
    }

    public void setArrivDate(Date arrivDate) {
        this.arrivDate = arrivDate;
    }

    public Date getDprtDate() {
        return dprtDate;
    }

    public void setDprtDate(Date dprtDate) {
        this.dprtDate = dprtDate;
    }

    public int getNightsNbr() {
        return nightsNbr;
    }

    public void setNightsNbr(int nightsNbr) {
        this.nightsNbr = nightsNbr;
    }

    public int getRoomsNbr() {
        return roomsNbr;
    }

    public void setRoomsNbr(int roomsNbr) {
        this.roomsNbr = roomsNbr;
    }

    public ResType getResType() {
        return resType;
    }

    public void setResType(ResType resType) {
        this.resType = resType;
    }

    public List<Supplement> getSupplements() {
        return supplements;
    }

    public void setSupplements(List<Supplement> supplements) {
        this.supplements = supplements;
    }
}
