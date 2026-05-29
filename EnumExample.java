package JavaByCoderArmy;

public class EnumExample {
    public static void main(String[] args) {
        int status = PaymentStatus.SUCCESS;
//        String newStatus = PaymentStatus.SUCCESS;
        System.out.println(status);
    }
}
//Enum - predefined set of constants
enum paymentStatus {
    SUCCESS,
    FAILURE,
    PENDING;
}

class PaymentStatus{
    public static final int SUCCESS = 1;
//    public static final String SUCCESS = "Success";
    public static final int FAILED = 2;
    public static final int PENDING = 3;

}
class ROLE {
     public static final int USER = 1;
     public static final int ADMIN = 2;
     public static final int MANAGER = 3;

}