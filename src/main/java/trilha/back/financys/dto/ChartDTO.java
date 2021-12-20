package trilha.back.financys.dto;

import trilha.back.financys.entities.Entry;
import trilha.back.financys.enums.TypeEnum;

import java.io.Serializable;

public class ChartDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private double amount;

    public ChartDTO(){
    }

    public ChartDTO(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
