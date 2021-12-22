package trilha.back.financys.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;
import trilha.back.financys.enums.TypeEnum;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "ENTRY")
public class Entry implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "O nome não pode ser nulo ou vazio!")
    @Length(min = 3, max = 45, message = "O nome deverá ter no mínimo {min} e máximo {max} caracteres")
    private String name;

    @NotBlank(message = "A descrição não pode ser nulo ou vazio!")
    @Length(min = 15, max = 150, message = "A descrição deverá ter no mínimo {min} e máximo {max} caracteres")
    private String description;

    @NotNull(message = "O type não pode ser nulo ou vazio!")
    @Enumerated(EnumType.STRING)
    private TypeEnum type;

    @NotNull(message = "A descrição não pode ser nulo ou vazio!")
    @Min(value = 0, message="O valor deve ser maior que 0!")
    private double amount;

    @NotBlank(message = "A data não pode ser nulo ou vazio!")
    private String date;

    @NotNull(message = "Paid não pode ser nulo ou vazio!")
    private boolean paid;

    @ManyToOne
    @JoinColumn(name = "category_Id")
    private Category categoryId;

    public String getNameCategory(){
        return this.categoryId.getName();
    }

    public Entry() {
    }

    public Entry(long id, String name, String description, TypeEnum type,
                 double amount, String date, boolean paid, Category categoryId) {
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

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", paid=" + paid +
                ", categoryId=" + categoryId +
                '}';
    }
}


