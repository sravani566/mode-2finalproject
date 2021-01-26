package com.bankapp;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.dao.TransactionLogDao;
import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.Account;
import com.bankapp.entities.Customer;
import com.bankapp.entities.TransactionLog;
import com.bankapp.service.AccountService;
import com.bankapp.service.CustomerService;

@SpringBootApplication
public class BankappFinalApplication  implements CommandLineRunner{

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private TransactionLogDao transactionLogDao;
	
	@Autowired
	private CustomerService customerService;
	public static void main(String[] args) {
		SpringApplication.run(BankappFinalApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
		/*
		 * Customer cust= new Customer("Pooja", "pooja123", "admin", "Mudinepalli",
		 * "Gudiwada", "5678129", "pooja@gmail.com", LocalDate.of(1986, Month.NOVEMBER,
		 * 12)); Customer cust1= new Customer("Sravani", "sravani123", "guntur",
		 * "guntur", "guntur", "985678129", "sravani@gmail.com", LocalDate.of(1982,
		 * Month.MAY, 21));
		 * 
		 * customerService.addCustomer(cust); customerService.addCustomer(cust1); //
		 * Account Account account1 = new Account("Pooja", 1000.00 , "saving",
		 * "near ramalayam", "Mudinepalli", "4522896463", "p@g.com",
		 * LocalDate.of(1980,Month.NOVEMBER, 11));
		 * 
		 * Account account2 = new Account("sravani", 1000.00 , "saving",
		 * "vepachettu veedi", "guntur", "4522896463", "s@g.com",
		 * LocalDate.of(1982,Month.JANUARY, 21));
		 * 
		 * accountService.save(account1); accountService.save(account2);
		 */
//		
//		accountService.transfer(1, 2, 100);
//		accountService.deposit(1, 100);
//		accountService.withdraw(2, 100);
		
//		AddressChangeRequest addressChangeRequest = new AddressChangeRequest("kphb", "hyderabad", "55654856", "sr@g.com");
//		
//		accountService.changeAddress(1, addressChangeRequest);
//		
//		List<TransactionLog> list = transactionLogDao.findByFromAccount(2);
//		
//		for(TransactionLog log:list)
//			System.out.println(log);
	}

}