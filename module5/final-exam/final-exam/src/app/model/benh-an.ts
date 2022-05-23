import {BenhNhan} from "./benh-nhan";

export interface BenhAn {
  id?: number;
  idBenhAn?: string;
  benhNhan?: BenhNhan;
  dateStart?: string;
  dateEnd?: string;
  liDoNhapVien?: string;
  ppDieuTri?: string;
  bacSi?: string;
}
