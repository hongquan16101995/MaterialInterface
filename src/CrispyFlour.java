import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    double quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    double getAmount() {
        return super.getCost()*this.quantity;
    }

    @Override
    LocalDate getExpireDay() {
        return (super.getManufacturingDate()).plusDays(30);
    }

    @Override
    public double getRealMoney() {
        boolean checkExpireDay = LocalDate.now().getYear() == getExpireDay().getYear();
        if(checkExpireDay && getExpireDay().getDayOfYear() - LocalDate.now().getDayOfYear() >= 60) {
            return getAmount() - (getAmount()*40/100);
        } else if (checkExpireDay && getExpireDay().getDayOfYear() - LocalDate.now().getDayOfYear() >= 120) {
            return getAmount() - (getAmount()*20/100);
        } else {
            return getAmount() - (getAmount()*5/100);
        }
    }
}
