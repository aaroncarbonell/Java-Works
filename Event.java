// Aaron Carbonell
// INF-236-001HY
// 10-12-2020
// Case Problem #1: Carlys Catering pg 167



class Event{
    public static double PRICE_PER_GUEST = 35.00;
    public static int CUT_OFF_AMOUNT = 50;
    private String eventNumber;
    private int guests;
    private double price;
    
    public Event(){
        eNum = "not set";
        numGuests = 0;
        price = 0;
    }
    
    public Event(String eventNum, int guests){
       setEventNumber(eventNum);
       setGuests(guests);
    }

    public void setEventNumber(String eventNum){
        eventNumber = eventNum;
    }

    public void setGuests(int amountOfGuests){
        guests = amountOfGuests;
        price = guests*PRICE_PER_GUEST;
    }
 
    public String getEventNumber(){
        return eventNumber;
    }

    public int getNumberOfGuests(){
        return guests;
    }

    public double getPrice(){
        return price;
    }
}
