interface MyLogic{
	boolean test(int num);
}
class ArrayOpe{
	static void showArray(int ar[],MyLogic ref){
		for(int a : ar){
			if(ref.test(a)){
				System.out.print(" "+a);
			}
		}
		System.out.println("");
	}
}
class Demo9{
	public static void main(String args[]){
	int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};	
	ArrayOpe.showArray(a,(int n) -> { return true; });
	ArrayOpe.showArray(a,(n) -> { return n%2==0; });
	ArrayOpe.showArray(a,(n) -> n%2!=0);
	ArrayOpe.showArray(a,n -> n%2!=0);
	}
}