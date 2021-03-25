public class DatabaseJob
{
    /*
    *
    * @author : Ricky
    * @version : 18/03/2021
    */
    public class DatabaseJob
    {
        /*
         *
         Deklarasi Variable
         */

        private String[] listJob;

        /*
         *
         * constructor dari databsejob
         */
        public DatabaseJob()
        {

        }

        /*
         *
         * membuat method addjob dari databasejob
         * @return true
         */
        public boolean addJob(Job job){
            return true;
        }

        /*
         *
         * membuat method removejob dari databasejob
         * @return false
         */
        public boolean removeJob(Job job){
            return false;
        }

        /*
         *
         * getter job dari databasejob
         * @return job
         */
        public Job getJob(){
            return job;
        }

        /*
         *
         * getter getlisjob dari databasejob
         * @return listjob
         */
        public String[] getListJob(){
            return listJob;
        }
    }
   
}