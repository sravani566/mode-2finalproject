package com.bankapp.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
//@NoArgsConstructor
//@Data//@Getter,@Setter ect....
//@ToString
@Entity
@Table(name = "txLog_table")
public class TransactionLog {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int txLogId;
	private String type;
	private int fromAccount;
	private int toAccount;
	private String transactionDetails;
	private LocalDateTime timestamp;
	private String status;
	
	public TransactionLog(String type, int fromAccount, int toAccount, String transactionDetails) {
		this.type = type;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.transactionDetails = transactionDetails;
		this.timestamp = LocalDateTime.now();
		this.status="successful";
	}

	public TransactionLog() {}

	public int getTxLogId() {
		return txLogId;
	}

	public void setTxLogId(int txLogId) {
		this.txLogId = txLogId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}

	public int getToAccount() {
		return toAccount;
	}

	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}

	public String getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(String transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TransactionLog [txLogId=" + txLogId + ", type=" + type + ", fromAccount=" + fromAccount + ", toAccount="
				+ toAccount + ", transactionDetails=" + transactionDetails + ", timestamp=" + timestamp + ", status="
				+ status + "]";
	}	
	

}
