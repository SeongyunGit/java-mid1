package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {

        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A",address);
        MemberV1 memberB = new MemberV1("회원B",address);

        System.out.println(memberA);
        System.out.println(memberB);
        Address address1 = memberB.getAddress();
        address1.setValue("부산");
        System.out.println(memberA);
        System.out.println(memberB);

    }
}
