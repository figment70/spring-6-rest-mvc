package guru.springframework.spring6restmvc.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class Customer {
    public String customerName;
    public UUID id;
    public int version;
    public LocalDateTime createdDate;
    public LocalDateTime lastModifiedDate;


}
