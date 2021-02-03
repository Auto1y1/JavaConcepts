public class pyramidPattern2 {
    public static void main(String[] args) {
        // write your code here
        int intNumberOfRows = 9;
        int intRowStart = 1 ;

        // Looping for number of rows
        for (int i = intNumberOfRows; i >= 0 ; i--) {

            // Print Spaces = i*2
            for (int j = 1; j <i*2 ; j++) {
                System.out.print(" ");
            }

            // Printing j values = Starting from 1 to Row count
            for (int j = 1; j <= intRowStart ; j++) {
                System.out.print(j+" ");
            }

            // Printing j values = Starting from Row count-1 to 1
            for (int j = intRowStart - 1; j >= 1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
            intRowStart ++;

        }

    }
}
