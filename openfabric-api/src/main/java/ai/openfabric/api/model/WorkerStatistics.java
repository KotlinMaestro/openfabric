package ai.openfabric.api.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class WorkerStatistics extends Datable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "of-uuid")
    @GenericGenerator(name = "of-uuid", strategy = "ai.openfabric.api.model.IDGenerator")
    private String id;

    @OneToOne
    @JoinColumn(name = "worker_id", referencedColumnName = "id")
    private Worker worker;

    private double cpuUsage;

    private long memoryUsage;

    private long networkRxBytes;

    private long networkTxBytes;

}
