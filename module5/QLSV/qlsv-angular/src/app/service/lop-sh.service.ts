import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {Sv} from "../model/sv";
import {HttpClient} from "@angular/common/http";
import {LopSh} from "../model/lop-sh";

const URL_API='http://localhost:3000/lopSH'
@Injectable({
  providedIn: 'root'
})
export class LopShService {

  constructor(private httpClient:HttpClient) { }

  getAll(): Observable<LopSh[]> {
    return this.httpClient.get<LopSh[]>(URL_API);
  }

  saveLSH(lopSH): Observable<LopSh> {
    return this.httpClient.post<LopSh>(URL_API,lopSH);
  }

  findLSHById(id: number): Observable<LopSh> {
    return this.httpClient.get<LopSh>(`${URL_API}/${id}`);
  }

  updateLSH(id: number, lopSH: LopSh): Observable<LopSh> {
    return this.httpClient.put<LopSh>(`${URL_API}/${id}`, lopSH);
  }

  deleteLSH(id: number): Observable<LopSh> {
    return this.httpClient.delete<LopSh>(`${URL_API}/${id}`);
  }
}
