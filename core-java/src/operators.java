class Operators{
    public static void main(String[] args){
        int a = 20, b=30;
        int c = a+b;
        System.out.println(c);  // this is arithmetic operator

        // comparison operator
        if(a == b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        //logical operator
        if(a == b && b == a){
            a = 30;
        }else{
            System.out.println("not performed");
        }
    }
}