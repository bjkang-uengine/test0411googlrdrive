package testgdrive.domain;

import java.util.*;
import lombok.Data;
import testgdrive.infra.AbstractEvent;

@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileid;
    private String videourl;
    private String fileType;
}
