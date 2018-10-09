package NewTicket;

public class Passenger {

    private ID personalData;

    private TrafficCard monthlyPass;

    public ID getPersonalData()
    { return personalData; }
    public void setPersonalData(ID personalData)
    { this.personalData = personalData; }

    public TrafficCard getMonthlyPass()
    { return monthlyPass; }
    public void setMonthlyPass(TrafficCard monthlyPass)
    { this.monthlyPass = monthlyPass; }
}
