
/*
 *
 *
 *
 * @Ricky
 * @27-03-2021
 */

    public enum PaymentType{
        BankPayment("Bank Payment"), 
    EwalletPayment("E-wallet Payment");
    
    private String paymenttype;
    
    PaymentType(String paymenttype){
        this.paymenttype = paymenttype;   
    }

    public String toString() {
        return paymenttype;
    }
}

