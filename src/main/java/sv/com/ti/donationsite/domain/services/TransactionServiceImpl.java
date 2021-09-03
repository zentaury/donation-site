package sv.com.ti.donationsite.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sv.com.ti.donationsite.domain.entities.TransactionEntitie;
import sv.com.ti.donationsite.repositories.TransactionRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<TransactionEntitie> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public void saveTransaction(String cardOwner, String bankIssueId) {
        TransactionEntitie transaction = new TransactionEntitie();
        transaction.setCardOwner(cardOwner);
        transaction.setBankIssueId(bankIssueId);
        transaction.setDate(new Date());
        transactionRepository.save(transaction);
    }

    @Override
    public TransactionEntitie getTransactionIdByCardOwnerAndBankIssueId(String cardOwner, String bankIssueId) {
        return transactionRepository.getTransactionEntitieByCardOwnerAndBankIssueId(cardOwner,bankIssueId);
    }

    @Override
    public void deleteTransaction(TransactionEntitie transaction) {
        //TODO: agregar el delete de transaction
    }
}
