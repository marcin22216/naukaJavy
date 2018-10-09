package NewTicket;

public class Passenger {

    private ID personalData;

    private TrafficCard monthlyPass;

    private int penalties;



    public int getPenalties()
    { return penalties; }
    public void addPenalty()
    { this.penalties++; }

    public ID getPersonalData()
    { return personalData; }
    public void setPersonalData(ID personalData)
    { this.personalData = personalData; }

    public TrafficCard getMonthlyPass()
    { return monthlyPass; }
    public void setMonthlyPass(TrafficCard monthlyPass)
    { this.monthlyPass = monthlyPass; }
}
