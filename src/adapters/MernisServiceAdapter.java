package adapters;

import abstracts.CustomerCheckService;
import entities.Customer;
import MernisServiceReference.KPSPublic;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        KPSPublic kpsPublic= new KPSPublic();
        return kpsPublic.getKPSPublicSoap().tcKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getBirth().getYear()
                );
    }
}
