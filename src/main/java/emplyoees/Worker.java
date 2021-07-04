package emplyoees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.internal.bytebuddy.asm.Advice;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Worker {

    private long id;

    private String name;

    public Worker(String name) {
        this.name = name;
    }
}
