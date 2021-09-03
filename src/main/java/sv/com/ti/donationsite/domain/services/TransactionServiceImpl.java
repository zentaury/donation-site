package sv.com.ti.donationsite.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sv.com.ti.donationsite.domain.entities.TransactionEntity;
import sv.com.ti.donationsite.repositories.TransactionRepository;

import java.util.Date;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<TransactionEntity> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public void saveTransaction(String cardOwner, String bankIssueId) {
        TransactionEntity transaction = new TransactionEntity();
        transaction.setCardOwner(cardOwner);
        transaction.setBankIssueId(bankIssueId);
        transaction.setDate(new Date());
        transactionRepository.save(transaction);
    }

    @Override
    public TransactionEntity getTransactionIdByCardOwnerAndBankIssueId(String cardOwner, String bankIssueId) {
        return transactionRepository.getTransactionEntitieByCardOwnerAndBankIssueId(cardOwner,bankIssueId);
    }


}
