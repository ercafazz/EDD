package Classes;

public class Repair
{
    private String company;
    private String model;
    private String adress;
    private Tecnician tec;
    
    public Repair (String company, String model, String adress)
    {
        this.company = company;
        this.model = model;
        this.adress = adress;
        this.tec = null;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Tecnician getTec() {
        return tec;
    }

    public void setTec(Tecnician tec) {
        this.tec = tec;
    }
    
}
