package insertsort;

public class InsertSortTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int maxSize = 100;
	ArrayIns arr = new ArrayIns(maxSize);
	
	arr.insert(23);
	arr.insert(12);
	arr.insert(33);
	arr.insert(33);
	arr.insert(45);
	arr.insert(0);
	arr.insert(6);
	arr.insert(78);
	arr.insert(5);
	
	arr.show();
	
	arr.insertSort();
	System.out.println("���������");
	
	arr.show();
    }

}
