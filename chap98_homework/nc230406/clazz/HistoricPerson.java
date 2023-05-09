package chap98_homework.nc230406.clazz;

public class HistoricPerson {
    private String name;
    private String achievement;
    private String country;

    public HistoricPerson(String name,String achievement,String country ){
        this.name = name;
        this.achievement= achievement;
        this.country = country;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public HistoricPerson getPersonInfo(String achievement){
        if(achievement.equals(this.achievement)) {
            return new HistoricPerson(this.name, this.achievement, this.country);
        }else
            return new HistoricPerson("", "", "");
    }

    public HistoricPerson getSameCountryPerson(String country){
        if(country.equals(this.country)) {
            return new HistoricPerson(this.name, this.achievement, this.country);
        }else
            return new HistoricPerson("", "", "");
    }

    @Override
    public String toString() {
        return "HistoricPerson{" +
                "name='" + name + '\'' +
                ", achievement='" + achievement + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
