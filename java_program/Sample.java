Method:

A method is a block of code that performs a specific task.


public class Main
{
    static void java(){
        System.out.print("Hello ");
		System.out.println("Java...");
    }
    static void python(){
        System.out.print("Hello ");
		System.out.println("Python...");
    }

	public static void main(String[] args) {
		java();java();java();
		python();
	}
}


Why Do we use method:

1. Code reusability
2. Readability
3. Easy Maintenance
4. Less code duplication


Syntax :

AccessModifier static returnType methodName(parameter){
    // Code
    return value;
}

Types of Method:

1. Method without parameter & without return value

public class Main
{
    static void java(){
		System.out.println("Java...");
    }
    
	public static void main(String[] args) {
		java();
	}
}


2. Method with parameter:


public class Main
{
    static void java(String name){
		System.out.println(name);
    }
    
	public static void main(String[] args) {
		java("java");
	}
}

3. Method with Return value:

public class Main
{
    static int add(int a,int b){ 
		int c = a+b;
		return c;
    }
    
	public static void main(String[] args) {
		
		System.out.print(add(2,3));
		
	}
}