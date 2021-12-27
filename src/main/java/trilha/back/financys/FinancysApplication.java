package trilha.back.financys;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import trilha.back.financys.domain.Category;
import trilha.back.financys.domain.Entry;
import trilha.back.financys.domain.TypeEnum;

@SpringBootApplication
public class FinancysApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(FinancysApplication.class, args);

		Category category = new Category();
		category.setId(4);
		category.setName("Salário");
		category.setDescription("Recebimento de Salário");

		System.out.println("utilizando o construtor Padrão: ");
		System.out.println(category.toString());

		// Utilizando o Construtor Completo
		Category categoryCompleto = new Category(5L, "Salário 2", "Recebimento de Salário 2");
		System.out.println("Utilizando o construtor Completo: ");
		System.out.println(categoryCompleto.toString());

		// utilizando o Construtor Padrão
		Entry entry = new Entry();
		entry.setId(2);
		entry.setName("Salário Empresa X");
		entry.setDescription("Adiantamento Quinzenal");
		entry.setType(TypeEnum.REVENUE);
		entry.setAmount(4405.49);
		entry.setDate("15/09/2021");
		entry.setPaid(true);

		System.out.println("Utilizando o construtor Padrão: ");
		System.out.println(entry.toString());

		System.out.println("Utilizando o Construtor Completo: ");
		Entry entryCompleto = new Entry(3,"Salario Empresa Y", "Adiantamento Quinzenal",
				TypeEnum.REVENUE, 5050.50, "21/11/2021", true, categoryCompleto);
		System.out.println(entryCompleto.toString());
	}
}
