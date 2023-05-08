package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Customer;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    private Map<UUID, Customer> customerMap;


    public CustomerServiceImpl() {
        this.customerMap = new HashMap<>();
        Customer cust1 = Customer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .customerName("Miller")
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();
        Customer cust2 = Customer.builder()
                .id(UUID.randomUUID())
                .version(2)
                .customerName("Johnson")
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();
        Customer cust3 = Customer.builder()
                .id(UUID.randomUUID())
                .version(3)
                .customerName("Fitzgerald")
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        customerMap.put(cust1.getId(), cust1);
        customerMap.put(cust2.getId(), cust2);
        customerMap.put(cust3.getId(), cust3);
    }



    @Override
    public List<Customer> listCustomers() {
        return customerMap.values().stream().toList();
    };

    @Override
    public Customer customer(UUID uuid) {
        return customerMap.get(uuid);
    }
}
