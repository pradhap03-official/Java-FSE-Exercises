import { Injectable } from '@angular/core';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})

export class StudentService {

  getStudents():Student[]{

    return[
      {id:1,name:"Pradhap",course:"Java"},
      {id:2,name:"Rahul",course:"Angular"},
      {id:3,name:"Kumar",course:"Spring Boot"}
    ];

  }

}