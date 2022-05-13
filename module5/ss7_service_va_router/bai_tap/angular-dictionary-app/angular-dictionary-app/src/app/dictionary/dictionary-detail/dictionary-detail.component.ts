import {Component, OnInit} from '@angular/core';
import {DictionaryServiceService} from "../../service/dictionary-service.service";
import {IWord} from "../../model/i-word";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {
  word: IWord;
  index: number;

  constructor(private dictionaryService: DictionaryServiceService , private router : Router, private  activeRouter : ActivatedRoute) {
  }

  ngOnInit(): void {
    this.index= this.activeRouter.snapshot.params['i'];
    console.log(this.index);
    this.getWord(this.index);
  }

  getWord(index: number) {
    this.word = this.dictionaryService.getWordByIndex(index);
  }
}
