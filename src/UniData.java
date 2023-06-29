import javax.sound.sampled.ReverbType;

public class UniData {
    private String uni, link, country, city, region, logo, year, rankDisplay, score;

    public UniData(String year, String rankDisplay, String uni, String score, String link, String country, String city, String region, String logo) {
        this.year = year;
        this.rankDisplay = rankDisplay;
        this.uni = uni;
        this.score = score;
        this.link = link;
        this.country = country;
        this.city = city;
        this.region = region;
        this.logo = logo;
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



}
