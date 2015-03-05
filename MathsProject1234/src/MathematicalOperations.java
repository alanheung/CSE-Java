import java.util.Scanner;

public class MathematicalOperations {

	private static final double PI = 3.141592654;
	private static final double EULER = 2.718281828;
	
	public static void main(String[] args) {
		
	}
	
	//basic operations

	public static double calcSum(double mat1, double mat2) {
		double sum = mat1 + mat2;
		return sum;
	}
	
	public static double calcDifference(double mat1, double mat2) {
		double difference = mat1 - mat2;
		return difference;
	}
	
	public static double calcProduct(double mat1, double mat2) {
		double product = mat1 * mat2;
		return product;
	}
	
	public static double calcCoefficient(double mat1, double mat2) {
		double coefficient = mat1 / mat2;
		return coefficient;
	}
	
	//trigonometric operations
	
	public static double calcSine(double opposite, double hypotenuse, String format) {
		double sine = opposite / hypotenuse;
		return sine;
	}
	
	public static double calcCosine(double adjacent, double hypotenuse, String format) {
		double cosine = adjacent / hypotenuse;
		return cosine;
	}
	
	public static double calcTangent(double opposite, double adjacent, String format) {
		double tangent = opposite / adjacent;
		return tangent;
	}
	
	//exponential operations
	
	public static double calcPower(double base, double exponent) {
		double power = Math.pow(base, exponent);
		return power;
	}
	
	public static double calcLog(double base, int exponent) {
		double logarithm = Math.log(exponent) / Math.log(base);
		return logarithm;
	}
	
	public static double calcNaturalLog(double exponent) {
		double naturalLogarithm = Math.log(exponent);
		return naturalLogarithm;
	}
	
	//matrix operations
	
	public static void matrixMult() {
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter no. of rows in matrix 1:");
	    int mat1rows = s.nextInt();
	    System.out.print("Enter no. of columns in matrix 1 / rows matrix 2:");
	    int mat1cols = s.nextInt();
	    System.out.print("Enter number of columns in matrix 2:");
	    int mat2cols = s.nextInt();
	    int[][] mat1 = new int[mat1rows][mat1cols];
	    int[][] mat2 = new int[mat1cols][mat2cols];
	    System.out.println("Enter matrix 1 elements in the following order, line seperated:");
	    int x = 0;
	    
	    for (int i = 0 ; i < mat1.length ; i++) {
	    	for (int j = 0 ; j < mat1[0].length ; j++) {
	    		x++;
	            System.out.print("[" + x + "]\t");
	        }
	        System.out.println();
	    }
	    x = 0;
	       
	    for (int i = 0 ; i < mat1.length ; i++) {
	        for (int j = 0 ; j < mat1[0].length ; j++) {
	        	mat1[i][j] = s.nextInt();
	        }
	    }
	    System.out.println("Enter matrix 2 elements in the following order, line seperated:");
	       
	    for (int i = 0 ; i < mat2.length ; i++) {
	        for (int j = 0 ; j < mat2[0].length ; j++) {
	        	x++;
	            System.out.print("[" + x + "]\t");
	        }
	        System.out.println();
	    }
	       
	    for (int i = 0 ; i < mat2.length ; i++) {
	        for (int j = 0 ; j < mat2[0].length ; j++) {
	        	mat2[i][j] = s.nextInt();
	        }
	    }
	    mat1rows = mat1.length;
	    mat1cols = mat1[0].length;
	    mat2cols = mat2[0].length;
	    int[][] mat3 = new int[mat1rows][mat2cols];
	    for (int i = 0 ; i < mat1rows ; i++) {
	        for (int j = 0 ; j < mat2cols ; j++) {
	            for (int k = 0 ; k < mat1cols ; k++) {
	                mat3[i][j] = mat3[i][j] + mat1[i][k] * mat2[k][j];
	            }
	        }
	    }
	    System.out.println("Product matrix is:");
	    for (int i = 0 ; i < mat3.length ; i++) {
	        for (int j = 0 ; j < mat3[0].length ; j++) {
	            System.out.print("[" + mat3[i][j] + "]\t");
	        }
	        System.out.println();
	    }
	}
	
	public static void matrixAdd() {
		int x, y, i, j;
	    Scanner s = new Scanner(System.in); 
	    System.out.println("Enter the no. of rows / columns of matrices, line seperated:");
	    x = s.nextInt();
	    y = s.nextInt();	 
	    int mat1[][] = new int[x][y];
	    int mat2[][] = new int[x][y];
	    int mat3[][] = new int[x][y];	 
	    System.out.println("Enter matrix 1 elements in the following order, line seperated:");
	    
	    int a = 0;
	    for (  i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	    		a ++;
	    		System.out.print("[" + a + "]\t");
	    	}
	    	System.out.println();
	    }
	    a = 0;
	    
	    for (  i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	    		mat1[i][j] = s.nextInt();
	    	}
	    }
	    
	    System.out.println("Enter matrix 2 elements in the following order, line seperated:");
	    
	    for (  i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	    		a ++;
	    		System.out.print("[" + a + "]\t");
	    	}
	    	System.out.println();
	    }
	    
	    for ( i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	        	mat2[i][j] = s.nextInt();
	    	}
	    }
	 
	    for ( i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j++ ) {
	        	mat3[i][j] = mat1[i][j] + mat2[i][j];
	    	}
	    }
	 
	    System.out.println("Sum matrix is:");
	 
	    for ( i = 0 ; i < x ; i ++ )
	    {
	    	for ( j = 0 ; j < y ; j ++ ) {
	        	System.out.print("[" + mat3[i][j] + "]\t");
	        }
	        System.out.println();
	    }
	}
	
	public static void matrixSubtract() {
		int x, y, i, j;
	    Scanner s = new Scanner(System.in); 
	    System.out.println("Enter the no. of rows / columns of matrices, line seperated:");
	    x = s.nextInt();
	    y = s.nextInt();	 
	    int mat1[][] = new int[x][y];
	    int mat2[][] = new int[x][y];
	    int mat3[][] = new int[x][y];	 
	    System.out.println("Enter matrix 1 elements in the following order, line seperated:");
	    
	    int a = 0;
	    for (  i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	    		a ++;
	    		System.out.print("[" + a + "]\t");
	    	}
	    	System.out.println();
	    }
	    a = 0;
	    
	    for (  i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	    		mat1[i][j] = s.nextInt();
	    	}
	    }
	    
	    System.out.println("Enter matrix 2 elements in the following order, line seperated:");
	    
	    for (  i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	    		a ++;
	    		System.out.print("[" + a + "]\t");
	    	}
	    	System.out.println();
	    }
	    
	    for ( i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	        	mat2[i][j] = s.nextInt();
	    	}
	    }
	 
	    for ( i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j++ ) {
	        	mat3[i][j] = mat1[i][j] - mat2[i][j];
	    	}
	    }
	 
	    System.out.println("Subtracted matrix is:");
	 
	    for ( i = 0 ; i < x ; i ++ )
	    {
	    	for ( j = 0 ; j < y ; j ++ ) {
	        	System.out.print("[" + mat3[i][j] + "]\t");
	        }
	        System.out.println();
	    }
	}
	
	public static void matrixTransposition() {
		int x, y, i, j;
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter the no. of rows / columns of matrices, line seperated:");
	    x = s.nextInt();
	    y = s.nextInt();
	    int matrix[][] = new int[x][y];
	    System.out.println("Enter matrix elements in the following order, line seperated:");
	    
	    int a = 0;
	    for ( i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
		    	a++;
		        System.out.print("[" + a + "]\t");
		    }
	    	System.out.println();
	    }
	       
	    for ( i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	        	matrix[i][j] = s.nextInt();
	    	}
	    }
	    
	    int transpose[][] = new int[x][y];
	 
	    for ( i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	        	transpose[j][i] = matrix[i][j];
	    	}
	    }
	 
	    System.out.println("Transpose matrix is:");
	 
	    for ( i = 0 ; i < y ; i ++ ) {
	    	for ( j = 0 ; j < x ; j ++ ) {
	        	System.out.print("[" + transpose[i][j] + "]\t");
	    	}
	        System.out.println();
	    }
	}
	
	public static void matrixMultScalar() {
		int x, y, i, j;
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter the no. of rows / columns of matrices, line seperated:");
	    x = s.nextInt();
	    y = s.nextInt();
	    int matrix[][] = new int[x][y];
	    System.out.println("Enter scale:");
	    int scale = s.nextInt();
	    System.out.println("Enter matrix elements in the following order, line seperated:");
	    
	    int a = 0;
	    for ( i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
		    	a++;
		        System.out.print("[" + a + "]\t");
		    }
	    	System.out.println();
	    }
	       
	    for ( i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	        	matrix[i][j] = s.nextInt();
	    	}
	    }
	    
	    for ( i = 0 ; i < x ; i ++ ) {
	    	for ( j = 0 ; j < y ; j ++ ) {
	        	matrix[i][j] = matrix[i][j] * scale;
	        	System.out.print("[" + matrix[i][j] + "]\t");
	    	}
	    	System.out.println();
	    }
	}
}