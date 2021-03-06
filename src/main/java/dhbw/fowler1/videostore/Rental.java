package dhbw.fowler1.videostore;

public class Rental {
    private Movie _movie;
    private int _daysRented;

   double getCharge(){
       return _movie.getCharge(_daysRented);
   }

   int getFrequentRenterPoints(){
       return _movie.getFrequentRenterPoints(_daysRented);
   }
    public Rental(Movie movie, int daysRented) {

        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }



}
