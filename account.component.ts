import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AccountService } from '../account.service';
//import { UserAccount } from '../user-account';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  accounts: Account[];
  constructor(private accountService: AccountService, private  router: Router) { }

  ngOnInit() {
    this.getAccounts();
  }
  private getAccounts(){
    this.accountService.getAccountsList().subscribe(data=>{
	this.accounts=data;
    });
  }

  updateAccount(accountId: number){
    console.log(`-----------`)
    this.router.navigate(['update-account', accountId]);
  }
deleteAccount(accountId: number){
    this.accountService.deleteAccount(accountId).subscribe(data=>{
      this.getAccounts();
      console.log(data);
    })
  }
  accountDetails(accountId: number){
    this.router.navigate(['account-details', accountId]);
  }
}
