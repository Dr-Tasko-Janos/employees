package emplyoees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("workers/application/api")
public class WorkersController {

    WorkersService workersService;

    public WorkersController(WorkersService workersService) {
        this.workersService = workersService;
    }

    @GetMapping
    public List<WorkersDto> listWorkers() {
        return workersService.workersList();
    }
}
