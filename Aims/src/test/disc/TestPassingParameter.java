package test.disc;
import aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	
	public static void main(String args[]) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderrela");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
	}
	
	public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		String title1 = o1.getTitle();
		String title2 = o2.getTitle();
		o1.setTitle(title2);
		o2.setTitle(title1);
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}