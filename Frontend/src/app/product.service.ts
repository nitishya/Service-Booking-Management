import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

export class Product {
  constructor(  id: number,
    name: string,
    make: string,
    model: string,
    cost: DoubleRange,
    createdDate: Date){
  }
}

@Injectable({
  providedIn: 'root'
})

export class ProductService {

  constructor(private http:HttpClient ,private router :Router) { }
  getAllProducts(){return this.http.get<Product[]>('http://localhost:9000/product',{headers:this.createHeader()})}
  createHeader(){
    let token= sessionStorage.getItem('token')
    if(token!==null){
      var header=new HttpHeaders({Authorization:token})
      return header
    }
    this.router.navigate(['login'])
    return 
  }
}
