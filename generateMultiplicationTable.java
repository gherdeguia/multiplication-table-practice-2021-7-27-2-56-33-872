public class generateMultiplicationTable {

    public static void main(String[] args) {

        generateMultiplicationTable tb1 = new generateMultiplicationTable();
        int startNum, endNum;

        startNum = 2;
        endNum = 4;

        //validations
        if(tb1.isValid(startNum,endNum)) {
            tb1.generateMultiplicationLines(startNum, endNum);
        }else{
            System.out.println("null");
        }
    }

    public void generateMultiplicationLines(int startNum, int endNum){
        String outputLine = new String();
        for(int x = startNum; x <= endNum; x++){
            for(int y = startNum; y <= x; y++){
                System.out.print(generateMultiplicationExpression(x, y));
            }
            System.out.println();
        }
    }

    private String generateMultiplicationExpression(int startNum, int endNum) {
        return " "+startNum+" * "+endNum+" = "+(startNum*endNum)+"      ";
    }

    public boolean isValid(int startNum, int endNum){

        if(isNumberInRange(startNum,endNum)){
            if(isEndBiggerThanStart(startNum,endNum)){
                return true;
            }
        }
        return false;
    }

    private boolean isEndBiggerThanStart(int startNum, int endNum) {
        return startNum <= endNum;
    }

    private boolean isNumberInRange(int startNum, int endNum) {
        return (startNum > 0 && endNum > 0) && (startNum > 0 && endNum <= 1000);
    }



}
