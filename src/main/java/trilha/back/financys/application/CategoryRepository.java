package trilha.back.financys.application;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findById(Category id);
}
