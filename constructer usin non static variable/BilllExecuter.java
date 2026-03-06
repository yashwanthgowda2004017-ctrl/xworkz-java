class BilllExecuter{

	public static void main(String[] args){
		Bill bill = new Bill();
		bill.billId = 1;
	bill.billAmount = 349.15;
	bill.isFinalBill = true;
	bill.isLatestBill = true;
	bill.isOverdue = false;
	bill.billIssueDate = "02-03-2026";
	bill.billDueDate = "03-04-2026";
	bill.billInvoice = "A123";
	System.out.println("the bill id is "+bill.billId);
	System.out.println("the bill amount is "+bill.billAmount);
	System.out.println("the is this is the final bill "+bill.isFinalBill); 

	Bill secondbill = new Bill();
	secondbill.billId = 2;
	secondbill.billAmount = 2000.15;
	secondbill.isFinalBill = false;
	secondbill.isLatestBill = true;
	System.out.println("the bill id is "+secondbill.billId);
	System.out.println("the bill amount is "+secondbill.billAmount);
	System.out.println("the is this is the final bill "+secondbill.isFinalBill); 



}
}