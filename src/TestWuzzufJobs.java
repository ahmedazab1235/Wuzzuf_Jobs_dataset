import java.util.List;

public class TestWuzzufJobs {

    public void test(){

        IO_class describe_dataset = new IO_class();

        String  filename = "Wuzzuf_Jobs.csv";

        List<Job_Details> allJobsReturned = describe_dataset.readCSVFile(filename);

        for(Job_Details job :allJobsReturned)
        {
            System.out.println(job);
        }
        System.out.println("-------------------------------------------------------");

        JobDataService jop = new JobDataService();

        jop.FilterJobsByTitle(filename);

        System.out.println("-------------------------------------------------------");

        jop.FilterJobsBycountry(filename);

        System.out.println("-------------------------------------------------------");

        jop.FilterJobsByjoblevel(filename);

        System.out.println("-------------------------------------------------------");

        sort_fuction sorted = new sort_fuction();

        sorted.FilterJobsByYearsExp(filename);

        System.out.println("-------------------------------------------------------");

        System.out.println("Creaated by Eng Ahmed Essam Azab");


    }
}
