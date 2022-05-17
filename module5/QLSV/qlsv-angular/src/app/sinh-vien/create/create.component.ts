import {Component, OnInit} from '@angular/core';
import {Sv} from "../../model/sv";
import {SinhVienService} from "../../service/sinh-vien.service";
import {Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {LopShService} from "../../service/lop-sh.service";
import {LopSh} from "../../model/lop-sh";

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  sv: Sv;
  lopSH: LopSh[] = [];
  createForm: FormGroup;

  constructor(private sinhVienService: SinhVienService, private router: Router, private lopSHService: LopShService) {
    this.createForm = new FormGroup({
      mssv: new FormControl('', [Validators.required]),
      name: new FormControl('', [Validators.required]),
      lopSH: new FormGroup({
        id: new FormControl(''),
        nameLop: new FormControl('')
      }),
      dtb: new FormControl('', [Validators.required]),
      sdt: new FormControl('', [Validators.required])
    })
  }

  ngOnInit(): void {
    this.getAllLopSH();
  }

  createSV() {
    this.sv = this.createForm.value;
    this.lopSHService.findLSHById(this.sv.lopSH.id).subscribe(data => {
      this.sv.lopSH = data;
      this.sinhVienService.saveSV(this.sv).subscribe();
    })
    alert("Thêm mới thành công");
  }

  getAllLopSH() {
    this.lopSHService.getAll().subscribe(data => {
      this.lopSH = data;
    })
  }
}
