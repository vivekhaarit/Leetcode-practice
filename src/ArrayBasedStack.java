import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBasedStack<T> {
    private ArrayList<T> stack;
    private static int top=-1;

    ArrayBasedStack(){
        stack = new ArrayList<>();
    }

    public boolean contains(T element) {
        if(top==-1) System.out.println("stack is empty");
        return stack.contains(element);
    }

    public int length() {
        return top+1;
    }

    public T peek() {
        if(top==-1) System.out.println("stack is empty");
        return stack.get(top);
    }

    public T pop() {
        if(top==-1){
            System.out.println("stack is empty");
        }
       return stack.get(top);
    }

    public void push(T element) {
        top++;
        stack.add(element);
    }

    public void traverse() {
        for(int i=0;i<=top;i++){
            System.out.print(stack.get(i)+" ");
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
                    stack.push(scanner.next());
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

    }
}
