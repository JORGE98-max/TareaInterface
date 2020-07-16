
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Cellphone c1 = new Cellphone();
		Landlinephone c2 = new Landlinephone();
		Videophone c3 = new Videophone();
		
		c1.dialNumber();
		c1.isCallingProgress();
		c2.dialNumber();
		c2.isCallingProgress();
		c3.dialNumber();
		c3.isCallingProgress();

	}

}

interface phone {

	public void dialNumber( );

	public boolean isCallingProgress();

}

class Cellphone implements phone {

	@Override
	public void dialNumber() {
		
		System.out.println(59549464);

	}

	@Override
	public boolean isCallingProgress() {
		return false;
		

	}

}

class Landlinephone implements phone {

	@Override
	public void dialNumber() {
		
		System.out.println(15132456);

	}

	@Override
	public boolean isCallingProgress() {
		return false;

	}

}

class Videophone implements phone {

	@Override
	public void dialNumber() {
		
		System.out.println(132214654);

	}

	@Override
	public boolean isCallingProgress() {
		return false;

	}

}
