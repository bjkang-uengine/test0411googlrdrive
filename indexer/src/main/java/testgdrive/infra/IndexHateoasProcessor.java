package testgdrive.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import testgdrive.domain.*;

@Component
public class IndexHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Index>> {

    @Override
    public EntityModel<Index> process(EntityModel<Index> model) {
        return model;
    }
}
