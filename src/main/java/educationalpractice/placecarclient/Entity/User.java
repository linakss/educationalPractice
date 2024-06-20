package educationalpractice.placecarclient.Entity;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class User {
    private Long idUser; //индивид. номер гостя парковки
    private String timeEntry; //Время въезда
    private String timeDeparture; //Время выезда
    private Employee employee;
    private List<Card> cardList;
    private List<Car> carList;
    private List<PM> pmList;
    private String lastPlaceOfWork; //последнее место работы юзера
    private String permanentResidence;//постоянное место жительства юзера
    @Override
    public String toString() {
        return "";
    }
}