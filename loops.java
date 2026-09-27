



public class loops {
    public static void main(String[] args) {
        //for loop
        System.out.println("For loop:");
        for(int i=1;i<=5;i++){
            System.out.println("i="+i);
        }
        //while loop
        System.out.println("\n While Loop:");
        int j=1;
        while(j<=10){
            System.out.println("j="+j);
            j++;
        }
        //do-while loop
        System.out.println("\n Do-while loop");
        int k=1;
        do { 
            System.out.println("k="+k);
            k++;

        } while (k<=5);
        //Enhanced for loop 
        System.out.println("\n Enhanced For loop:");
        int[]numbers={1,2,3,4,5,6,7,8};
        for(int num:numbers){
            System.out.println("num="+num);
        }
    }
}
