package ricky.jwork;

public class Location
{
    /*
     *
     * @author : Ricky
     * @version : 18/03/2021
     */
    private String province;
    private String city;
    private String description;
    /*
     *
     * Constructor for objects of class Location
     * @param province merupakan provinsi dari location
     * @param city merupakan kota dari location
     * @param description merupakan deskripsi dari location
     *
     */

     public Location (String province, String city, String description) {
        this.province = province;
        this.city = city;
        this.description = description;
    }

    public String getProvince()
    {
        return this.province;
    }

    public String getCity()
    {
        return this.city;
    }

    public String getDescription()
    {
        return this.description;
    }

    /*
     *
     * Getter province
     * @return province dari data terkait
     * Getter city
     * @return city dari data terkait
     * Getter description
     * @return description dari data terkait
     */

    public void setProvince(String province)
    {
        this.province = province;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    /*
     *
     * Setter province
     * @return nilai baru province dari data terkait
     * Setter city
     * @return nilai baru city dari data terkait
     * Setter description
     * @return nilai baru description dari data terkait
     */

    public String toString(){
        return String.format("Province = %s \nCity = %s \nDescription = %s", province,city,description);
    }

     

}