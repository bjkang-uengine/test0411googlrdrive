package testgdrive.domain;

import java.util.*;
import lombok.*;
import testgdrive.domain.*;
import testgdrive.infra.AbstractEvent;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileid;
    private String videourl;
    private String fileType;

    public VideoProcessed(Video aggregate) {
        super(aggregate);
    }

    public VideoProcessed() {
        super();
    }
}
