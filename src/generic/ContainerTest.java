package generic;

public class ContainerTest {
    public static void main(String[] args) {
        Container<String> container = new Container<>();
        System.out.println("빈값 확인: "+container);

        container.set("data1");
        System.out.println("저장 데이터: "+container.get());
        System.out.println("빈값 확인2: "+container.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.set(123);
        System.out.println("저장 데이터 integer: "+integerContainer.get());
    }
}
