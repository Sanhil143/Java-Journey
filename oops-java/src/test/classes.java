package test;
class Student{
  int studentId;
  String studentName;
  String studentCity;
  String studentMessage;

  //constructor
  Student(){
    System.out.println("I am non-paramaterized constructor");
  }

  //constructor overloading
  Student(String studentMessage){
    //using this keyword
    this.studentMessage = studentMessage;
    System.out.println("I am paramaterized constructor");
  }

  public void study(){
    System.out.println(studentName + " is studying");
  }
  public  void studentDetails(){
    System.out.println("my name is " + studentName + " and my id is " + studentId + " and i lived in " + studentCity);
  }

  public void greetMessage(){
    System.out.println(studentName +" " + studentMessage);
  }

  //method overloading
  public void greetMessage(int count){
    System.out.println("student count " + count);
  }
}