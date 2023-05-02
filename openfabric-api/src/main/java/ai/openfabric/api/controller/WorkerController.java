package ai.openfabric.api.controller;

import ai.openfabric.api.model.Worker;
import ai.openfabric.api.model.WorkerStatistics;
import ai.openfabric.api.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${node.api.path}/worker")
public class WorkerController {


    @PostMapping(path = "/hello")
    public @ResponseBody String hello(@RequestBody String name) {
        return "Hello!" + name;
    }

    @Autowired
    private WorkerService workerService;

    @GetMapping
    public Page<Worker> listWorkers(Pageable pageable) {
        return workerService.listWorkers(pageable);
    }

    @PostMapping("/start/{id}")
    public Worker startWorker(@PathVariable String id) {
        return workerService.startWorker(id);
    }

    @PostMapping("/stop/{id}")
    public Worker stopWorker(@PathVariable String id) {
        return workerService.stopWorker(id);
    }

    @GetMapping("/{id}")
    public Worker getWorkerInformation(@PathVariable String id) {
        return workerService.getWorkerInformation(id);
    }

    @GetMapping("/stats/{id}")
    public WorkerStatistics getWorkerStatistics(@PathVariable String id) {
        return workerService.getWorkerStatistics(id);
    }
}
