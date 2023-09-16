package dto;

import java.util.List;

public class Client {

    private int id;
    private String firstName;
    private String lastName;
    private List<Room> rooms;

    public Client(int id, String firstName, String lastName, List<Room> rooms) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rooms = rooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
