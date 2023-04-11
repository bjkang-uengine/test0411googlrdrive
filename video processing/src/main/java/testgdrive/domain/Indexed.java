package testgdrive.domain;

import java.util.*;
import lombok.*;
import testgdrive.domain.*;
import testgdrive.infra.AbstractEvent;

@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private Object keyword;
    private Long fileid;
    private String fileType;
}
