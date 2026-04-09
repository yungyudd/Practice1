package string;

public class StringInfoMain {
    public static void main(String[] args) {
        String str= new String("abck, hello java");
        System.out.println("문자열의 길이: "+str.length());
        System.out.println("문자열이 비어 있는지: "+str.isEmpty());
        System.out.println("문자열이 비어 있거나 공백인지1: "+str.isBlank());
        System.out.println("문자열이 비어 있거나 공백인지2: "+"".isBlank());

        char c = str.charAt(3);
        System.out.println("3 index char = "+c);

        System.out.println("java의 첫 번째 인덱스"+str.indexOf("java"));
    }
}
