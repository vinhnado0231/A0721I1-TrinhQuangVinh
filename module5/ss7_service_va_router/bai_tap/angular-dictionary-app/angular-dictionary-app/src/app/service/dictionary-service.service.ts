import {Injectable} from '@angular/core';
import {IWord} from "../model/i-word";

@Injectable({
  providedIn: 'root'
})
export class DictionaryServiceService {
  private static word: IWord[] = [
    {word: "class", mean: "Lớp"},
    {word: "school", mean: "Trường học"},
    {word: "dictionary", mean: "Từ điển"},
    {word: "library", mean: "Thư viện"},
    {word: "Teacher", mean: "Giáo viên"},
    {word: "Student", mean: "Học sinh"}
  ]

  constructor() {
  }

  getAll() {
    return DictionaryServiceService.word;
  }

  getWordByIndex(index: number) {
    return DictionaryServiceService.word[index];
  }
}

