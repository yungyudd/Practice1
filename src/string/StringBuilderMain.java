package string;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "java");
        System.out.println("insert = "+sb);

        sb.delete(4,8);
        System.out.println("delete = "+sb);

        sb.reverse();
        System.out.println("reverse = "+sb);

        String string = sb.toString();
        System.out.println("string = "+string);
    }
}
