
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { prjApplicant } from './project_admin/admin-home/prjApplicant';
import { HttpClient } from '@angular/common/http';
import { InvokeFunctionExpr } from '@angular/compiler';

@Injectable({
  providedIn: 'root'
})
export class PrjApplicantService {
 
  baseURL1="http://localhost:8080/accounts";
  constructor(private myHttp:HttpClient) { }


  loadAllapplicantsService() : Observable<prjApplicant[]>
  { 
        return this.myHttp.get<prjApplicant[]>(this.baseURL1+'/getallapplicant');
  }

  loadAllPendingapplicantsService() : Observable<prjApplicant[]>
  { 
        return this.myHttp.get<prjApplicant[]>(this.baseURL1+'/getpendingapplication');
  }
  viewsingleapplicant(appid : number):Observable<prjApplicant[]>
  { 
     console.log(appid);
    return this.myHttp.get<prjApplicant[]>(this.baseURL1+'/getapplicant/'+appid);
  }
  addaccount(newacc: prjApplicant,appid :number) : Observable<any> {
    
    console.log("addaccount() Invoke...");
    return this.myHttp.post<any>(this.baseURL1+"/add/"+appid,newacc,{responseType:'text' as 'json'});
  }

  rejectaccount(updateacc :  prjApplicant,appid :number) : Observable<any> {
    
    console.log("rejectAccount() Invoke...");
    return this.myHttp.put<any>(this.baseURL1+"/update/"+appid,updateacc,{responseType:'text' as 'json'});
  }

}
