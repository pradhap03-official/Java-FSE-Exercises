import { Component } from '@angular/core';
import { Student } from './student';
import { StudentService } from './student.service';

@Component({
  selector:'app-student',
  templateUrl:'./app.component.html'
})

export class StudentComponent{

students:Student[]=[];

constructor(private service:StudentService){

this.students=this.service.getStudents();

}

}