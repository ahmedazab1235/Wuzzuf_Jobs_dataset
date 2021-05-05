import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.io.*;

class JobDataService
{

    public void FilterJobsByTitle(String CSVFile)
    {
        String[] array;
        List<String> addList = new ArrayList<>();
        try
        {
            File file = new File(CSVFile);
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : lines)
            {
                array = line.split(",");
                addList.add(array[0]);

            }

            int occurrences = 0;
            for (int i = 1; i < addList.size(); i++)
            {
                occurrences = Collections.frequency(addList, addList.get(i));

                System.out.println(addList.get(i) + " number of occurrence is :  " + occurrences);

                for (int j = 0; j < addList.size(); j++)
                {
                    if(addList.get(i).equals(addList.get(j)))
                    {
                        addList.remove(j);

                    }
                }
            }



        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }

    public void FilterJobsBycountry(String CSVFile)
    {
        String[] array;
        List<String> addList = new ArrayList<>();
        try
        {
            File file = new File(CSVFile);
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : lines)
            {
                array = line.split(",");
                addList.add(array[6]);


            }



            int occurrences = 0;
            for (int i = 1; i < addList.size(); i++)
            {

                occurrences = Collections.frequency(addList, addList.get(i));





                    for (int j = addList.size() - 1; j > i; j--)
                    {
                        if (j == i)
                        {
                            continue;
                        }
                        if (addList.get(i).equals(addList.get(j))) {
                            addList.remove(j);

                        }
                        if (addList.get(j-i).equals("3-5 Yrs of Exp")) {
                            addList.remove("3-5 Yrs of Exp");

                        }

                    }
                    if (addList.get(i).equals("Freelance / Project")) {
                        addList.remove("Freelance / Project");

                    }
                    if (addList.get(i).equals("Entry Level")) {
                        addList.remove("Entry Level");

                    }
                    if (addList.get(i).equals("3-5 Yrs of Exp")) {
                        addList.remove("3-5 Yrs of Exp");

                    }
                    if (addList.get(i).equals("5-10 Yrs of Exp")) {
                        addList.remove("5-10 Yrs of Exp");

                    }
                    if (addList.get(i).equals("15-20 Yrs of Exp")) {
                        addList.remove("15-20 Yrs of Exp");

                    }
                    if (addList.get(i).equals("2-5 Yrs of Exp")) {
                        addList.remove("2-5 Yrs of Exp");

                    }
                    if (addList.get(i).equals("5-6 Yrs of Exp")) {
                        addList.remove("5-6 Yrs of Exp");

                    }
                    if (addList.get(i).equals("3-7 Yrs of Exp")) {
                        addList.remove("3-7 Yrs of Exp");

                    }
                    if (addList.get(i).equals("3-6 Yrs of Exp")) {
                        addList.remove("3-6 Yrs of Exp");

                    }
                    if (addList.get(i).equals("10+ Yrs of Exp")) {
                        addList.remove("10+ Yrs of Exp");

                    }
                    if (addList.get(i).equals("4-6 Yrs of Exp")) {
                        addList.remove("4-6 Yrs of Exp");

                    }
                    if (addList.get(i).equals("null Yrs of Exp")) {
                        addList.remove("null Yrs of Exp");

                    }
                    if (addList.get(i).equals("2-4 Yrs of Exp")) {
                        addList.remove("2-4 Yrs of Exp");

                    }
                    if (addList.get(i).equals("0-3 Yrs of Exp")) {
                        addList.remove("0-3 Yrs of Exp");

                    }
                    if (addList.get(i).equals("7+ Yrs of Exp")) {
                        addList.remove("7+ Yrs of Exp");

                    }
                    if (addList.get(i).equals("1-3 Yrs of Exp")) {
                        addList.remove("1-3 Yrs of Exp");

                    }
                    if (addList.get(i).equals("2+ Yrs of Exp")) {
                        addList.remove("2+ Yrs of Exp");

                    }
                    if (addList.get(i).equals("7-20 Yrs of Exp")) {
                        addList.remove("7-20 Yrs of Exp");

                    }
                    if (addList.get(i).equals("3-5 Yrs of Exp")) {
                        addList.remove("3-5 Yrs of Exp");

                    }

                System.out.println(addList.get(i)+ "     " + occurrences);

            }



        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
    public void FilterJobsByjoblevel(String CSVFile)
    {
        String[] array;
        List<String> addList = new ArrayList<>();
        try
        {
            File file = new File(CSVFile);
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : lines)
            {
                array = line.split(",");
                addList.add(array[4]);

            }

            int occurrences = 0;
            for (int i = 1; i < addList.size(); i++)
            {
                occurrences = Collections.frequency(addList, addList.get(i));

                System.out.println(addList.get(i) + " number of occurrence is :  " + occurrences);

                for (int j = addList.size()-1; j > i; j--)
                {
                    if(addList.get(i).equals(addList.get(j)))
                    {
                        addList.remove(j);

                    }
                    if (addList.get(j-i).equals(" Nasr City")) {
                        addList.remove(" Nasr City");

                    }
                    if (addList.get(j-i).equals(" Cairo")) {
                        addList.remove(" Cairo");

                    }
                    if (addList.get(j-i).equals(" San Stefano")) {
                        addList.remove(" San Stefano");

                    }
                    if (addList.get(j-i).equals("...\"")) {
                        addList.remove("...\"");

                    }
                    if (addList.get(j-i).equals(" Giza")) {
                        addList.remove(" Giza");

                    }
                }

            }



        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
