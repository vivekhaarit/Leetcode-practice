import java.util.Scanner;

public class ArrayBasedStack {
    private static int[] stack;
    private static int top;
    private static int capacity;

    ArrayBasedStack(){
        top=-1;
        stack = new int[10];
        capacity = stack.length;
    }

    public boolean contains(int element) {
        for(int i=top;i>=0;i--){
            if(stack[i]==element) return true;
        }
        return false;
    }

    public int length() {
        return top+1;
    }

    public int peek() {
        if(top!=-1) {
            return stack[top];
        }else {
            System.out.println("There's no element in the stack.");
        }
        return stack[top];
    }

    public int pop() {
        int result = 0;
        if(top!=-1) {
            result = stack[top];
            stack[top]=0;
            top--;
        }
        else System.out.println("There's no element in the stack");
        return result;
    }

    public void push(int element) {
        if(top!=capacity-1){
            top++;
            stack[top]=element;
        }else{
            System.out.println("The stack is full.");
        }

    }

    public void traverse() {
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }
}
class ArrayBasedStack_Driver{
    public static void main(String[] args) {
        ArrayBasedStack stack = new ArrayBasedStack();
        boolean keep_playing = true;
        do{
            System.out.println("\nPress the following buttons for below options:");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Length\n5. Contains\n6. Traverse\nX. To Terminate");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.print("Enter element: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2 :
                    System.out.println(stack.pop());
                    break;
                case 3 :stack.peek();
                    break;
                case 4 :
                    System.out.println(stack.length());
                    break;
                case 5 :System.out.print("Enter the no you want to search for: "+ stack.contains(scanner.nextInt()));
                    break;
                case 6 :stack.traverse();
                    break;
                default: keep_playing = false;
            }
        }while(keep_playing);
        System.out.println("You're now out of the Stack");
        System.out.println("yet another test from github.com");
    }
}
