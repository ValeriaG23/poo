package com.company;

public class Telefon {
    private String model;
    private String culoare;
    private int anul;
    private String brend;

    public Telefon(String model,String culoare,int anul,String brend)
    {
        this.model=model;
        this.culoare=culoare;
        this.anul=anul;
        this.brend=brend;
    }

    public String print(){
        return"Model:" + this.model +"\n" +
        "Culoare:" + this.culoare +"\n" +
        "Anul:" + this.anul +"\n" +
        "Brend:" + this.brend +"\n";

    }

    public String getModel(){
        return model;
    }

    public String getCuloare(){
        return culoare;
    }

    public int getAnul(){
        return anul;
    }

    public String getBrend(){
        return brend;
    }

    public void setModel(String model) {
        this.model=model;
    }

    public void setCuloare(String culoare) {
        this.culoare=culoare;
    }

    public void setAnul(int anul) {
        this.anul=anul;
    }

    public void setBrend(String brend) {
        this.brend=brend;
    }
}
