import java.time.LocalDate;

public class Meat extends Material implements Discount{
    double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    double getAmount() {
        return super.getCost()*this.weight;
    }

    @Override
    LocalDate getExpireDay() {
        return (super.getManufacturingDate()).plusDays(7);
    }

    @Override
    public double getRealMoney() {
        boolean checkExpireDay = LocalDate.now().getYear() == getExpireDay().getYear() && LocalDate.now().getMonth() == getExpireDay().getMonth();
        if(checkExpireDay && getExpireDay().getDayOfMonth() - LocalDate.now().getDayOfMonth() >= 3) {
            return getAmount()/2;
        } else if (checkExpireDay && getExpireDay().getDayOfMonth() - LocalDate.now().getDayOfMonth() >= 5) {
            return getAmount() - (getAmount()*30/100);
        } else {
            return getAmount() - (getAmount()*10/100);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
