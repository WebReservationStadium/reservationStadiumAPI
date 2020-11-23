package th.ac.ku.reserved.data;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.reserved.model.reservedStadium;

import java.util.List;

public interface reservedRepository  extends JpaRepository<reservedStadium,Integer> {

}
