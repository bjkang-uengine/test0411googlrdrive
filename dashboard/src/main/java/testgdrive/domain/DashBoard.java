package testgdrive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DashBoard_table")
@Data
public class DashBoard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long fileid;
    private Long fileSize;
    private String fileName;
    private Boolean isFileIndexed;
    private Boolean isFileUploaded;
    private String videoUrl;
}
