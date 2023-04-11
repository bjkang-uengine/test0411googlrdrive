package testgdrive.domain;

import java.util.*;
import lombok.*;
import testgdrive.domain.*;
import testgdrive.infra.AbstractEvent;

@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private List<String> keyword;
    private Long fileid;
    private String fileType;

    public Indexed(Index aggregate) {
        super(aggregate);
    }

    public Indexed() {
        super();
    }
}
