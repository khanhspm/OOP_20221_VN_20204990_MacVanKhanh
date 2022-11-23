package test.disc;
import aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		objectWrapper wrapperObj1 = new objectWrapper(jungleDVD);
        objectWrapper wrapperObj2 = new objectWrapper(cinderellaDVD);
		swap(wrapperObj1, wrapperObj2);
		System.out.println("jungle DVD title: " + wrapperObj1.innerObject.getTitle());
		System.out.println("cinderella DVD title: " + wrapperObj2.innerObject.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle DVD title: " + jungleDVD.getTitle());
	}

    static class objectWrapper {
    	DigitalVideoDisc innerObject;
        public objectWrapper(DigitalVideoDisc objInnner) {
            this.innerObject = objInnner;
        }
    }
    
    static void swap(objectWrapper wrapperObj1, objectWrapper wrapperObj2) {
    	DigitalVideoDisc temp;
        temp = wrapperObj1.innerObject;
        wrapperObj1.innerObject = wrapperObj2.innerObject;
        wrapperObj2.innerObject = temp;
    }

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.set(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}