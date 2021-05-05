# Wuzzuf_Jobs_dataset


** WUZZUF is the #1 Career Destination in Egypt serving more than 500,000 job seekers each month and more than 15,000 of Egypt's top companies actively posting jobs and searching for talent.

------------ Dataset URL: https://www.kaggle.com/omarhanyy/wuzzuf-jobs?select=Wuzzuf_Jobs.csv

-Using  Wuzzuf_Jobs
dataset, This dataset includes 4380 Jobs with attributes such as Title, Company, Location, Type, Level,YearsExp, etc.

https://www.kaggle.com/omarhanyy/wuzzuf-jobs


# class JobDetails that represent the WUZZUF dataset.

 
# class IO that will perform reading dataset from csv file through the following method:

# List<JobDetails> ReadCSVFile(String FileName) which return a list of JobDetails and take a string of file name as an input.

# class JobsDataService that will perform some  filtering on the Job data through the following methods:

# FilterJobsByTitle(List <JobDetails> jobs) which output the list of Job Titles and Job popularity(i.e. frequency of job titles) in the console.

# FilterJobsByCountry(List <JobDetails> jobs) which output the list of Country and Job demand (i.e. frequency of jobs related to country) in the console.

# FilterJobsByLevel(List <JobDetails> jobs) which output the list of Level and popularity(i.e. frequency of job Level) in the console.

# LinkedHashMap<String, Long> sortMap(Map<String, Long> map) Returns the ascending sorted map by its value of the Map given as an argument.

# FilterJobsByYearsExp(List <JobDetails> jobs) which output the a sorted list of YearsExp and popularity(i.e. frequency of job YearsExp) in the console using sortMap function.

# class named TestWuzzufJobs with a test() method that will contain the following use cases :

------------- Call to the ReadCSVFile() by passing file location as string, and return the Jobs list.

------------- Call to the FilterJobsByCountry() on the Jobs list that resulted from the ReadCSVFile() call, with output country popularity in the console.

------------- Call to the FilterJobsByLevel() on the Jobs list that resulted from the ReadCSVFile() call, with output Level popularity in the console.

------------- Call FilterJobsByTitle() on the Jobs list that resulted from the ReadCSVFile() call, with output Title popularity in the console.

------------- Call to FilterJobsByYearsExp() on the Jobs list that resulted from the ReadCSVFile() call, with output Yars of Exprience popularity in the console.

 
main run the test() method and operate these cases
