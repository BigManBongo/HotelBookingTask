import java.util.Scanner;
public class room 
{
    private int roomNos;
    private customer occupier;
    private boolean status;
    public room(int rnos) {
        roomNos = rnos;
        status = true; //free
    }

  public void display() {
    System.out.println("Room number: " + roomNos);
    if (status == true)
        System.out.println("Room is free");
    else
        occupier.display();
}
public void bookroom(customer newperson) {
    if (status == true) {
        status = false;
        occupier = newperson;
    }
    else
        System.out.println("Sorry room booked");
}
public void bookroom() {
    System.out.println("Room " + roomNos);
    if (status == true) {
customer newperson = new customer();
        newperson.getname();
        newperson.getemail();
        status = false;
        occupier = newperson;
    }
    else
        System.out.println("Sorry room booked");
}
public void cancelRoom() {
    status = true;
    occupier = null;
    System.out.println("Room cancelled");
}

public int returnRoomNos()
{
return(roomNos);
}

public boolean roomAvailability()//Returns the availability of the respective room
{
    return(status);
}
}