import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class sort_fuction {

    // this Function is to sort the required
    public void sortMapFunction(Map<String,Integer> givenToSort)
    {
        Map<String,Integer> toBeSorted = givenToSort;

        Map<String, Integer> newMap =
                toBeSorted.entrySet().stream().collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue()));

        // Sorting HashMap according to Population
        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(newMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {


            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });


        for(Map.Entry<String,Integer> item:list)
        {
            System.out.println(item);
        }


    }



    public void FilterJobsByYearsExp(String CSVFile)
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
                addList.add(array[5]);

            }

            Map<String,Integer> test = new HashMap<>();
            int frequency = 0;
            for (int i = 1; i < addList.size(); i++)
            {
                frequency = Collections.frequency(addList, addList.get(i));
                test.put(addList.get(i),frequency);
                //System.out.println(addList.get(i) + " >==  " + frequency);


                for (int j = addList.size() - 1; j > i; j--)
                {
                    if (j == i)
                    {
                        continue;
                    }

                    // after getting country and frequency , remove it from list
                    if (addList.get(i).equals(addList.get(j)))
                    {
                        addList.remove(j);
                    }

                    if(addList.get(j-i).equals("Experienced"))
                    {
                        addList.remove("Experienced");
                    }
                    if(addList.get(j-i).equals("Freelance / Project"))
                    {
                        addList.remove("Freelance / Project");
                    }
                    if(addList.get(j-i).equals("Student"))
                    {
                        addList.remove("Student");
                    }
                    if(addList.get(j-i).equals("Manager"))
                    {
                        addList.remove("Manager");
                    }
                    if(addList.get(j-i).equals("Experienced"))
                    {
                        addList.remove("Experienced");
                    }
                    if(addList.get(j-i).equals("Internship"))
                    {
                        addList.remove("Internship");
                    }
                    if(addList.get(j-i).equals("Full Time"))
                    {
                        addList.remove("Full Time");
                    }
                    if(addList.get(j-i).equals("Senior Management"))
                    {
                        addList.remove("Senior Management");
                    }
                    if(addList.get(j-i).equals("Entry Level"))
                    {
                        addList.remove("Entry Level");
                    }
                    if(addList.get(j-i).equals("Triptab"))
                    {
                        addList.remove("Triptab");
                    }
                }

            }

            sortMapFunction(test);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }


}
