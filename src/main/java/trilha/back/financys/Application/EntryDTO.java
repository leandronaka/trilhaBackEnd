package trilha.back.financys.Application;

import trilha.back.financys.Domain.Category;
import trilha.back.financys.Domain.TypeEnum;

import java.io.Serializable;

public class EntryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private String description;
    private TypeEnum type;
    private double amount;
    private String date;
    private boolean paid;
    private Category categoryId;

    public EntryDTO() {
    }

    public EntryDTO(long id, String name, String description, TypeEnum type, double amount, String date, boolean paid, Category categoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.categoryId = categoryId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }
}
