class TypeCasting{
    public static void main(String[] args){
        // there are two type of castings in java
        //implicit and explicit
        //implicit is automatically done by language like-
        int a = 50;
        double b = a;
        System.out.println(a); //return 50
        System.out.println(b); //return 50.0

        //explicit is basically change by developers like-
        double aa = 50.23;
        int bb = (int) aa;
        System.out.println(aa); //return 50.23
        System.out.println(bb); //return 50
    }
}