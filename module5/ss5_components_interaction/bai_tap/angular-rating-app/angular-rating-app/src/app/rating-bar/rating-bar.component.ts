import {Component, EventEmitter, Input, OnInit, Output, SimpleChanges} from '@angular/core';
import {IRatingUnit} from "../i-rating-unit";
import {RatingUnit} from "../rating-unit";

@Component({
  selector: 'app-rating-bar',
  templateUrl: './rating-bar.component.html',
  styleUrls: ['./rating-bar.component.css']
})
export class RatingBarComponent implements OnInit {
  rating: IRatingUnit[] = RatingUnit.rating;
  @Output()
  change: EventEmitter<number> = new EventEmitter<number>();

  select(value: number) {
    this.change.emit(value);
    for (let i = 0; i < value; i++) {
      this.rating[i].active = true;
    }
    for (let i = value; i < 10; i++) {
      this.rating[i].active = false;
    }
  }

  ngOnInit(): void {
    this.select(5);
  }

}
