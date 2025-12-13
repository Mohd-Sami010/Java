public class VariableArgs {
    
    public static void main(){
        System.out.println(add(4,5,7,8));
    }
    public static int add(int... nums){ // Arguments will turn into Array
        int sum = 0;
        for (int n: nums){
            sum += n;
        }
        return sum;
    }
}
