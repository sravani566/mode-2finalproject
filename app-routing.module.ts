import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { CreateAccountComponent } from './create-account/create-account.component';
import { UpdateAccountComponent } from './update-account/update-account.component';
import { AccountDetailsComponent } from './account-details/account-details.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';


const routes: Routes = [
  {path:'accounts', component: AccountComponent},
  {path:'create-account', component: CreateAccountComponent},
  {path:'update-account/:accountId', component: UpdateAccountComponent},
  {path:'account-details/:accountId', component: AccountDetailsComponent},
  { path: 'login', component: LoginComponent },
  { path: 'logout', component: LogoutComponent },
  {path:'', redirectTo:'accounts', pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
