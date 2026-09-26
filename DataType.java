public class DataType {
    public static void main(String[] args) {
        //primitive Data type
            int x=30;//4 byte
            byte b=20;//1 byte
            long l=12342342;//8 byte
            float f=3.1412f;//4byte
            double d=3.2456234;//8 byte
            char c='S';//2 byte
            boolean bo=true;
            //non primitive data type
            String str="Sajedin siam";//string class java
            int[] arr={1,2,3,4,5,};//array
            Integer wrapperInt=Integer.valueOf(60);//wrapper class example
            StringBuilder sb= new StringBuilder("java");//class obj\


            System.out.println("Integer :"+ x);
            System.out.println("byte :"+ b);
            System.out.println("Long :"+ l);
            System.out.println("Float :"+ f);
            System.out.println("Double :"+ d);
            System.out.println("Character :"+ c);
            System.out.println("Boolean :"+ bo);
            System.out.println("String :"+ str);
            System.out.println("Array :"+ arr);
            System.out.println("Wrapper Integer :"+ wrapperInt);
            System.out.println("String Builder :"+ sb);

    }
    
}
