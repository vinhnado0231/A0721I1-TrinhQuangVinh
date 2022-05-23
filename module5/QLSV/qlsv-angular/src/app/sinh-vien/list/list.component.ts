import {Component, OnInit} from '@angular/core';
import {Sv} from "../../model/sv";
import {SinhVienService} from "../../service/sinh-vien.service";
import {Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  Svs: Sv[] = [];
  formSearch: FormGroup;

  constructor(private sinhVienService: SinhVienService, private router: Router) {
    this.formSearch = new FormGroup({
      name: new FormControl('', [Validators.required])
    })
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.sinhVienService.getAll().subscribe(data => {
        this.Svs = data;
      }
    )
  }

  deleteConfirm(id: number) {
    if (confirm("Are you sure?")) {
      this.deleteSV(id);
    }
  }

  deleteSV(id: number) {
    this.sinhVienService.deleteSV(id).subscribe(data => {
        this.ngOnInit()
      }
    );
  }

  search() {
    const name = this.formSearch.get('name').value;
    this.sinhVienService.searchSVByName(name).subscribe(data => {
      this.Svs = data;
    })
  }

  reset(){
    this.formSearch.reset();
    this.ngOnInit();
  }

  sort() {
    this.sinhVienService.sortSVByName().subscribe(data =>{
      this.Svs = data;
    })
  }
}
