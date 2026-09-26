public class VariableType {
    
    // Instance variable (belongs to each object)
    int instanceVariable = 10;
    
    // Static variable (shared across all objects)
    static String staticVariable = "I am static";
    
    public void showVariable() {
        // Local variable (declared inside a method)
        int x = 20; 
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Local Variable: " + x);
    }
    
    public static void main(String[] args) {
        // Create object
        VariableType obj = new VariableType();
        obj.showVariable();
        
        // Accessing static variable directly using class name
        System.out.println("Accessing Static Variable  class: " + VariableType.staticVariable);
    }
}