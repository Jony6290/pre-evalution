import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { MatDialog } from '@angular/material/dialog'
import { UpdateStudentComponent } from '../update-student/update-student.component';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  students!: Student[];
  totalLength: any;
  page: number = 1;

  constructor(private studentService: StudentService, private router: Router) {}

  ngOnInit(): void {

    this.getStudents();
  }
 
  private getStudents(){
    this.studentService.getStudentList().subscribe(data => {
      this.students = data;
      this.totalLength = data.length;
    })
  }

  updateStudent(id: number){
    this.router.navigate(['/update-student', id])
  }

  deleteStudent(id: number, name: string){
    if(confirm("Are you sure to delete "+name)) {
    this.studentService.deleteStudent(id).subscribe(data => {
      console.log(data);
      this.getStudents();
    })
  }
  }

  studentDetails(id: number){
    this.router.navigate(['/student-details', id])
  }
  
  openDialog(){
    console.log("open dialog called");
  }

}
