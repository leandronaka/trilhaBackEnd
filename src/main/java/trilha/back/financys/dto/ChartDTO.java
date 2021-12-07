package trilha.back.financys.dto;

import trilha.back.financys.entities.Entry;

import java.io.Serializable;

public class ChartDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String type;
    private double amount;

    public ChartDTO(){
    }

    public ChartDTO(String name, String type, double amount) {
        this.name = name;
        this.type = type;
        this.amount = amount;
    }

    public static ChartDTO transformaEmDTO(Entry entry){
        return new ChartDTO(entry.getName(), entry.getType(), entry.getAmount());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
