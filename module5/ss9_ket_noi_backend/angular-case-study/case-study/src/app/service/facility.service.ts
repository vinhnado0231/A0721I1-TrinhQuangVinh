import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Facility} from "../model/facility";

const URL_API = '  http://localhost:3000/facility';

@Injectable({
  providedIn: 'root'
})
export class FacilityService {

  constructor(private httpClient: HttpClient) {
  }
  getAll(): Observable<Facility[]> {
    return this.httpClient.get<Facility[]>(URL_API);
  }

  save(facility: Facility): Observable<Facility> {
    return this.httpClient.post<Facility>(URL_API,facility);
  }

  findById(id: number): Observable<Facility> {9
    return this.httpClient.get<Facility>(`${URL_API}/${id}`);
  }

  update(id: number, facility: Facility): Observable<Facility> {
    return this.httpClient.put<Facility>(`${URL_API}/${id}`, facility);
  }

  delete(id: number): Observable<Facility> {
    return this.httpClient.delete<Facility>(`${URL_API}/${id}`);
  }
}
