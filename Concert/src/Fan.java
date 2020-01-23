public class Fan {
    private int yearsAsFan;
    private int albumsBought;
    private int concertsAttended;
    private boolean buzzcard;
    private Musician favoriteMusician;

    //constructor with five arguments
    public Fan(int y, int a, int concertsAttended, boolean buzzcard, Musician favoriteMusician) {
        this.yearsAsFan = y;
        this.albumsBought = a;
        this.concertsAttended = concertsAttended;
        this.buzzcard = buzzcard;
        this.favoriteMusician = favoriteMusician;
    }

    // public methods
    public boolean winGiveaway() {
        return true;
    }

    public String liveTweet(Concert concert) {
        String tweet = "";
        if (yearsAsFan > 5) {
            tweet += "Best band ever!\n";
        }
        if (concert.getTicketPrice() > 100) {
            tweet += "Totally worth my entire bank account!\n";
        }
        if (albumsBought >= 1) {
            tweet += "Even better in person!\n";
        }
        concertsAttended++;
        tweet += "I've been to " + concertsAttended;
        tweet += (concertsAttended > 1) ? " concerts!" : " concert!";

        return tweet;
    }

    public void lostBuzzcard() {
        if (yearsAsFan > 3) {
            buzzcard = false;
        } else {
            buzzcard = true;
        }
    }

    public void announceFavoriteMusician() {
        System.out.println("My favorite musician is " + favoriteMusician.getName() + "!");
    }

    //get methods
    public int getYearsAsFan() {
        return yearsAsFan;
    }

    public int getAlbumsBought() {
        return albumsBought;
    }

    public int getConcertsAttended() {
        return concertsAttended;
    }

    public boolean getBuzzcard() {
        return buzzcard;
    }

    public Musician getFavoriteMusician() {
        return favoriteMusician;
    }
}






