package sv.com.ti.donationsite.domain.services;

import sv.com.ti.donationsite.domain.entities.TransactionEntity;

import java.util.List;

public interface TransactionService {
    public List<TransactionEntity> getAllTransactions();

    public void saveTransaction(String cardOwner, String bankIssueId);

    public TransactionEntity getTransactionIdByCardOwnerAndBankIssueId(String cardOwner, String bankIssueId);


}
