package educationalpractice.placecarclient.Entity;
import lombok.*;
import org.jetbrains.annotations.NotNull;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    private Long idEmployee;
    @NotNull
    private String lastname;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    private String role;
    @NotNull
    private String ;


}
