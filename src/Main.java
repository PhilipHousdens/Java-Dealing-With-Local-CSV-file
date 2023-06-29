import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String filePath = "QS World University Rankings 2017.csv";
        File outFile = new File("QS_World University Ranking 2017_out.csv");
        File file = new File(filePath);
        Vector<UniData> v = new Vector<UniData>();

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            // Skip the header line
            String line = bf.readLine();

            // Read data from the file
            while ((line = bf.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",");

                String year = st.nextToken();
                String rankDisplay = st.nextToken();
                String uni = st.nextToken();
                String score = st.nextToken();
                String link = st.nextToken();
                String country = st.nextToken();
                String city = st.nextToken();
                String region = st.nextToken();
                String logo = st.nextToken();

                UniData myUni = new UniData(year, rankDisplay, uni, score, link, country, city, region, logo);
                v.add(myUni);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add the new UniData object for "Chiang Mai University"
        v.add(new UniData("2023", "571", "Chiang Mai University", "N/A" , "https://www.topuniversities.com/universities/chiang-mai-university", "Thailand", "Chiang Mai", "Asia", "https://www.topuniversities.com/sites/default/files/profiles/logos/chiang-mai-university_118_large.jpg"));

        try (PrintWriter writer = new PrintWriter(new FileWriter(outFile))) {
            // Write the UniData objects to the output file
            for (UniData myData : v) {
                writer.println(myData.toString());
            }
            System.out.println("Output file created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print the UniData objects
        for (UniData uniData : v) {
            System.out.println(uniData.toString());
        }
    }
}
