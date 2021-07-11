import { EmailValidator } from "@angular/forms";

export class Student {
    id!: number;
    regId!: string;
    institutionId!: number;
    studentId!: string;
    firstName!: string;
    lastName!: string;
    regDate!: Date;
    dateOfBirth!: Date;
    age!: number;
    gender!: string;
    nid!: number;
    occupation!: string;
    address!: string;
    contactNo!: number;
    emailId!: EmailValidator;
    photo!: string;
    createdOn!: string;
    createdBy!: string;
    academicQualifications!: string;

}
