import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer emre = new Customer();
        emre.setId(1);
        emre.setFirstName("Yunus Emre");
        emre.setLastName("KORKMAZ");
        emre.setNationalityId("1234568879");
        emre.setBirth(LocalDate.of(1999,11,27));

        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.save(emre);

    }
}
