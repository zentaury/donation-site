package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.ti.donationsite.domain.entities.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
    public TransactionEntity getTransactionEntitieByCardOwnerAndBankIssueId(String CardOwner, String BankIssueId);
}
