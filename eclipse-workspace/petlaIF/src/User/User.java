package User;

public class User {
		private String imie;
		private String nazwisko;
		
		public User(String imie, String nazwisko)
		{
			this.setImie(imie);
			this.setNazwisko(nazwisko);
		}
		public String getImie() {
			return imie;
		}
		public String getNazwisko() {
			return nazwisko;
		}
		public void setImie(String imie) {
			this.imie = imie;
		}
		
		public void setNazwisko(String nazwisko) {
			this.nazwisko = nazwisko;
		}
}
