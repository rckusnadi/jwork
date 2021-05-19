package ricky.jwork;

/*
 *
 *
 *
 * @ricky
 * @25-03-2021
 */
    public enum jobCategory{
        WebDeveloper{
        public String toString(){
            return "WebDeveloper";}},
        FrontEnd{
        public String toString(){
            return "FrontEnd";}},
        BackEnd{
        public String toString(){
            return "BackEnd";}},
        UI{
        public String toString(){
            return "UI";}},
        UX{
        public String toString(){
            return "UX";}},
        Devops{
        public String toString(){
            return "Devops";}},
        DataScientist{
        public String toString(){
            return "DataScientist";}},
        DataAnalyst{
        public String toString(){
            return "DataAnalyst";}};
    public static void main(String[] args){
    System.out.println(jobCategory.WebDeveloper);
    System.out.println(jobCategory.FrontEnd);
    System.out.println(jobCategory.BackEnd);
    System.out.println(jobCategory.UI);
    System.out.println(jobCategory.UX);
    System.out.println(jobCategory.Devops);
    System.out.println(jobCategory.DataScientist);
    System.out.println(jobCategory.DataAnalyst);
}
    }

    

