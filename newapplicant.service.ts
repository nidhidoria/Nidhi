import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { newapplicant } from './newapplicant/newapplicant';

@Injectable({
  providedIn: 'root'
})
export class NewapplicantService {

  baseURL="http://localhost:8080/applicants";

 //baseURL="http://192.168.0.146:8080/applicants";
  constructor(private myHttp:HttpClient) { }


  loadAllapplicantsService() : Observable<newapplicant[]>
  { 
  
    return this.myHttp.get<newapplicant[]>(this.baseURL+'/getapplicants');
  }
}
