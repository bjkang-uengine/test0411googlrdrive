package testgdrive.domain;

import java.util.*;
import lombok.Data;
import testgdrive.infra.AbstractEvent;

@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private List<String> keyword;
    private Long fileid;
    private String fileType;
}
