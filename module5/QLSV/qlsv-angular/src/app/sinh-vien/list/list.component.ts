import {Component, OnInit} from '@angular/core';
import {Sv} from "../../model/sv";
import {SinhVienService} from "../../service/sinh-vien.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  Svs: Sv[] = [];

  constructor(private sinhVienService: SinhVienService, private router: Router) {
  }

  ngOnInit(): void {
    this.getAll()
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
}
