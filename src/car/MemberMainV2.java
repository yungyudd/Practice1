package car;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("seoul");

        MemberV2 ma = new MemberV2("a", address);
        MemberV2 mb = new MemberV2("b", address);

        System.out.println("ma= "+ma);
        System.out.println("mb= "+mb);

        mb.setAddress(new ImmutableAddress("busan"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + ma);
        System.out.println("memberB = " + mb);

    }
}
