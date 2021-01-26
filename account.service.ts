import { Injectable } from '@angular/core';
import { from, Observable } from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  private baseURL="http://localhost:8080/bankapp/account";
  constructor(private httpClient: HttpClient) { }

  getAccountsList(): Observable<Account[]>{
    return this.httpClient.get<Account[]>(`${this.baseURL}`);
  }
  createAccount(account: Object): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, account);
  }
  updateAccount(accountId: number, account: Object): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${accountId}`, account);
  }
  getAccountById(accountId: number): Observable<any>{
    return this.httpClient.get<Account>(`${this.baseURL}/${accountId}`);
  }

  deleteAccount(accountId: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${accountId}`);
  }

}
