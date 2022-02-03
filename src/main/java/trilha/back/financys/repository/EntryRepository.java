package trilha.back.financys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.entities.Entry;

import java.util.Optional;

public interface EntryRepository extends JpaRepository<Entry, Long> {

    Optional<Entry> findByName(String name);
}
