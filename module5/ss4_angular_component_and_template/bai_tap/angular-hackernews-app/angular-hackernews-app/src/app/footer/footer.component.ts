import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {
  url = [
    'https://www.hostinger.vn/huong-dan/web-design',
    'https://www.imf.org/en/Publications/fandd',
    'https://www.hostinger.vn/',
    'https://www.google.com.vn/?hl=vi',
    'https://github.com/',
    'https://james.codegym.vn/'
  ];

  constructor() {
  }

  ngOnInit(): void {
  }

}
