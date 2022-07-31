import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Booking {
    Scanner sc = new Scanner(System.in);

    ArrayList<FlightDetails> list1 = new ArrayList<>();
    ArrayList<FlightDetails> list2 = new ArrayList<>();
    ArrayList<TicketDetails> list3 = new ArrayList<>();
    Map<String,Object> n = new HashMap<>();
    LinkedList list4 = new LinkedList();
    Passenger obj = new Passenger(null, 0, 0);
    String s="New Airlines International";
    String pnr=null;

    public List<FlightDetails> readFromFile(String fileName)
    {
        try {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);

            String str;

            while((str = buffer.readLine()) != null)
            {
                str=str.replaceAll(" ","");
                String[] array = str.split(",");
                FlightDetails data =new FlightDetails(array[0],array[1],Integer.parseInt(array[2]),array[3],array[4]);
                list1.add(data);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        return list1;
    }

    public void display ()
    {
        Collections.sort(list1, new Sorting());
        ListIterator li1 = list1.listIterator();

        System.out.println("Source               Destination     Distance in km         Travel Time         Typical Airfare");
        while(li1.hasNext())
        {
            FlightDetails f = (FlightDetails)li1.next();
            System.out.format("%-20s %-20s %-20s %-20s %-20s",f.getSource(),f.getDestination(),f.getDistance(),f.getTime(),f.getAmount());
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public int[] findFlights (String source, String destination)
    {
        int count=0;
        int check=0;
        int check2=0;

        ListIterator li2 = list1.listIterator();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Source               Destination     Distance in km         Travel Time         Typical Airfare");
        while(li2.hasNext())
        {
            FlightDetails f = (FlightDetails) li2.next();
            if (f.getSource().equalsIgnoreCase(source) && f.getDestination().equalsIgnoreCase(destination)) {
                list2.add(f);
                System.out.format("%-20s %-20s %-20s %-20s %-20s", f.getSource(), f.getDestination(), f.getDistance(), f.getTime(), f.getAmount());
                count++;
                check++;
                System.out.println();
            }
        }
        if(check==0){System.out.println("Sorry, no direct flights are available from "+source+" to "+destination+" at this moment");}
        System.out.println("Intermediate flights");
        for(int i=0; i< list1.size(); i++)
        {
            String temp = list1.get(i).getDestination();
            if(list1.get(i).getSource().equalsIgnoreCase(source) && !list1.get(i).getDestination().equalsIgnoreCase(destination))
            {
                for(int j=0; j<list1.size(); j++)
                {
                    if(temp.equalsIgnoreCase(list1.get(j).getSource()) && list1.get(j).getDestination().equalsIgnoreCase(destination))
                    {
                        System.out.format("%-20s %-20s %-20s %-20s %-20s",list1.get(i).getSource(),list1.get(i).getDestination(),list1.get(i).getDistance(),list1.get(i).getTime(),list1.get(i).getAmount());
                        list2.add(list1.get(i));
                        count++;
                        check2++;
                        System.out.println();
                        System.out.format("%-20s %-20s %-20s %-20s %-20s",list1.get(j).getSource(),list1.get(j).getDestination(),list1.get(j).getDistance(),list1.get(j).getTime(),list1.get(j).getAmount());
                        list2.add(list1.get(i));
                        count++;
                        check2++;
                        System.out.println();
                    }
                }
            }
        }
        if(check==0){System.out.println("Sorry, no intermediate flights are available from "+source+" to "+destination+" at this moment");}
        System.out.println("-------------------------------------------------------------------------------------------");
        int [] arr = new int[2];
        arr[0]=check;
        arr[1]=check2;
        return arr;
    }

    public void selectedFlight (int input) {
        System.out.println("--------------------------------------------------------------------------------------------------------");
        int n = input-1;
        System.out.println("To              From            Flight No   Available seats     Distance         Date           Amount");

        try{
            if(n==0){
                TicketDetails ticket = new TicketDetails(list2.get(n).getSource(),list2.get(n).getDestination(),"CKD-738",15,list2.get(n).getDistance(),list2.get(n).getTime(),"5/08/2022",list2.get(n).getAmount());
                System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s",ticket.getFrom(),ticket.getTo(),ticket.getFlightNo(),ticket.getAvailableSeats(),ticket.getDist(),ticket.getTimeOfJourney(),ticket.getDateOfTravel(),ticket.getFare());
                list3.add(ticket);
            }
            else if(n==1){
                TicketDetails ticket = new TicketDetails(list2.get(n).getSource(),list2.get(n).getDestination(),"CKD-738",15,list2.get(n).getDistance(),list2.get(n).getTime(),"5/08/2022",list2.get(n).getAmount());
                System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s",ticket.getFrom(),ticket.getTo(),ticket.getFlightNo(),ticket.getAvailableSeats(),ticket.getDist(),ticket.getTimeOfJourney(),ticket.getDateOfTravel(),ticket.getFare());
                list3.add(ticket);
            }
            else if(n==2){
                TicketDetails ticket = new TicketDetails(list2.get(n).getSource(),list2.get(n).getDestination(),"CKD-738",15,list2.get(n).getDistance(),list2.get(n).getTime(),"5/08/2022",list2.get(n).getAmount());
                System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s",ticket.getFrom(),ticket.getTo(),ticket.getFlightNo(),ticket.getAvailableSeats(),ticket.getDist(),ticket.getTimeOfJourney(),ticket.getDateOfTravel(),ticket.getFare());
                list3.add(ticket);
            }
            else if(n==3){
                TicketDetails ticket = new TicketDetails(list2.get(n).getSource(),list2.get(n).getDestination(),"CKD-738",15,list2.get(n).getDistance(),list2.get(n).getTime(),"5/08/2022",list2.get(n).getAmount());
                System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s",ticket.getFrom(),ticket.getTo(),ticket.getFlightNo(),ticket.getAvailableSeats(),ticket.getDist(),ticket.getTimeOfJourney(),ticket.getDateOfTravel(),ticket.getFare());
                list3.add(ticket);
            }
            else if(n==4){
                TicketDetails ticket = new TicketDetails(list2.get(n).getSource(),list2.get(n).getDestination(),"CKD-738",15,list2.get(n).getDistance(),list2.get(n).getTime(),"5/08/2022",list2.get(n).getAmount());
                System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s",ticket.getFrom(),ticket.getTo(),ticket.getFlightNo(),ticket.getAvailableSeats(),ticket.getDist(),ticket.getTimeOfJourney(),ticket.getDateOfTravel(),ticket.getFare());
                list3.add(ticket);
            }
            else if(n==5){
                TicketDetails ticket = new TicketDetails(list2.get(n).getSource(),list2.get(n).getDestination(),"CKD-738",15,list2.get(n).getDistance(),list2.get(n).getTime(),"5/08/2022",list2.get(n).getAmount());
                System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s",ticket.getFrom(),ticket.getTo(),ticket.getFlightNo(),ticket.getAvailableSeats(),ticket.getDist(),ticket.getTimeOfJourney(),ticket.getDateOfTravel(),ticket.getFare());
                list3.add(ticket);
            }
            else {
                System.out.println("Invalid input, please try again");
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Invalid input, please try again");
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }

    public int passengerDetails(){
        int choice=0;
        try{

        System.out.println();
        System.out.println("Enter passenger name - ");
        obj.setName(sc.next());
        System.out.println("Enter passenger age - ");
        obj.setAge(sc.nextInt());
        System.out.println("Enter passenger phone number - ");
        obj.setPhoneNo(sc.nextLong());
        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.format("Passenger Name -%-20s Age -%-20s Phone No. -%-20s",obj.getName(),obj.getAge(),obj.getPhoneNo());
        System.out.println();
        System.out.println();
        System.out.println("Press 1 to confirm / press 2 to re-enter the details");
        choice = sc.nextInt();
        if(choice!=1 && choice!=2){
            choice=2;
        }
        return choice;
        }
        catch (InputMismatchException e)
        {
            System.out.println("Input mismatch, please try again");
        }
        return choice;
    }

    public String generatePNR(){

        System.out.println("-----------------------------------------------------------------------------------------------------");
        int min=10001;
        int max=99999;

        int b = (int)(Math.random()*(max-min+1)+min);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 2;
        for(int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        pnr=randomString+b;

        System.out.println("Congratulations, you ticket has been successfully booked");
        System.out.println("Your PNR no is "+pnr);
        System.out.println("-----------------------------------------------------------------------------------------------------");

        return pnr;
    }

    public void displayTicket(){

        //obj - passenger
        //list3 = selected flight Class TicketDetails

        System.out.println();
        System.out.println("Passenger Name");
        System.out.println(obj.getName());
        System.out.println("______________");
        System.out.println("From                         Carrier");
        System.out.format("%-28s %-10s",list3.get(0).getFrom(),s);
        System.out.println();
        System.out.println("_____________________________________________________________");
        System.out.println("To                           Date               Time");
        System.out.format("%-28s %-18s %-22s",list3.get(0).getTo(),list3.get(0).getDateOfTravel(),list3.get(0).getTimeOfJourney());
        System.out.println();
        System.out.println("_____________________________________________________________");
        System.out.println("Flight        Seat          Gate           Board Till");
        System.out.format("%-13s %-13s %-14s %-13s",list3.get(0).getFlightNo(),"55L","22",list3.get(0).getTimeOfJourney());
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

    }

    public int operationPNR(String pnr1){

        int count2=0;
        ViewDetails obj3 = new ViewDetails(obj.getName(),list3.get(0).getFrom(),s,list3.get(0).getTo(),list3.get(0).getDateOfTravel(),list3.get(0).getTimeOfJourney(),list3.get(0).getFlightNo(),"55L","22",list3.get(0).getTimeOfJourney());
        n.put(pnr,obj3);

        if(n.get(pnr1)==null){
            count2=1;
            System.out.println("Invalid PNR number, please check again");
        }
        else{
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Flight details for PNR number "+pnr1);
            System.out.println();
            System.out.println(n.get(pnr1));
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
            count2=0;
        }
        return count2;
    }
    public void deleteTicket (String pnr2){


        if(n.get(pnr2)==null)
        {
            System.out.println("Invalid PNR number, please check again");
        }
        else
        {
            n.remove(pnr2);
            System.out.println(n.get(pnr2));
            System.out.println("Your ticket has been cancelled already ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        }

    }
}

