package test;
class Student{
  int studentId;
  String studentName;
  String studentCity;

  public void study(){
    System.out.println(studentName + " is studying");
  }
  public  void studentDetails(){
    System.out.println("my name is " + studentName + " and my id is " + studentId + " and i lived in " + studentCity);
  }
}