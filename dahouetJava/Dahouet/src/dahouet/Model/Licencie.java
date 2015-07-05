package dahouet.Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Licencie extends Personne {

	int numeroLicence;
	private static double pointsFFV;
	Date dateNaissance;
	public static int anneeLicence;

	// Creation des constructeur
	public Licencie(String nom, String mail, String prenom, int numeroLicence,
			double pointsFFV, Date dateNaissance, int anneeLicence) {
		super(nom, mail, prenom);
		this.numeroLicence = numeroLicence;
		this.setPointsFFV(pointsFFV);
		this.dateNaissance = dateNaissance;
		this.anneeLicence = anneeLicence;
	}

	// Creation des getter et setter
	public int getNumeroLicence() {
		return numeroLicence;
	}

	public void setNumeroLicence(int numeroLicence) {
		this.numeroLicence = numeroLicence;
	}

	
	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getAnneeLicence() {
		return anneeLicence;
	}

	public void setAnneeLicence(int anneeLicence) {
		this.anneeLicence = anneeLicence;
	}

	static final String dateNaiss = "^(19|20)\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$";
	static Pattern patternDate = Pattern.compile(dateNaiss);

	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	public static boolean isValidDate(String date) {
		Matcher matcher = patternDate.matcher(date);
		return matcher.find();
	}

	/*
	 * public static int ageLicencie(int annee, int mois, int jours) {
	 * 
	 * Calendar cal = new GregorianCalendar(annee, mois, jours); Calendar
	 * maintenant = new GregorianCalendar(); int age =
	 * maintenant.get(Calendar.YEAR) - cal.get(Calendar.YEAR); if
	 * ((cal.get(Calendar.MONTH) > maintenant.get(Calendar.MONTH)) ||
	 * (cal.get(Calendar.MONTH) == maintenant.get(Calendar.MONTH) && cal
	 * .get(Calendar.DAY_OF_MONTH) > maintenant .get(Calendar.DAY_OF_MONTH))) {
	 * age--; } System.out.println("Age: " + age + " ans"); return age; }
	 */

	public static int getYears(Date d) {
		Calendar curr = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.setTime(d);
		int yeardiff = curr.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
		curr.add(Calendar.YEAR, -yeardiff);
		if (birth.after(curr)) {
			yeardiff = yeardiff - 1;
		}
		return yeardiff;
	}

	public static double calculPoints(int points, String date) throws Exception {

		String annee = date.substring(0, 4);

		int i;

		i = Integer.parseInt(annee);

		if (i == anneeLicence) {

			setPointsFFV(points + getPointsFFV());

		} else
			throw new Exception();

		return getPointsFFV();

	}


	
	@Override
	public String toString() {
		return "Licencie [numeroLicence = " + numeroLicence + ", pointsFFV = "
				+ getPointsFFV() + ", dateNaissance = " + dateNaissance
				+ ", anneeLicence = " + anneeLicence + "]";
	}

	public static double getPointsFFV() {
		return pointsFFV;
	}

	public static void setPointsFFV(double pointsFFV) {
		Licencie.pointsFFV = pointsFFV;
	}

}
