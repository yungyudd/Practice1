package set;

public class Member1 {
    private String id;

    public Member1(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Member1{"+"id='" +id+ '\''+'}';
    }
}
