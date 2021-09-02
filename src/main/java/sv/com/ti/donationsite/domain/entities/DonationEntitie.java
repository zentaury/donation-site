package sv.com.ti.donationsite.domain.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "donation")
public class DonationEntitie {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long donationId;
    private Long userId;
    private Long transactionId;
    private Long countryId;
    private String institution;
    private double amount;
    private Date date;
}
