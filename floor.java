import java.util.Scanner;

public class floor 
{
private int floornumber;
room rooms[] = new room[4];
public floor(int nos)
{
    floornumber = nos;
room r1 = new room(1);
room r2 = new room(2);
room r3 = new room(3);
room r4 = new room(4);
    rooms[0] = r1; rooms[1] = r2; rooms[2] = r3; rooms[3] = r4;
}
public static void main(String[] args) 
{    
Scanner scanner = new Scanner(System.in);

floor call = new floor(1);

int menuChoice;
do 
  {
    System.out.println("Floor Menu"); //Floor menu outputting options to the user
    System.out.println("1. Display Floor");
    System.out.println("2. Find a Room to Book");
    System.out.println("3. Find a Room to Cancel");
    System.out.println("4. Display Available Rooms");
    System.out.println("5. End Program");
    System.out.println("Please Choose From The Options Above");

    menuChoice = scanner.nextInt();

    switch (menuChoice) 
      {
        case 1: //If user inputs option 1 then the function displayFloor is called
          {
            call.displayFloor();
          }
        break;

        case 2: //If user inputs option 2 then the function findaRoomtoBook is called
          {
            call.findaRoomtoBook();
          }
        break;

        case 3: //If user inputs option 3 then the function findaRoomtoCancel is called
          {
            call.findaRoomtoCancel();
          }
        break;

        case 4: //If user inputs option 3 then the function displayAvailability is called
          {
            call.displayAvailability();
          }
        break;
        default: //If option 4 or an invalid option are input by the user then "Program Shutting Down" is displayed
        System.out.println("Program Shutting Down");
        break;
    }
  } while (menuChoice != 4);
  scanner.close();
}
public void displayFloor()
{
    System.out.println("Floor: " + floornumber);
    for (int counter = 0; counter < rooms.length; counter++)
    rooms[counter].display();
}
public void findaRoomtoBook()
{
Scanner kboard = new Scanner(System.in);
int nos; int counter = 0; boolean found = false;
    System.out.println("Please enter room number: ");
    nos = kboard.nextInt();
    for (counter = 0; counter < rooms.length; counter++) {
        if (nos == rooms[counter].returnRoomNos()) {
            found = true;
            rooms[counter].bookroom();
            break;
        }
    }
    if (found == false) System.out.println("No such room number");
}
public void findaRoomtoCancel()
{
Scanner kboard = new Scanner(System.in);
int nos; int counter = 0; boolean found = false;
    System.out.println("Please enter room number: ");
    nos = kboard.nextInt();
    for (counter = 0; counter < rooms.length; counter++) {
        if (nos == rooms[counter].returnRoomNos()) {
            found = true;
            rooms[counter].cancelRoom();
            break;
        }
    }
    if (found == false) System.out.println("No such room number");
}

public void displayAvailability()//Function to display all available rooms on the floor
{
    System.out.println("Available Rooms:");
    for(int loopIndex = 0; loopIndex < rooms.length; loopIndex++)//For loop to search through the rooms
    {
        if (rooms[loopIndex].roomAvailability() == true)//IF statement to check if the rooms are available
        {
           System.out.println("Room " + rooms[loopIndex].returnRoomNos());//Outputs the available rooms
        }
    }
}
}