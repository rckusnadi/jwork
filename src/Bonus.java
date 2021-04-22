
/*
 *
 * Merupakan class untuk Bonus
 *
 * @author Ricky
 * @version 01-04-2021
 */
public class Bonus
{
    
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;

    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active)
    {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active; 
    }

    /*
     * An example of a method - replace this comment with your own
     *
     * @param   a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {

        return id;
    }

    public String getReferralCode()
    {

        return referralCode;
    }

    public int getExtraFee()
    {

        return extraFee;
    }

    public int getMinTotalFee()
    {

        return minTotalFee;
    }

    public boolean getActive()
    {

        return active;
    }

    public void setId(int id)
    {

        this.id = id;
    }

    public void setReferralCode(String referralCode)
    {

        this.active = active;
    }

    public void setExtraFee(int extraFee)
    {

        this.extraFee = extraFee;
    }

    public void setMinTotalFee(int minTotalFee)
    {

        this.minTotalFee = minTotalFee;
    }

    public void setActive(boolean active)
    {

        this.active = active;
    }
    public String toString(){
        return String.format("ID = %d \nReferral Code = %s \nExtra Fee = %d \nMin Total Fee = %s \nActive Status = %s", id, referralCode, extraFee, minTotalFee, active);
    }

    /*public void printData()
    {
        System.out.println(
                "===================== Invoice =====================" +
                        "\nID: " + id +
                        "\nReferreal Code: " + referralCode +
                        "\nExtra Fee: " + extraFee +
                        "\nMinimal Total Fee: " + minTotalFee +
                        "\nActive: " + active
        );
    }*/
    
}
