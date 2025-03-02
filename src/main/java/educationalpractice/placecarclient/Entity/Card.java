package educationalpractice.placecarclient.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Card {
    private Long idCard; //индивид. номер карты гостя в базе
    @NotNull
    private int numberCard; // номер банковской карты
    @NotNull
    private String srokCard; // срок действия карты
    @NotNull
    private String bankCard; // банк карты гостя
    @NotNull
    private String nameCard; // имя и фамилия гостя ЛАТИНИЦЕЙ
    @NotNull
    private int cvvCard; // cvv-код на оборотной стороне карты


}
