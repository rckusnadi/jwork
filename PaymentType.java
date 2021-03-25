
/*
 *
 *
 *
 * @Ricky
 * @25-03-2021
 */

    public enum PaymentType{
        BankPayment{
            public String toString() {
            return "BankPayment";
            
        }},
        EwalletPayment{
            public String toString() {
            return "EwalletPayment";
            
        }};
    public static void main(String[] args){
    System.out.println(PaymentType.BankPayment);
    System.out.println(PaymentType.EwalletPayment);
    }
}

