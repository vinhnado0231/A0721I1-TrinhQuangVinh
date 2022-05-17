import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ListComponent} from "./sinh-vien/list/list.component";
import {CreateComponent} from "./sinh-vien/create/create.component";
import {EditComponent} from "./sinh-vien/edit/edit.component";



const routes: Routes = [
  {
    path: "student",
    component: ListComponent
  }, {
    path: "student/create",
    component: CreateComponent
  }, {
    path: "student/edit/:i",
    component: EditComponent
  }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
