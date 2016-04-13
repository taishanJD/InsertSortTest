package insertsort;

public class ArrayIns {

    private long[] a; 
    private int nElems;
    public ArrayIns(int maxSize) {
	super();
	a= new long[maxSize];
	nElems = 0;
    }
    
    public void insert(long value) {
	a[nElems] = value;
	nElems++;
    }
    
    public void show() {
	for(int j= 0;j<nElems;j++) {
	    System.out.print(a[j]+" ");
	}
	System.out.println(" ");
    }

    public void insertSort() {

	int inner,outer;
	for(outer = 1;outer<nElems;outer++) {
	    long temp = a[outer];
	    inner = outer;
	    while(inner>0&&a[inner-1]>=temp) {
		a[inner]=a[inner-1];
		--inner;
	    }
	    a[inner]=temp;
	}
    }
}
