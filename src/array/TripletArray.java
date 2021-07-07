package array;

public class TripletArray {

        int array [] = {3, 1, 4, 6, 5};
        int k = 2;

        public static void main (String[] args) throws java.lang.Exception{
            TripletArray object = new TripletArray();
            object.process();
        }

        public void process(){
            int totalSubSets = (int)Math.pow(2,array.length);

            for (int i = 0 ; i < totalSubSets ; i ++ ){
                int tempArray [] = getLHSandAssignInArray(i);
                int checkCountOf1 = 0 ;
                for (int j = 0 ; j < tempArray.length ; j++ ){
                    if(tempArray[j] == 1){
                        checkCountOf1 ++;
                    }
                }
                if(checkCountOf1 != 3 ){
                    continue;
                }

                int arrayOfTriplet [] = new int [3];

                int counter = 0 ;
                for (int j = 0 ; j < tempArray.length ; j++ ){
                    if(tempArray[j] == 1){
                        arrayOfTriplet[counter++] = array[j];
                    }
                }

                int a_square = arrayOfTriplet[0] * arrayOfTriplet[0];
                int b_square = arrayOfTriplet[1] * arrayOfTriplet[1];
                int c_square = arrayOfTriplet[2] * arrayOfTriplet[2];

                if((a_square == b_square + c_square) ||
                        (b_square == a_square + c_square) ||
                        (c_square == a_square + b_square) ){
                    System.out.println("triplet found : ");
                    System.out.println(a_square + " : " + b_square + " : " + c_square);
                }
            }
        }

        public int[] getLHSandAssignInArray(int value){
            int tempArray [] = new int[array.length];
            int count = 0 ;
            while(value > 0 ){
                int mod = value%2;
                tempArray[count++] = mod;
                value = value/2;
            }
            return tempArray;
        }

        int counter2 = 0;
        public void printArray(int inputArray[]) {
            for (int i = 0; i < inputArray.length; i++) {
                System.out.print(inputArray[i] + (i == inputArray.length - 1 ? "" : ", "));
            }
            System.out.print("   : counter2 : " + counter2++);
            System.out.println("");
        }
}
