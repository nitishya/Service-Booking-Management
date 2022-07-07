import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppUser } from '../app-user';
import { ListUserService } from '../list-user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user: AppUser = new AppUser()
  constructor(private listuser:ListUserService,private router:Router) { }


  ngOnInit(): void {
  }

  saveUser(){
 this.listuser.registerUser(this.user).subscribe(data=>{
  console.log(data);
  this.goToUserList();
 },
 error=>console.log(error));
  }
  
goToUserList(){
 this.router.navigate(['/usermanagement']);
}
  onSubmit(){
    console.log(this.user);
    this.saveUser();
  }

}
