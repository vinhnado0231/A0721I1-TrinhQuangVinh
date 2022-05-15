import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../model/product";
import {Category} from "../model/category";

const API = 'http://localhost:3000/category'

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private httpClient: HttpClient) {
  }
  getAll(): Observable<Category[]> {
    return this.httpClient.get<Category[]>(API);
  }

  saveCategory(category): Observable<Product> {
    return this.httpClient.post<Category>(API,category);
  }

  findCategoryById(id: number): Observable<Category> {
    return this.httpClient.get<Category>(`${API}/${id}`);
  }

  updateCategory(id: number, category: Category): Observable<Category> {
    return this.httpClient.put<Category>(`${API}/${id}`, category);
  }

  deleteCategory(id: number): Observable<Category> {
    return this.httpClient.delete<Category>(`${API}/${id}`);
  }
}
