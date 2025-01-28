package week3.HomeAssignments;

public class FindIntersection {

public static void main(String[] args) 
{
	int a[]={3,2,11,4,6,7};
	int b[]={1,2,8,4,9,7};
	//int array1 = a.length;
	//System.out.println(array1);
	//int array2 = b.length;
	//System.out.println(array2);
	for (int i = 0 ; i < a.length; i++ ) {
		System.out.println(a[i]);
		for( int j=0; j< b.length; j++) {
			System.out.println(b[j]);
		
		if (a[i] == b[j]) {
			System.out.println("common element found" + a[i]);
			
		}
	}
}
}
}