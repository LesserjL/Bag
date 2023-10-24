
/**
 * Write a description of class UnsortedBag here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnsortedBag<T> extends ArrayCollection<T> implements BagInterface<T>
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class UnsortedBag
     */
    public UnsortedBag()
    {
        
    }
    public T grab(){
        T element2;
        element2 = elements[(int)(Math.random()*elements.length)];
        while(true){
        if(element2 != null){
            break;
        }
        else{
            element2 = elements[(int)(Math.random()*elements.length)];
        }
        }
        numElements--;
        System.out.println(element2);
        return element2;
    }
    public int count(T object){
        int count = 0;
        for(int i = 0; i < elements.length; i++){
            if(elements.equals(object)){
                count++;
            }
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
        elements = null;
    }
    public String toString(){
        String x = "";
        for(int i = 0; i < numElements; i++){
            if(elements[i] == null){
                continue;
            }
            else{
            x += elements[i] + " ";
        }
        }
        return x;
    }
    
}
