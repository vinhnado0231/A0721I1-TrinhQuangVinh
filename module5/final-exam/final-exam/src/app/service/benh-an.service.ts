import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {BenhAn} from "../model/benh-an";
const URL_API= "http://localhost:8080/benh-an"
@Injectable({
  providedIn: 'root'
})
export class BenhAnService {

  constructor(private httpClient : HttpClient) { }

  getAll(): Observable<BenhAn[]> {
    return this.httpClient.get<BenhAn[]>(URL_API);
  }

  save(benhAn): Observable<BenhAn> {
    return this.httpClient.post<BenhAn>(URL_API, benhAn);
  }

  findById(id: number): Observable<BenhAn> {
    return this.httpClient.get<BenhAn>(`${URL_API}/${id}`);
  }

  update(id: number, benhAn: BenhAn): Observable<BenhAn> {
    return this.httpClient.put<BenhAn>(`${URL_API}/${id}`, benhAn);
  }

  delete(id: number): Observable<BenhAn> {
    return this.httpClient.delete<BenhAn>(`${URL_API}/${id}`);
  }

}
