import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';
export class JwtRequest{
  constructor(user:String,password:String){}
}
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  userName:string=''
  password:string=''
  AuthError:boolean=false
  errorMsg:String=''
  
  constructor(private authService:AuthenticationService,private route:Router) { }

  ngOnInit(): void {
  }
  login(){
    this.authService.authenticate(this.userName,this.password).subscribe(userData =>this.handleResponce(userData,this.userName)
    ,error=>this.handleError(error))
  }

  handleError(error:any){
    this.errorMsg=error.error.message
    this.AuthError=true
    this.userName=''
    this.password='' 
  } 
  handleResponce(responce:any,name:any){
    sessionStorage.setItem('username',responce.userid)
    let tokenStr= 'Bearer '+responce.authToken
    sessionStorage.setItem('token', tokenStr)
    this.route.navigate(['/home'])
    this.AuthError=false
  }
  closeErrorBox(){
    this.AuthError=false
  }

}