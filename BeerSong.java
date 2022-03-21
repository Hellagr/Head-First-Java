public class BeerSong {
	public static void main(String[] args){
		int beerNum = 99;
		String word = "6yTblJIok (6yTblJIKu)";

		while (beerNum > 0){
			if (beerNum == 1) {
				word = "6yTblJIKa";
			}
			System.out.println(beerNum + " " + word + " nuBa Ha CTeHe");
			System.out.println(beerNum + " " + word + " nuBa");
			System.out.println("Bo3bMu ogHy.");
			System.out.println("nycTu no kpyry");

			beerNum = beerNum - 1;
			if(beerNum > 0){
			}
			else{
				System.out.println("HeT 6yTblJIok nuBa");
			}
		}
	}
}