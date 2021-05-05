import java.util.*;
import java.io.*;

public class IO_class {
        // Define empty Constructor
        public IO_class(){}

        // this Function is to return new Object of the Class JobDetails
        public Job_Details createOneJob(String[] jobData)
        {
            String title = jobData[0];
            String company = jobData[1];
            String location =  jobData[2];
            String type = jobData[3];
            String level = jobData[4];
            String yearsExp =  jobData[5];
            String country = jobData[6];
            String skills =  jobData[7];

            // Create and return Job of this jobData
            return new Job_Details(title, company, location,type,level,yearsExp,country,skills);
        }

        // this Function is to get All Jobs Calling the above Function which create each One Job
        public List<Job_Details> readCSVFile(String fileName)
        {
            List<Job_Details> allJobs = new ArrayList<>();

            // create an instance of BufferedReader
            try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
            {
                // read the first line from the text file which will be head column
                // read first line

                String line ="";
                if (line != null)
                {
                    line = br.readLine();
                }

                line = br.readLine();
                while (line != null)
                {
                    String [] attributes  = line.split(",");
                    Job_Details eachOneJob = createOneJob(attributes);
                    allJobs.add(eachOneJob);
                    line = br.readLine();
                }
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }

            return allJobs;
        }


}
