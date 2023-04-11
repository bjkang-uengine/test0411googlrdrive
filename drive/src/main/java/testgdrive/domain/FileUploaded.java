package testgdrive.domain;

import java.util.*;
import lombok.*;
import testgdrive.domain.*;
import testgdrive.infra.AbstractEvent;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long size;
    private String userid;

    public FileUploaded(File aggregate) {
        super(aggregate);
    }

    public FileUploaded() {
        super();
    }
}
