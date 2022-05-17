import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Sv} from "../model/sv";

const URL_API = "http://localhost:3000/sv";

@Injectable({
  providedIn: 'root'
})
export class SinhVienService {

  constructor(private httpClient: HttpClient) {
  }
  getAll(): Observable<Sv[]> {
    return this.httpClient.get<Sv[]>(URL_API);
  }

  saveSV(sv): Observable<Sv> {
    return this.httpClient.post<Sv>(URL_API,sv);
  }

  findSVById(id: number): Observable<Sv> {
    return this.httpClient.get<Sv>(`${URL_API}/${id}`);
  }

  updateSV(id: number, sv: Sv): Observable<Sv> {
    return this.httpClient.put<Sv>(`${URL_API}/${id}`, sv);
  }

  deleteSV(id: number): Observable<Sv> {
    return this.httpClient.delete<Sv>(`${URL_API}/${id}`);
  }
}
