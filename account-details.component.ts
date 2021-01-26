import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Account } from '../account';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-account-details',
  templateUrl: './account-details.component.html',
  styleUrls: ['./account-details.component.css']
})
export class AccountDetailsComponent implements OnInit {
  accountId: number
    account: Account=new Account();
  
    constructor(private route: ActivatedRoute,
       private accountService: AccountService) { }
  
    ngOnInit(): void {
      this.accountId = this.route.snapshot.params['accountId'];
  
      this.account = new Account();
      this.accountService.getAccountById(this.accountId).subscribe( data => {
        this.account = data;
      });
    }
  
  }
  
