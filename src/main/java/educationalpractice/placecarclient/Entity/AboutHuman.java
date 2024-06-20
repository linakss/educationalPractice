package educationalpractice.placecarclient.Entity;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class AboutHuman {
    private Long id;
    private Employee employee;
    private User user;
    private Car car;
    private PM pm;
    private Card card;

    public String getEmployeeName() {
        return employee.getSurname()+" "+employee.getName()+" "+employee.getLastname();
    }
    public String getEmployeeRole() {
        return employee.getRole();
    }
    public String getEmployeeNumberPhone() {
        return employee.getNumberPhone();
    }
    public String getEmployeeLogin() {
        return employee.getLogin();
    }
    public String getEmployeePassword() {
        return employee.getPassword();
    }


    public String getCarColor() {
        return car.getColorCar();
    }
    public String getCarMark() {
        return car.getMarkCar();
    }
    public String getCarModel() {
        return car.getModelCar();
    }
    public String getCarGosNumber() {
        return car.getGosNumberCar();
    }


    public String getUserTimeDeparture() {
        return user.getTimeDeparture();
    }
    public String getUserTimeEntry() {
        return user.getTimeEntry();
    }
    public String getUserLastPlaceOfWork() {
        return user.getLastPlaceOfWork();
    }
    public String getUserPermanentResidence() {
        return user.getPermanentResidence();
    }
    @Override
    public String toString() {
        return employee.getSurname()+" "+employee.getName()+" "+employee.getLastname();
    }
}
