package practice;

class justforMain {
	public static void main(String[] args) {
		int[][] array = {
		 		{95,86},
		 		{83,92,96},
		 		{78,83,93,87,88}
		};
		int m=0;
		int n=0;
		double sum=0;
		double average=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum+=array[i][j];	
		}
		}
		for(int i=0;i<array.length;i++)
		average=sum/(array[0].length+array[1].length+array[2].length);
		
		System.out.printf("전체 합은 %3.0f\n", sum);
		System.out.println("평균은 "+ average);
	}