//The population of New York City in 2010 was 8,175,133
//people. Assuming that the population doubled every 40 years,
//create a Java program to calculate in which year the
//population of NYC was about 10,000 people.
public class Population {

    public static void main(String[] args) {
        int year, population;

        year = 2010;
        population = 8175133;

        while (population > 10000) {
            year = year - 40;
            population = population / 2;
            System.out.println("Year: " + year + "; Population: " + population);
        }

    }

}
