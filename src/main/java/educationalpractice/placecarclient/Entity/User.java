package educationalpractice.placecarclient.Entity;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.sql.Time;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class User {
    private Long idUser; //индивид. номер гостя парковки

/*
наследовать айди сотрудника с паролем, логином, айди карты, айди парковки
 */

/*    @NotNull
    private Time yearEntry; //год въезда
    @NotNull
    private Time monthEntry; //месяц въезда
    @NotNull
    private Time dayEntry; //день въезда
    @NotNull
    private Time timeEntry; //время въезда

    @NotNull
    private Time yearDeparture; //год выезда
    @NotNull
    private Time monthDeparture;//месяц выезда
    @NotNull
    private Time dayDeparture;//день выезда
    @NotNull
    private Time timeDeparture;//время выезда*/
    @Override
    public String toString() {
        return "ф";
    }
}