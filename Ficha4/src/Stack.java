import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<String> stack;

    public Stack(){
        stack = new ArrayList<>();
    }

    public Stack(List<String> stack) {
        this.stack = new ArrayList<>();
        this.stack.addAll(stack);
    }

    public Stack(Stack umaStack){
        this.stack = new ArrayList<>();
        this.stack.addAll(umaStack.getStack());
    }

    public List<String> getStack() {
        return new ArrayList<>(this.stack);
    }

    public void setStack(List<String> stack) {
        this.stack.addAll(stack);
    }

    /* Exercícios */

    public String top(){
        return this.stack.get(this.stack.size()-1);
    }

    public void push(String s){
        this.stack.add(s);
    }

    public void pop(String s){
        this.stack.remove(this.stack.size() - 1);
    }

    public boolean empty(){
        return this.stack.isEmpty();
    }

    public int length(){
        return this.stack.size();
    }
}
