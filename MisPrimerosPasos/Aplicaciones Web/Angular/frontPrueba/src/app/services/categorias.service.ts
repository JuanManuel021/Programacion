import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CategoriasService {
url: any ='http://localhost:8080/v1/categorias';

  constructor(private http:HttpClient) { }
  obtenerTodasCategorias(){
    return this.http.get(this.url);
  }
}
