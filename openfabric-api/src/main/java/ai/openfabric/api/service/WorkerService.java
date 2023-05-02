package ai.openfabric.api.service;

import ai.openfabric.api.model.Worker;
import ai.openfabric.api.model.WorkerStatistics;
import ai.openfabric.api.repository.WorkerRepository;
import ai.openfabric.api.repository.WorkerStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private WorkerStatisticsRepository workerStatisticsRepository;

    public Page<Worker> listWorkers(Pageable pageable) {
        List<Worker> workers = (List<Worker>) workerRepository.findAll();
        return new PageImpl<>(workers, pageable, workers.size());
    }

    public Worker startWorker(String id) {
        // Implement logic to start worker
        throw new RuntimeException("Not Implemented");
    }

    public Worker stopWorker(String id) {
        // Implement logic to stop worker
        throw  new RuntimeException("Not implemented");
    }

    public Worker getWorkerInformation(String id) {
        // Implement logic to get worker information
        throw new RuntimeException("Not Implemented");
    }

    public WorkerStatistics getWorkerStatistics(String id) {
        // Implement logic to get worker statistics
        throw new RuntimeException("Not Implemented");
    }

}
