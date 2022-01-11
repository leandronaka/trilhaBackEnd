package trilha.back.financys.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.entities.Category;
import trilha.back.financys.exception.IdNotFound;
import trilha.back.financys.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> listarTodos() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(long id) {
        return categoryRepository.findById(id);
    }

    public Category salvar(Category category) {
        return categoryRepository.save(category);
    }

    public void deletar(long id) {
        try {
            categoryRepository.deleteById(id);
        } catch (RuntimeException e){
            throw new IdNotFound("ID não encontrado!");
        }
    }

    public Category atualizar(long id, Category category){
        try {
            Category categoryAux = categoryRepository.findById(id).get();
            BeanUtils.copyProperties(category, categoryAux, "id");
            return categoryRepository.save(categoryAux);
        } catch (RuntimeException e){
            throw new IdNotFound("ID não encontrado!");
        }
    }
}
