import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Account } from '../account';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-update-account',
  templateUrl: './update-account.component.html',
  styleUrls: ['./update-account.component.css']
})
export class UpdateAccountComponent implements OnInit {

  id: number;
  account: Account = new Account();
  constructor(private accountService: AccountService,private route: ActivatedRoute, private router: Router) { }
  
  ngOnInit(): void {
    this.id=this.route.snapshot.params['accountId'];
    this.accountService.getAccountById(this.id).subscribe(data=>{
    this.account=data;
    }, error=>console.log(error))
  }

 
  onSubmit(){
    this.accountService.updateAccount(this.id, this.account)
    .subscribe(data=> {
        this.goToAccountList();
    }, error=> console.log(error))
  }
  goToAccountList(){
    this.router.navigate(['/accounts']);
  }
}
