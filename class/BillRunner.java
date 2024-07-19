class BillRunner {

	public static void main(String generate[]) {
	
	//classname reference=new classname()
	Bill b1=new Bill();
	b1.isbillIssued=true;
	b1.billIssueDate="17-7-24";
	System.out.println("The bill is issued on " +b1.billIssueDate);
	
	Bill b2=new Bill();
	b2. billId=124;
	b2.billName="Bhoomika";
	b2.billIssueDate="17-5-24";
	System.out.println("The bill id is : "+b2.billId);
	System.out.println("The bill name is: " +b2.billName);
	System.out.println("The bill issued date is: " +b2.billIssueDate);
	}
	}