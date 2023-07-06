import javax.sound.sampled.ReverbType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniData implements Comparable<UniData>{ //Implementing Comparable, so that if can compare the list
    private String uni, link, country, city, region, logo, year, rankDisplay, score;

    public UniData(String year, String rankDisplay, String uni, String score, String link, String country, String city, String region, String logo) {
        this.year = year;
        this.rankDisplay = rankDisplay;
        this.uni = uni.toLowerCase(); //Turn to lower case
        this.score = score;
        this.link = link;
        this.country = country;
        this.city = city;
        this.region = region;
        this.logo = logo;

        roundingScore(score);
        setZeroScore(score);
        CatRank(rankDisplay);


    }

    // Getter and Setter 
   public String getYear() {
       return year;
   }
   public void setYear(String year) {
       this.year = year;
   }
   public String getRankDisplay() {
       return rankDisplay;
   }
   public void setRankDisplay(String rankDisplay) {
       this.rankDisplay = rankDisplay;
   }
   public String getUni() {
       return uni;
   }
   public void setUni(String uni) {
       this.uni = uni;
   }
   public String getLink() {
       return link;
   }
   public void setLink(String link) {
       this.link = link;
   }
   public String getCountry() {
       return country;
   }
   public void setCountry(String country) {
       this.country = country;
   }
   public String getCity() {
       return city;
   }
   public void setCity(String city) {
       this.city = city;
   }
   public String getRegion() {
       return region;
   }
   public void setRegion(String region) {
       this.region = region;
   }
   public String getLogo() {
       return logo;
   }
   public void setLogo(String logo) {
       this.logo = logo;
   }
   public void setScore(String score) {
       this.score = score;
   }
   public String getScore() {
       return score;
   }

   public void  setZeroScore(String score) {
       if (score.equals("N/A")) {//If the score is "N/A". Change to 0
           setScore("0");
       }
   }
    // Rounding the score
   public void roundingScore(String score) { try {
       float scoreValue = Float.parseFloat(score); // Turn String value, to Float number.

       setScore(String.valueOf(Math.round((scoreValue)))); //Using Math.round((soreValue)) and wrap around with String.valueOf to make scoreValue back to String again.
   } catch (Exception e) {
       System.out.println("Invalid"); //Print "Invalid" if there's any error data in the list, and skip it.
   }

   }
   // No.1.4
   public void CatRank(String rankDisplay) {
       if (rankDisplay.contains("-") || rankDisplay.contains("+")) { //If rank contains "-" or "+" (eg. 404-410, 701+). Than set the Rank value to "N/A".
           setRankDisplay("N/A");
       }
   }

   //TOString

   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return getYear() + " " + getRankDisplay() + " " + getUni() + " " + getScore() + " " + getLink() + " " + getCountry() + " " + getCity()+ " " + getRegion() + " " + getLogo();
   }

   public String toCSVString() {
    return year + "," + rankDisplay + "," + uni + "," + score + "," + link + "," + country + "," + city + ","
            + region + "," + logo;
}


    @Override
    public int compareTo(UniData o) {
        return this.uni.compareToIgnoreCase(o.uni); //Comparing "o" which is UniData university name with the new file university name.
    }
}
