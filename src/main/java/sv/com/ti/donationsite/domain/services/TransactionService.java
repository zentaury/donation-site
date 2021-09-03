package sv.com.ti.donationsite.domain.services;

import sv.com.ti.donationsite.domain.entities.TransactionEntitie;

import java.util.List;

public interface TransactionService {
    public List<TransactionEntitie> getAllTransactions();

    public void saveTransaction(String cardOwner, String bankIssueId);

    public TransactionEntitie getTransactionIdByCardOwnerAndBankIssueId(String cardOwner, String bankIssueId);

    public void deleteTransaction(TransactionEntitie transaction);
}
