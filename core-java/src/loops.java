class Loops{
  public static void main(String[] args){
    //for loop
    for(int i=1; i<=10; i++){
      System.out.print(i+" ");
    }
    System.out.println();
    for(int i=10; i>=1; i--){
      System.out.print(i+" ");
    }
    System.out.println();

    //while loop
    int sanhil = 27;
    while(sanhil <= 30){
      System.out.println("sanhil : " + sanhil);
      sanhil++;
    }
    System.out.println();

    //do while loop
    int ashu = 100;
    do{
      System.out.println("ashu : " + ashu);
      ashu++;
    }while (ashu <=109);
  }
}