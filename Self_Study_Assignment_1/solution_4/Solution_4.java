package solution_4;
public class Solution_4 {
    public static void main(String[] args) {
        int arr[][] = {{1,2}, {3,4}, {5,6}, {7,8}};
        System.out.println("The given array is: ");
        for(int row=0; row<arr.length; row++){
            for(int col =0; col<arr[0].length; col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The column wise sum of the array is: ");
        for(int col=0; col<arr[0].length; col++){
            int sum = 0;
            System.out.print("The sum of the " + (col+1) + " column: ");
            for(int row=0; row<arr.length; row++){
                sum+=arr[row][col];
            }
            System.out.println(sum);
        }

        System.out.println();
        System.out.println("The row wise sum of the array is: ");
        for(int row=0; row<arr.length; row++){
            int sum = 0;
            System.out.print("The sum of the " + (row+1) + " row: ");
            for(int col=0; col<arr[0].length; col++){
                sum+=arr[row][col];
            }
            System.out.println(sum);
        }
    }
}
