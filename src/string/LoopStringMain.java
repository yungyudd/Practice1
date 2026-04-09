package string;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();


        StringBuilder sb = new StringBuilder();
        for(int i=0; i< 10000; i++){
            sb.append("hello java");
        }
        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result"+ result);
        System.out.println("time"+ (endTime - startTime)+"ms");
    }
}
