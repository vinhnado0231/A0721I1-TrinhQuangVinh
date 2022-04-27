import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  display: string = '';

  allClear() {
    this.display = "";
  }

  getNumber(num: string) {
    if (this.display == "ERROR") {
      return;
    }
    this.display += num;
  }

  getOperation(operator: string) {
    if (this.display == "ERROR") {
      return;
    }
    this.display += operator;
  }

  getDecimal() {
    if (this.display == "ERROR") {
      return;
    }
    this.display += ".";
  }

  getResult() {
    try {
      this.display = eval(this.display);
    } catch (e) {
      this.display = "ERROR";
    }
  }

  constructor() {
  }

  ngOnInit(): void {
  }

}
