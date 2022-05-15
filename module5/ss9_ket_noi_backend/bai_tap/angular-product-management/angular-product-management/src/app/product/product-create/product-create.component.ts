import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ProductService} from "../../service/product.service";
import {Category} from "../../model/category";
import {CategoryService} from "../../service/category.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  categories: Category[] = [];

  productForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl()
  });

  constructor(private productService: ProductService, private categoryService: CategoryService, private router: Router) {
  }

  ngOnInit(): void {
    this.getCategory();
  }

  submit() {
    this.productService.saveProduct(this.productForm.value).subscribe(data => {
      this.router.navigateByUrl('/product/list');
    });
    this.productForm.reset();
  }

  getCategory() {
    this.categoryService.getAll().subscribe(data => {
      this.categories = data;
    })


  }
}
