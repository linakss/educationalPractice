package educationalpractice.placecarclient.Entity;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.sql.Time;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class User {
    private Long idUser;
    @NotNull
    private String password;
    @NotNull
    private String login;

    @NotNull
    private Time yearEntry; //год въезда
    @NotNull
    private Time monthEntry; //месяц въезда
    @NotNull
    private Time dayEntry; //день въезда
    @NotNull
    private Time timeEntry;

    @NotNull
    private Time yearDeparture; //год выезда
    @NotNull
    private Time monthDeparture;//месяц выезда
    @NotNull
    private Time dayDeparture;//день выезда
    @NotNull
    private Time timeDeparture;//время выезда
    @Override
    public String toString() {
        return "ф";
    }
}