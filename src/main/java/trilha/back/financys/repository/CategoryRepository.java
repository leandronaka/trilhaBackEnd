package trilha.back.financys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Entry;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByName(String name);

}
