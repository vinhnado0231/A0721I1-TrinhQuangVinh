import {Injectable} from '@angular/core';
import {Product} from "../model/product";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

const API = 'http://localhost:3000/product'

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(
    private httpClient: HttpClient
  ) {
  }

  getAll(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(API);
  }

  saveProduct(product): Observable<Product> {
    return this.httpClient.post<Product>(API,product);
  }

  findById(id: number): Observable<Product> {
    return this.httpClient.get<Product>(`${API}/${id}`);
  }

  updateProduct(id: number, product: Product): Observable<Product> {
    return this.httpClient.put<Product>(`${API}/${id}`, product);
  }

  deleteProduct(id: number): Observable<Product> {
    return this.httpClient.delete<Product>(`${API}/${id}`);
  }
}
