package dto;

import java.util.List;

public class Categorie {
    private int ctgld;
    private int bedNbr;
    private float price;
    private List<Room> rooms;

    public Categorie(int ctgld, int bedNbr, float price, List<Room> rooms) {
        this.ctgld = ctgld;
        this.bedNbr = bedNbr;
        this.price = price;
        this.rooms = rooms;
    }

    public int getCtgld() {
        return ctgld;
    }

    public void setCtgld(int ctgld) {
        this.ctgld = ctgld;
    }

    public int getBedNbr() {
        return bedNbr;
    }

    public void setBedNbr(int bedNbr) {
        this.bedNbr = bedNbr;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
