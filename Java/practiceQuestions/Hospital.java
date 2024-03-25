package Java.practiceQuestions;
/*A group named XMA has hospitals in three major cities. Hospital one has 3 departments ,while the other two only have cardiology departments.All the hospitals have common chairperson and have different HR heads.The different HR heads have access in all the three hospitals also.
Use inheritance concepts to enforce the above */
class Hospital {
    String name;
    String city;
    String chairperson;
  
    Hospital(String name, String city, String chairperson) {
      this.name = name;
      this.city = city;
      this.chairperson = chairperson;
    }
}
  
  class Department {
    String name;
    Hospital hospital;
  
    Department(String name, Hospital hospital) {
      this.name = name;
      this.hospital = hospital;
    }
  }
  
  class CardiologyDepartment extends Department {
    CardiologyDepartment(Hospital hospital) {
      super("Cardiology", hospital);
    }
  }
  
  class HRHead {
    String name;
    Hospital[] hospitals;
  
    HRHead(String name, Hospital[] hospitals) {
      this.name = name;
      this.hospitals = hospitals;
    }
  }
  
  class HospitalOne extends Hospital {
    Department[] departments;
  
    HospitalOne(String name, String city, String chairperson) {
      super(name, city, chairperson);
      departments = new Department[] {
        new Department("Department 1", this),
        new Department("Department 2", this),
        new Department("Department 3", this)
      };
    }
  }
  
  class HospitalTwo extends Hospital {
    CardiologyDepartment cardiologyDepartment;
  
    HospitalTwo(String name, String city, String chairperson) {
      super(name, city, chairperson);
      cardiologyDepartment = new CardiologyDepartment(this);
    }
  }
  
  class HospitalThree extends Hospital {
    CardiologyDepartment cardiologyDepartment;
  
    HospitalThree(String name, String city, String chairperson) {
      super(name, city, chairperson);
      cardiologyDepartment = new CardiologyDepartment(this);
    }
  }
  