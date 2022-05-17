import {Component, OnInit} from '@angular/core';
import {Sv} from "../../model/sv";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {SinhVienService} from "../../service/sinh-vien.service";
import {LopShService} from "../../service/lop-sh.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {LopSh} from "../../model/lop-sh";

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  sv: Sv;
  editForm: FormGroup;
  lopSH: LopSh[] = [];
  id: number;

  constructor(private sinhVienService: SinhVienService, private lopSHService: LopShService, private router: Router, private activatedRouter: ActivatedRoute) {

  }

  ngOnInit(): void {
    this.getAllLopSH();
    this.setValueForm();
  }

  setValueForm() {
    this.activatedRouter.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('i');
    })
    this.sinhVienService.findSVById(this.id).subscribe(sv => {
      this.editForm = new FormGroup({
        id: new FormControl(sv.id),
        mssv: new FormControl(sv.mssv, [Validators.required]),
        name: new FormControl(sv.name, [Validators.required]),
        lopSH: new FormGroup({
          id: new FormControl(sv.lopSH.id),
          nameLop: new FormControl(sv.lopSH.nameLop)
        }),
        dtb: new FormControl(sv.dtb, [Validators.required]),
        sdt: new FormControl(sv.sdt, [Validators.required])
      })
    })
  }

  getAllLopSH() {
    this.lopSHService.getAll().subscribe(data => {
      this.lopSH = data;
    })
  }

  editSV() {
    this.sv = this.editForm.value;
    this.lopSHService.findLSHById(this.sv.lopSH.id).subscribe(data => {
      this.sv.lopSH = data;
      this.sinhVienService.updateSV(this.sv.id, this.sv).subscribe();
    })
  }
}
