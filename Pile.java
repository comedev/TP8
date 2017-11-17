
public class Pile<T>{
    private T data;
    private Pile<T> next;

    public Pile(){
        data=null;
        next=null;
    }

    private Pile(T data, Pile<T> next){
        this.data=data;
        this.next=null;
    }

    public void push(T data){
        Pile newPile = new Pile<T>(data,this);
        this.next = newPile;
    }

    public T peek(){
        if(next==null) return null;
        return next.data;
    }

    public T pop(){
        if(next==null) return null;
        T toBeReturned=next.data;
        this.next=next.next;
        return toBeReturned;
    }

    public int countRecursive(){
        if(next==null) return 0;
        else return 1+next.countRecursive();
    }

    public int countIteratif(){
        Pile<T> tempNext=next;
        int count=0;
        while(tempNext != null){
            tempNext=tempNext.next;
            count++;
        }
        return count;
    }


}
