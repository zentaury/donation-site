package sv.com.ti.donationsite.domain.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "donation")
public class DonationEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donation_id")
    private Long donationId;
    @Column(name = "user_fk")
    private Long userId;
    @Column(name = "transaction_fk")
    private Long transactionId;
    @Column(name = "country_fk")
    private Long countryId;
    private String institution;
    @Column(name = "amount")
    private double amount;
    private Date date;
    @Transient
    private String countryName;
}
