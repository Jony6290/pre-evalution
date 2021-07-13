import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-update-student',
  templateUrl: './update-student.component.html',
  styleUrls: ['./update-student.component.css']
})
export class UpdateStudentComponent implements OnInit {

  id!: number;
  student: Student = new Student();
  date=new Date();
  isInvalid!: Boolean;
  gender: string = 'male';
  age!: number;

  constructor(private studentService: StudentService, private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {

    this.id = this.route.snapshot.params['id'];

    this.studentService.getStudentById(this.id).subscribe(data => {
      this.student = data;
    }, error => console.log(error));
  }

  onSubmit(stuForm: NgForm): void {
    console.log(this.date.getFullYear() - Number((String(this.student.dateOfBirth)).substr(0,4)));
    if (stuForm.valid) {
      this.student.age = this.date.getFullYear() - Number((String(this.student.dateOfBirth)).substr(0,4));
      this.updateStudent();
    }else{
      alert("Please fill all required fields up!");
      this.isInvalid = true;
    }

  }

  updateStudent(){
    this.studentService.updateStudent(this.id, this.student).subscribe(data => {
      this.gotoStudentList();
    },
    error => console.log(error));
  }

  gotoStudentList(){
    this.router.navigate(['/students']);
  }

}
