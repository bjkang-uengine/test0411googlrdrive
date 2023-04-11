package testgdrive.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import testgdrive.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "dashBoards",
    path = "dashBoards"
)
public interface DashBoardRepository
    extends PagingAndSortingRepository<DashBoard, Long> {
    List<DashBoard> findByFileid(Long fileid);
}
