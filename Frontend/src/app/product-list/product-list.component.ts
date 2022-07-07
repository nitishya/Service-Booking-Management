import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../authentication.service';
import { Product } from '../product';
import { ProductService } from '../product.service';


@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[] = [];

  constructor(private productlist : ProductService,private authService:AuthenticationService) { 
   
  }
  product:any=[]

  getProductList(){

  }

  ngOnInit(): void {
    this.productlist.getAllProducts().subscribe(reponce=>{
      this.product.push(...reponce)},error=>this.handleError(error))
  }
  AuthError:boolean=false
  errorMsg:String=''
  handleError(errorText:any){
    this.errorMsg=errorText.error.message
        if(this.errorMsg==='[403] during [GET] to [http://localhost:8084/api/auth/validate] [AuthenticationFeignClient#verifyToken(String)]: []'){
      this.errorMsg='Session Expired..Login Again'
      this.authService.sessionExpired()
    }
    this.AuthError=true
    console.log(errorText.error)
  }
  closeErrorBox(){
    this.AuthError=false
  }

}
