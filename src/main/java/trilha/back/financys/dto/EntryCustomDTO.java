package trilha.back.financys.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import trilha.back.financys.entities.Category;
import trilha.back.financys.enums.TypeEnum;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EntryCustomDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private String description;
    private TypeEnum type;
    private double amount;
    private String date;
    private boolean paid;
    private Category categoryId;

    private String categoryName;
}
