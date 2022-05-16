import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { Observable } from 'rxjs';
import {Todo} from "../model/todo";

const URL_API = "http://localhost:3000/todo";

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor(private httpClient: HttpClient) {
  }
  getAll(): Observable<Todo[]> {
    return this.httpClient.get<Todo[]>(URL_API);
  }

  save(todo: Todo): Observable<Todo> {
    return this.httpClient.post<Todo>(URL_API,todo);
  }

  findById(id: number): Observable<Todo> {
    return this.httpClient.get<Todo>(`${URL_API}/${id}`);
  }

  update(id: number, todo: Todo): Observable<Todo> {
    return this.httpClient.put<Todo>(`${URL_API}/${id}`, todo);
  }

  delete(id: number): Observable<Todo> {
    return this.httpClient.delete<Todo>(`${URL_API}/${id}`);
  }

}
