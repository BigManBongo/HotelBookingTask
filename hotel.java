import java.util.Scanner;
public class hotel 
{
    private int hotelnumber;
    private String hotelname;
    private floor floors[] = new floor[4];
public hotel(int nos, String name)
{
    hotelnumber = nos;
    hotelname = name;
floor f1 = new floor(1);
floor f2 = new floor(2);
floor f3 = new floor(3);
floor f4 = new floor(4);
    floors[0] = f1;
    floors[1] = f2;
    floors[2] = f3;
    floors[3] = f4;
}
public static void main(String[] args) 
{    
Scanner scanner = new Scanner(System.in);

hotel call = new hotel(1, "hotelname");

int menuChoice;
do 
  {
    System.out.println("Hotel Menu"); //Hotel menu outputting options to the user
    System.out.println("1. Display Rooms");
    System.out.println("2. Book Room");
    System.out.println("3. Cancel Room");
    System.out.println("4. Display Specific Floor");
    System.out.println("5. End Program");
    System.out.println("Please Choose From The Options Above");

    menuChoice = scanner.nextInt();

    switch (menuChoice) 
      {
        case 1: //If user inputs option 1 then the function display is called 
          {
            call.display();
          }
        break;

        case 2: //If user inputs option 2 then the function bookARoom is called
          {
            call.bookARoom();
          }
        break;

        case 3: //If user inputs option 4 then the function CancelARoom is called
          {
            call.CancelARoom();
          }
        break;

        case 4: //If user inputs option 3 then the function displaySpecifiedFloor is called
          {
            call.displaySpecifiedFloor();
          }
        break;

        default: //If option 4 or an invalid option are input by the user then "Program Shutting Down" is displayed
        System.out.println("Program Shutting Down");
        break;
    }
  } while (menuChoice != 3);
  scanner.close();
}

public void display()
{
    System.out.println("Hotel Name: " + hotelname);
    for (int counter = 0; counter < floors.length; counter++)
    {
        floors[counter].displayFloor();
    }
}
public void display(int floornos)
{
    System.out.println("Hotel Name: " + hotelname);
    floors[floornos].displayFloor();
}
public void bookARoom()
{
Scanner kboard = new Scanner(System.in);
int floorchoice;
    System.out.println("Which floor would you like to stay on?");
    floorchoice = kboard.nextInt();
    floors[floorchoice - 1].findaRoomtoBook();
}
public void CancelARoom()
{
Scanner kboard = new Scanner(System.in);
int floorchoice;
    System.out.println("Which floor are you staying stay on?");
    floorchoice = kboard.nextInt();
    floors[floorchoice - 1].findaRoomtoCancel();
}

public void displaySpecifiedFloor() //Function for displaying a floor specified by the user
{
Scanner kboard = new Scanner(System.in);
int floorchoice;
    System.out.println("Which floor would you like to display?");//Requests user input
    floorchoice = kboard.nextInt(); //Stores the users input
    floors[floorchoice -1].displayFloor(); //Calls to the displayFloor function from the floor class
}
}