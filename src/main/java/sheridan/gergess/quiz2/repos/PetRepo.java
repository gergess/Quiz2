package sheridan.gergess.quiz2.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import sheridan.gergess.quiz2.ents.Pet;

/**
 * Created by iuliana.cosmina on 7/23/16.
 */
public interface PetRepo extends JpaRepository<Pet, Long> {
}
