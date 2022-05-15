import {Component, OnInit} from '@angular/core';
import {Todo} from "../model/todo";
import {FormControl, FormGroup} from "@angular/forms";
import {TodoService} from "../service/todo.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
  todos: Todo[] = [];
  inputForm: FormGroup;
  contentForm: FormGroup;
  todo: Todo;

  constructor(private todoService: TodoService, private router: Router) {
    this.inputForm = new FormGroup({
      input: new FormControl()
    })
  }

  ngOnInit(): void {
    this.todoService.getAll().subscribe(data => {
      this.todos = data;
    })
  }

  change() {

  }

  toggleTodo(id: number) {
    this.todoService.findById(id).subscribe(data => {
      this.todo = data;
      this.todo.complete = !this.todo.complete;
      this.todoService.update(id, this.todo).subscribe();
    })
  }
  getTodo(id: number) {
    return this.todoService.findById(id).subscribe(todo => {
      this.contentForm = new FormGroup({
        content: new FormControl(todo.content),
      });
    });
  }
}
