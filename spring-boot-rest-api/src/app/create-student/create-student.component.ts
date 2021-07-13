import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent implements OnInit {

  date=new Date();
  student: Student = new Student();
  isInvalid!: Boolean;
  gender: string = 'male';
  dob!: Date;

  constructor(private studentService: StudentService, private router: Router) { }

  ngOnInit(): void {
  }

  saveStudent() {
    this.studentService.saveStudent(this.student).subscribe(data => {
      console.log(data);
      this.gotoStudentList();
    },
      error => console.log(error));
  }

  gotoStudentList() {
    this.router.navigate(['/students']);
  }

  onSubmit(stuForm: NgForm): void {
    if (stuForm.valid) {
      this.saveStudent();
    }else{
      alert("Please fill all required fields up!");
      this.isInvalid = true;
    }

  }

  // urllink:String = "assets/images/1.jpg"

  // selectFiles(event: { target: { files: Blob[]; }; }){
  //    if(event.target.files){
  //      var reader = new FileReader()
  //      reader.readAsDataURL(event.target.files[0])
  //      reader.onload = (event:any) =>{
  //        this.urllink = event.target.result
  //      }
  //    }
  // }

}