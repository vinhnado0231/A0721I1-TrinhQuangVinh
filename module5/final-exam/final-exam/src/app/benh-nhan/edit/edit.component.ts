import {Component, OnInit} from '@angular/core';
import {BenhAn} from "../../model/benh-an";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {BenhAnService} from "../../service/benh-an.service";


@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  benhAn: BenhAn;
  editForm: FormGroup;
  id: number;

  constructor(private benhAnService: BenhAnService, private router: Router, private activatedRouter: ActivatedRoute) {

  }

  ngOnInit(): void {
    this.setValueForm();
  }

  setValueForm() {
    this.activatedRouter.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('i');

    })
    this.benhAnService.findById(this.id).subscribe(data => {
      this.benhAn=data;
      console.log(this.benhAn);
      this.editForm = new FormGroup({
        id: new FormControl(data.id),
        idBenhAn: new FormControl(data.idBenhAn),
        benhNhan: new FormGroup({
          idBenhNhan: new FormControl(data.benhNhan.idBenhNhan),
          name: new FormControl(data.benhNhan.name)
        }),
        dataStart: new FormControl(data.dateStart),
        dateEnd: new FormControl(data.dateEnd),
        liDoNhapVien: new FormControl(data.liDoNhapVien),
        ppDieuTri: new FormControl(data.ppDieuTri),
        bacSi: new FormControl(data.bacSi)
      })
    })

  }

  editBenhAn() {
    this.benhAn = this.editForm.value;
    this.benhAnService.update(this.benhAn.id, this.benhAn).subscribe();
  }


}
