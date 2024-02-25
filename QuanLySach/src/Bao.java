public class Bao extends TaiLieu{
    private int releaseDate;

    public Bao(String title, String id, String publisher, int releaseNumber, int releaseDate2) {
		super();
		// TODO Auto-generated constructor stub
	}

    public Bao(String Title, String Id, String Publisher, int releaseNumber, int issueNumber, int releaseDate){
        super(Title, Id, Publisher, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
	public String toString() {
		return "Bao [releaseDate=" + releaseDate + ", toString()=" + super.toString() + "]";
	}
}
