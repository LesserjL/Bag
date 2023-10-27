
/**
 * Write a description of class LinkedBag here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedBag<T> extends LinkedCollection<T> implements BagInterface<T>
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class LinkedBag
     */
    public LinkedBag()
    {
        
    }

    public T grab(){
        T element2;
        int randomLocation = (int)(Math.random()*numElements);
        int count = 0;
        LLNode<T> currNode = head;
        while(count < randomLocation){
            currNode = currNode.getLink();
            count++;
        }
        numElements--;
        System.out.println(currNode.getInfo());
        return currNode.getInfo();
    }
    public int count(T object){
        int count = 0;
        LLNode<T> currNode = head;
        while(currNode.getLink() != null){
            if(currNode.getInfo().equals(object)){
                count++;
            }
            currNode = currNode.getLink();
        }
        return count;
    }
    public int removeAll(T object){
        int count = 0;
        while(remove(object) != false){
            count++;
        }
        return count;
    }
    public void clear(){
         LLNode<T> currNode = head;
    while (currNode != null) {
        LLNode<T> nextNode = currNode.getLink();
        currNode.setInfo(null);
        currNode.setLink(null);
        currNode = nextNode;
    }
    numElements = 0;
    }
    public String toString(){
        String x = "";
        LLNode<T> currNode = head;
        while(currNode.getLink() != null){
            System.out.println(currNode.getInfo());
            currNode = currNode.getLink();
        }
        return x;
    }
}
