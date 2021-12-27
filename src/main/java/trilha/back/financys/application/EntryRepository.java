package trilha.back.financys.application;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.domain.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long> {

    Entry findById(long id);
}
