package bankAccountsDemo;

public class MyBankApp {
	
	public static void main(String[] args) {
		
		//  Create Accounts 
		Policy p[]=new Policy[3];
		p[0] = new Policy(111,"Health",1000);
		p[1] = new Policy(222,"Life Insuarance",2000);
		p[2] = new Policy(333,"Study",3000);
		
		Policy pp[]=new Policy[2];
		pp[0] = new Policy(444,"Vehicle",4000);
		pp[1] = new Policy(555,"Travel",5000);
		
		
			Account Vishesh= new Account(001,"Vishesh Baral",100,p);
			Account Baral = new Account(002,"Baral Vishesh",200,pp);
		
		// Display Information 
		
		Vishesh.display();
		Baral.display();
		// Display Information related to Policies 
		
		for(int i=0;i<3;i++) {
			p[i].display();
		}
		
		
		// get the policy by Id for specific account
		for(int i=0;i<2;i++) {
			if(Baral.getPolicies()[i].getPolicyId()==444) {
				Baral.getPolicies()[i].display();
			}
			
		}
	}


}
