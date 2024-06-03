package educationalpractice.placecarclient.Entity;
import lombok.*;
import org.jetbrains.annotations.NotNull;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    private Long idEmployee; //индивид. номер сотрудника системы в базе
    @NotNull
    private String lastname; //отчество сотрудника системы
    @NotNull
    private String name; //имя сотрудника системы
    @NotNull
    private String surname; //фамилия сотрудника системы
    @NotNull
    private String role; //роль сотрудника системы
    @NotNull
    private int numberPhone; // номер телефона сотрудника


}
