
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { observable, Observable } from 'rxjs';

export class AppUser {
  constructor( id : number ,
    name: string ,
    password: string ,
    mobile: number ,
    mailId:string ,
    regDate : Date ){
   
  }
  
}

@Injectable({
  providedIn: 'root'
})
export class ListUserService {

  constructor(private http:HttpClient ,private router :Router) { }
  getAllUsers(){return this.http.get<AppUser[]>('http://localhost:9090/user',{headers:this.createHeader()})}
  createHeader(){
    let token= sessionStorage.getItem('token')
    if(token!==null){
      var header=new HttpHeaders({Authorization:token})
      return header
    }
    this.router.navigate(['login'])
    return 
  }

registerUser (user : AppUser): Observable<Object>{
 return this.http.post('${this.http://localhost:9090/user}',user); 

  }
}

