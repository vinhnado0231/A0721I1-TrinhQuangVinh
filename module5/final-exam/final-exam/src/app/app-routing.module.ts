import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ListComponent} from "./benh-nhan/list/list.component";
import {EditComponent} from "./benh-nhan/edit/edit.component";


const routes: Routes = [{
  path : "benhAn",
  component : ListComponent
}, {
  path : "benhAn/edit/:i",
  component : EditComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
