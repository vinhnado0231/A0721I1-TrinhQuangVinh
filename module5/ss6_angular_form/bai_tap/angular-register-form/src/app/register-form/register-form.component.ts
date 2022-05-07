import {Component, OnInit} from '@angular/core';
import {FormGroup, FormControl, Validators, AbstractControl, FormBuilder} from '@angular/forms'


// @ts-ignore
@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})

export class RegisterFormComponent implements OnInit {
  registerForm!: FormGroup;

  countryList = [
    {
      id: 1, name: 'Vietnam'
    }, {
      id: 2, name: 'America'
    }, {
      id: 3, name: 'England'
    }, {
      id: 4, name: 'Japan'
    }, {
      id: 5, name: 'China'
    },
  ]

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.registerForm = this.fb.group({
      email: new FormControl('', [Validators.required,Validators.email]),
      pwGroup: new FormGroup({
        password: new FormControl( '' ,[Validators.required,Validators.minLength(6)]) ,
        confirmPassword: new FormControl('',[Validators.required,Validators.minLength(6)])
      } , comparePassword),
      country: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required, Validators.min(18)]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required, Validators.pattern(" /^\\+84\\d{9,10}$/")])
    });
  }

  onSubmit() {
    console.log(this.registerForm.value);
  }
}

function comparePassword(c: AbstractControl) {
  const v = c.value;
  return (v.password === v.confirmPassword) ? null : {
    passwordnotmatch: true
  };
}

