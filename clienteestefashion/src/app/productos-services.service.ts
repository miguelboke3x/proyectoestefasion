import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' }) 
export class ProductosServicesService {
  productos: Observable<any[]>=new Observable(); 
  constructor(private clienteHttp: HttpClient) { 

  } getProductos(): Observable<any[]> { 
  console.log("Obteniendo productos del WS"); 
  this.productos = this.clienteHttp.get<any[]>("http://localhost:80/estefashion/productos") 
  return this.productos; 
  } 
}