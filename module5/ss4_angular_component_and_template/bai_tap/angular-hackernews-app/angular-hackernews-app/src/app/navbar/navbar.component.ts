import { Component, OnInit } from '@angular/core';
import {Article} from "../article";

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  url = [
    'https://www.hostinger.vn/huong-dan/web-design',
    'https://www.imf.org/en/Publications/fandd',
    'https://www.hostinger.vn/',
    'https://www.google.com.vn/?hl=vi',
    'https://github.com/',
    'https://james.codegym.vn/'
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
