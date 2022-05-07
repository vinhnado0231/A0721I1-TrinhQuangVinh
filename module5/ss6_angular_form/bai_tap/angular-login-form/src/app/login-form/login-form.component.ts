import {Component, OnInit} from '@angular/core';
import {UserAccount} from "../user-account";
import {AbstractControl, FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
  static userAccount: UserAccount[] = [{
    email: 'user@email.com',
    password: '123456'
  }]

  formLogin!: FormGroup;


  constructor() {
  }

  ngOnInit(): void {
    this.formLogin = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [Validators.required, Validators.minLength(6)])
    });
  }

  login() {
    if (checkLogin(this.formLogin.value.email,this.formLogin.value.password)) {
      console.log(this.formLogin.value);
    }else{
      console.log("Invalid user");
    }
    this.formLogin.reset();
  }
}

function checkLogin( email:string ,password:string) {
  return (email === LoginFormComponent.userAccount[0].email && password === LoginFormComponent.userAccount[0].password);
}


