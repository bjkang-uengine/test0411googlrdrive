package testgdrive.domain;

import java.util.*;
import lombok.Data;
import testgdrive.infra.AbstractEvent;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long size;
    private String userid;
}
