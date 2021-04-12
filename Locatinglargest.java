//Kerstyne Moran & Isaac Atif
public class Locatinglargest {

	public static void main(String[] args){
	
		int[] slot = new int[10];
		int min = 1;
		int max = 100;
		slot[0]= (int)(Math.random() * max) + min;
		slot[1]= (int)(Math.random() * max) + min;
		slot[2]= (int)(Math.random() * max) + min;
		slot[3]= (int)(Math.random() * max) + min;
		slot[4]= (int)(Math.random() * max) + min;
		slot[5]= (int)(Math.random() * max) + min;
		slot[6]= (int)(Math.random() * max) + min;
		slot[7]= (int)(Math.random() * max) + min;
		slot[8]= (int)(Math.random() * max) + min;
		slot[9]= (int)(Math.random() * max) + min;
		
		System.out.println("Array: "+ slot[0] + " "+ slot[1] + " "+ slot[2] +" " + slot [3] + " "+ slot[4] +" " + slot[5] + " "+ slot [6] + " " +slot[7] + " "+ slot[8] +" "+ slot[9]);
		int max2 = 0;
		int y=0;
		for (int x= 0;x<10; x++ )
		{
			if (slot[x] > max2)
			{
				max2=slot[x];
				y=x;
			}
			
			
		}	
		System.out.println(max2);
		System.out.println(y);
	}	
}