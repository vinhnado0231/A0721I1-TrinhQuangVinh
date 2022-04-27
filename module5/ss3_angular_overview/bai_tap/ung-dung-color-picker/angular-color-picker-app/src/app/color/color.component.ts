import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {
  red: number = 0;
  blue: number = 0;
  green: number = 0;
  colorCode: string = this.rgbToHex(this.red, this.green, this.blue);

  rgbToHex(r, g, b): string {
    return "#" + ((1 << 24) + (r << 16) + (g << 8) + b).toString(16).slice(1);
  }

  calcColorCode() {
    this.colorCode = this.rgbToHex(this.red, this.green, this.blue);
  }

  constructor() {
  }

  ngOnInit(): void {
  }

}
