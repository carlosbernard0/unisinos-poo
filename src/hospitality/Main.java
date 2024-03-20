package hospitality;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Hotel hotel = new Hotel();
        Client client =new Client();
        Room room = new Room();
        Reserve reserve = new Reserve();

        int option = -1;
        do {


            System.out.println("""
                    Hello! Welcome...
                    |Select option for the Service|
                    
                    0 - Exit
                    1 - Register Account
                    2 - Available Room
                    3 - Request Room
                    4 - Make Check-out
                    5 - Enter with Hotel Owner
                    """);
            option = input.nextInt();
            input.nextLine();

            switch (option){
                case 0:
                    option = 0;
                    break;
                case 1:
                    System.out.println("Type your name:");
                    client.setName(input.nextLine());

                    System.out.println("Type your CPF:");
                    client.setCpf(input.nextLine());

                    hotel.registerClient(client.getName(), client.getCpf());

                    room.setNumRoom(1);
                    room.setGuestQuantity(2);
                    hotel.createRoom(room.getNumRoom(), room.getGuestQuantity());
                    break;
                case 2:
                    reserve.availableRoom(hotel);
            }
        } while (option != 0);

    }
}
