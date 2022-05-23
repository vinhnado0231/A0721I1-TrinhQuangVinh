import {Component, OnInit} from '@angular/core';
import {BenhAn} from "../../model/benh-an";
import {BenhAnService} from "../../service/benh-an.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  benhAns: BenhAn[] = [];


  constructor(private benhAnService: BenhAnService, private router: Router) {
  }

  ngOnInit(): void {
    this.getAllBenhAn();
  }

  getAllBenhAn() {
    this.benhAnService.getAll().subscribe(data => {
      this.benhAns = data;
    })
  }

  deleteConfirm(idbenhAn: string,id:number) {
    let str = "Bạn có muốn xoá thông tin bện án có mã " + idbenhAn +" không?"
    if (confirm(str)) {
      this.deleteBenhAn(id);
    }
  }

  deleteBenhAn(id: number) {
    this.benhAnService.delete(id).subscribe(data => {
        this.ngOnInit()
      }
    );
  }
}
