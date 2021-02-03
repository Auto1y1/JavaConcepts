public class refApiTest {
    private int intNumberOfRows;
    private int intStartingNumber ;
    public refApiTest(){}

    public refApiTest(int intNumber){
        this.intNumberOfRows = intNumber;
    }

    public void runPyramidNumber(){
        intStartingNumber = 0;
        refApiTest objClass = new refApiTest();
        System.out.println(" Number of Rows : " + intNumberOfRows);
        for (int i = intNumberOfRows; i >=1 ; i--) {

            // Print spaces = rowcount
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            //Printing 'intStartingNumber' value 'intStartingNumber' times at the end of each row
            for (int k = 1; k <= intStartingNumber; k++) {
                System.out.print("* "); // For Pyramid of *
            }
            intStartingNumber ++;
            System.out.println();
        }
    }

}
