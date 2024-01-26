package test;

public class objects{
  public static void main(String[] args) {
    Student std1;
    std1 = new Student();
    std1.studentName = "Sanhil";
    std1.studentId = 7;
    std1.studentCity = "Chhindwara";
    //std1.study();
    std1.studentDetails();
    //or
    Student std2 = new Student();
    std2.studentName = std1.studentName;
    std2.studentId = 27;
    std2.studentCity = std1.studentCity;
    std2.study();
  }
}