package emplyoees;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class WorkersService {

    private ModelMapper modelMapper2;

    public WorkersService(ModelMapper modelMapper) {
        this.modelMapper2 = modelMapper;
    }

    private List<Worker> workersAll = Collections.synchronizedList(new ArrayList<>(List.of(
            new Worker(1, "John John Doe"),
            new Worker(2, "Jane Jane Doe")
    )));

    public List<WorkersDto> workersList() {
        Type returnType = new TypeToken<List<Worker>>(){}.getType();
        return modelMapper2.map(workersAll, returnType);
    }
}
