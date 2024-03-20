package hospitality;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Hotel {
    private String name;
    private String location;
    private ArrayList<Room> roomsAvailable;
    private ArrayList<Room> rooms;
    private ArrayList<Client> clients;

    public Room createRoom(Integer numRoom, Integer guestQuantity){
        Room room = new Room();
        room.setNumRoom(numRoom);
        room.setGuestQuantity(guestQuantity);
        this.rooms.add(room);
        this.roomsAvailable.add(room);
        return room;
    }


    public Client registerClient(String name, String cpf){
        Client client =new Client();
        client.setName(name);
        client.setCpf(cpf);
        clients = new ArrayList<>();
        clients.add(client);
        return client;
    }

    public void checkOut(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Room> getRoomsAvailable() {
        return roomsAvailable;
    }

    public void setRoomsAvailable(ArrayList<Room> roomsAvailable) {
        this.roomsAvailable = roomsAvailable;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
