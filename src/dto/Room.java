package dto;

public class Room {

    private int roomNbr;
    private String phoneNbr;

    private Categorie categorie;


    public Room(int roomNbr, String phoneNbr, Categorie categorie) {
        this.roomNbr = roomNbr;
        this.phoneNbr = phoneNbr;
        this.categorie = categorie;
    }

    public int getRoomNbr() {
        return roomNbr;
    }

    public void setRoomNbr(int roomNbr) {
        this.roomNbr = roomNbr;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
