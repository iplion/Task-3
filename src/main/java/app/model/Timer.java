package app.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Timer {

    private final Long time = System.nanoTime();
}
