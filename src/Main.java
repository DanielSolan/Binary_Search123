public class Main {

    public static void main(String[] args) {
	    // write your code here
        int[] data = {13, 13, 18, 19, 23, 38, 57, 70, 79, 88, 89, 94, 102, 108, 122, 125, 127, 177, 180, 201, 210, 221, 226, 226, 234, 237, 247, 293, 295, 297, 303, 317, 320, 339, 343, 373, 375, 378, 378, 380, 403, 405, 407, 408, 412, 440, 466, 479, 485, 486, 493, 504, 509, 525, 537, 564, 565, 570, 578, 581, 584, 589, 605, 611, 617, 621, 650, 665, 669, 692, 696, 714, 742, 756, 756, 763, 766, 776, 780, 789, 817, 857, 881, 882, 883, 885, 897, 898, 906, 909, 911, 916, 929, 929, 939, 941, 958, 985, 988, 994};
        int start = 0;
        int end = data.length-1;
        recursiveBinary(data, 127, start, end);
    }

    public static int recursiveBinary(int[] data, int num, int start, int end){
        int mid = start + ((start+end)/2);
        if(data[mid]<num){
            return recursiveBinary(data, num, start, mid);
        } else if(data[mid]>num){
            return recursiveBinary(data, num, mid, end);
        } else if(data[mid]==num){
            return mid;
        } else {
            return -1;
        }
    }

    public static int iterativeBinary(){
        return -1;
    }
}
