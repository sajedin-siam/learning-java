public class SimpleOperator {
    public static void main(String[] args){
        int a=130,b=12;
        //arithmatic operator
        System.out.println("a+b="+(a+b));//addition
        System.out.println("a-b="+(a-b));//subtraction

        //relational operator
        System.out.println("a>b :"+(a>b));//greater than

        //logical operator
        boolean x=true,y=false;
        System.out.println("x&&y="+(x&&y));//logical operator

        //Assignment operator
        a+=5;
        System.out.println("A after +=5:"+a);

        //ternary operator
    int max=(a>b)?a:b;
    System.out.println("Maximum="+ +max);
    }
}
