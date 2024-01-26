
class Conditionals{
    public static void main(String[] args){
        int sanhil = 27;
        int rohit = 17;
        if(sanhil > rohit){
            System.out.println("Sanhil is bigger");
        }
        else if(rohit > sanhil){
            System.out.println("Rohit is bigger");
        }else{
            System.out.println("No one is bigger");
        }

        //Switch case conditionals
        switch (sanhil){
            case 27 :
                System.out.println("switch : sanhil is 27");
                break;
            default:
                System.out.println("default : default line");
        }
    }
}