package trilha.back.financys.Infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.Domain.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long> {

    Entry findById(long id);
}
