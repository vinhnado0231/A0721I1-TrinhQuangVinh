import {Injectable} from '@angular/core';
import {BenhNhan} from "../model/benh-nhan";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

const URL_API = "http://localhost:8080/benh-nhan";

@Injectable({
  providedIn: 'root'
})
export class BenhNhanService {

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<BenhNhan> {
    return this.httpClient.get<BenhNhan>(`${URL_API}`);
  }

  getBenhNhanById(id: number): Observable<BenhNhan> {
    return this.httpClient.get<BenhNhan>(`${URL_API}/${id}`);
  }

  updateBenhNhan(id: number, benhNhan: BenhNhan): Observable<BenhNhan> {
    return this.httpClient.patch<BenhNhan>(`${URL_API}/${id}`, benhNhan);
  }
}
