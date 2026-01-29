package Collection;
import java.util.*;

public class AllArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<Integer>item=new ArrayList<>();
        item.add(14);
  		item.add(13);
  		item.add(12);
  		System.out.println("Lists:" + item);
  		System.out.println("Lists:" + item.get(0));
  		
  		System.out.println("Lists:" + item.remove(2));
  	    item.set(1, 20);
  	    System.out.println("Lists:" + item);
  		System.out.println("Lists:" + item.size());
  		item.clear();
  		System.out.println("Lists:" + item);
  		
	}

}
