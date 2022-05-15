import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ProductService} from "../../service/product.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {Category} from "../../model/category";
import {CategoryService} from "../../service/category.service";

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {
  productForm: FormGroup;
  categories: Category[] = [];
  id: number;

  constructor(private productService: ProductService, private activatedRoute: ActivatedRoute, private router: Router, private categoryService: CategoryService) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');

      this.productService.findById(this.id).subscribe(product => {
        this.productForm = new FormGroup({
          id: new FormControl(product.id),
          name: new FormControl(product.name),
          price: new FormControl(product.price),
          description: new FormControl(product.description),
          category: new FormControl(product.category)
        });
      })
    });
  }

  ngOnInit() {
    this.getCategory();
  }

  getProduct(id: number) {
    return this.productService.findById(id);
  }

  updateProduct(id: number) {
    this.productService.updateProduct(id,this.productForm.value).subscribe(data => {
      this.router.navigateByUrl('product/list')
    })
  }

  getCategory() {
    this.categoryService.getAll().subscribe(data => {
      this.categories = data;
    })
  }
}
