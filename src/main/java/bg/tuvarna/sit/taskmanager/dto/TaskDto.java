package bg.tuvarna.sit.taskmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private String deadline;
}
