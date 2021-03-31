
public class Thermos {
	
	float Qty = 0;
	String Brand;
	String Liquid;
	
	Thermos(float Qty, String Brand,String Liquid )
	{
		this.Qty=Qty;
		this.Brand=Brand;
		this.Liquid=Liquid;
	}
	
	void addLiquid(double Q)
	{
			if(Q <= 1) {
				Qty = (float) (Qty + Q);
			}else {
				System.out.print("The capacity of thermos is 1 litre");
			}
		}
	
	void pourLiquid(double P)
	{
		if(P <= 1) {
			Qty = (float) (Qty - P);
		}else {
			System.out.print("The capacity of thermos is 1 litre");
		}
	}
		
		void displayDetails() {
			System.out.print("\nBrand: "+Brand);
			System.out.print("\nLiquid: "+Liquid);
			System.out.print("\nVolume(in Litres): "+Qty);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thermos Godrej = new Thermos(0, "Godrej", "Orange Juice");
		Godrej.addLiquid(0.8  );
		Godrej.pourLiquid(0.4);
		Godrej.displayDetails();
	}

}


