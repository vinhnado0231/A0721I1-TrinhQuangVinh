import {Component, OnInit} from '@angular/core';
import {Todo} from '../model/todo';
import {FormControl, FormGroup} from '@angular/forms';
import {TodoService} from '../service/todo.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
  todos: Todo[] = [];
  inputForm: FormGroup;
  todo: Todo;

  constructor(private todoService: TodoService, private router: Router) {
    this.inputForm = new FormGroup({
      id: new FormControl(''),
      content: new FormControl(''),
      complete: new FormControl(false)
    });
  }

  ngOnInit(): void {
    this.todoService.getAll().subscribe(data => {
      this.todos = data;
    });
  }

  toggleTodo(id: number) {
    this.todoService.findById(id).subscribe(data => {
      this.todo = data;
      this.todo.complete = !this.todo.complete;
      this.todoService.update(id, this.todo).subscribe(() => {
        this.ngOnInit();
      });
    });
  }

  change() {
    this.todo = this.inputForm.value;
    this.todoService.save(this.todo).subscribe(() => {
    }, () => {
      console.log('error');
    }, () => {
      this.ngOnInit();
    });
    this.inputForm.reset();
  }

  deleteTodo(id: number) {
    this.todoService.delete(id).subscribe(() => {
      this.ngOnInit();
    });
  }
}
