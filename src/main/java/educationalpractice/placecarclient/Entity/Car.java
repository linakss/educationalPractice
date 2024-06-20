package educationalpractice.placecarclient.Entity;
import lombok.*;
import org.jetbrains.annotations.NotNull;



@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class Car {
    private Long idCar; //индивид. номер машины в базе
    @NotNull
    private String colorCar; //цвет машины
    @NotNull
    private String modelCar; //модель машины
    @NotNull
    private String markCar; //марка машины
    @NotNull
    private String gosNumberCar; //государственнный номер машины
    @NotNull
    private User user;
}
