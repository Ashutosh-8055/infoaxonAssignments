
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;

public class Policy  {
     int Policy_id;
     long Policy_number;
     String nameofPolicy;
     LocalDate Policy_Created_date;
     LocalDate Policy_Due_Date;
     LocalDate Policy_Payment_Date;
     String Policy_Status;
     double Policy_Premium_Amount;
     double Policy_Maturity_Amount;
     double Policy_Sum_Assured;
     int Policy_Tenure;
     String Policy_Payment_Frequency;
     String Policy_Payment_Status;


	
	
     @Override
	public String toString() {
		return "Policy [Policy_id=" + Policy_id + ", Policy_number=" + Policy_number + ", nameofPolicy=" + nameofPolicy
				+ ", Policy_Created_date=" + Policy_Created_date + ", Policy_Due_Date=" + Policy_Due_Date
				+ ", Policy_Payment_Date=" + Policy_Payment_Date + ", Policy_Status=" + Policy_Status
				+ ", Policy_Premium_Amount=" + Policy_Premium_Amount + ", Policy_Maturity_Amount="
				+ Policy_Maturity_Amount + ", Policy_Sum_Assured=" + Policy_Sum_Assured + ", Policy_Tenure="
				+ Policy_Tenure + ", Policy_Payment_Frequency=" + Policy_Payment_Frequency + ", Policy_Payment_Status="
				+ Policy_Payment_Status + "]";
	}

         public Policy(int policy_id, long policy_number, String nameofPolicy, LocalDate policy_Created_date,
			LocalDate policy_Due_Date, LocalDate policy_Payment_Date, String policy_Status,
			double policy_Premium_Amount, double policy_Maturity_Amount, double policy_Sum_Assured, int policy_Tenure,
			String policy_Payment_Frequency, String policy_Payment_Status) {
		super();
		Policy_id = policy_id;
		Policy_number = policy_number;
		this.nameofPolicy = nameofPolicy;
		Policy_Created_date = policy_Created_date;
		Policy_Due_Date = policy_Due_Date;
		Policy_Payment_Date = policy_Payment_Date;
		Policy_Status = policy_Status;
		Policy_Premium_Amount = policy_Premium_Amount;
		Policy_Maturity_Amount = policy_Maturity_Amount;
		Policy_Sum_Assured = policy_Sum_Assured;
		Policy_Tenure = policy_Tenure;
		Policy_Payment_Frequency = policy_Payment_Frequency;
		Policy_Payment_Status = policy_Payment_Status;
	}

       public int getPolicy_id() {
		return Policy_id;
	}

	public void setPolicy_id(int policy_id) {
		Policy_id = policy_id;
	}

	public long getPolicy_number() {
		return Policy_number;
	}

	public void setPolicy_number(long policy_number) {
		Policy_number = policy_number;
	}

	public String getNameofPolicy() {
		return nameofPolicy;
	}

	public void setNameofPolicy(String nameofPolicy) {
		this.nameofPolicy = nameofPolicy;
	}

	public LocalDate getPolicy_Created_date() {
		return Policy_Created_date;
	}

	public void setPolicy_Created_date(LocalDate policy_Created_date) {
		Policy_Created_date = policy_Created_date;
	}

	public LocalDate getPolicy_Due_Date() {
		return Policy_Due_Date;
	}

	public void setPolicy_Due_Date(LocalDate policy_Due_Date) {
		Policy_Due_Date = policy_Due_Date;
	}

	public LocalDate getPolicy_Payment_Date() {
		return Policy_Payment_Date;
	}

	public void setPolicy_Payment_Date(LocalDate policy_Payment_Date) {
		Policy_Payment_Date = policy_Payment_Date;
	}

	public String getPolicy_Status() {
		return Policy_Status;
	}

	public void setPolicy_Status(String policy_Status) {
		Policy_Status = policy_Status;
	}

	public double getPolicy_Premium_Amount() {
		return Policy_Premium_Amount;
	}

	public void setPolicy_Premium_Amount(double policy_Premium_Amount) {
		Policy_Premium_Amount = policy_Premium_Amount;
	}

	public double getPolicy_Maturity_Amount() {
		return Policy_Maturity_Amount;
	}

	public void setPolicy_Maturity_Amount(double policy_Maturity_Amount) {
		Policy_Maturity_Amount = policy_Maturity_Amount;
	}

	public double getPolicy_Sum_Assured() {
		return Policy_Sum_Assured;
	}

	public void setPolicy_Sum_Assured(double policy_Sum_Assured) {
		Policy_Sum_Assured = policy_Sum_Assured;
	}

	public int getPolicy_Tenure() {
		return Policy_Tenure;
	}

	public void setPolicy_Tenure(int policy_Tenure) {
		Policy_Tenure = policy_Tenure;
	}

	public String getPolicy_Payment_Frequency() {
		return Policy_Payment_Frequency;
	}

	public void setPolicy_Payment_Frequency(String policy_Payment_Frequency) {
		Policy_Payment_Frequency = policy_Payment_Frequency;
	}

	public String getPolicy_Payment_Status() {
		return Policy_Payment_Status;
	}

	public void setPolicy_Payment_Status(String policy_Payment_Status) {
		Policy_Payment_Status = policy_Payment_Status;
	}

     public static Policy getinfo(Map<Integer,Policy> mapofpolicy,int Policyid)
          {
               Policy object =mapofpolicy.get(Policyid);
               return object;
          }

     public static String getPolicyStatus(Map<Integer,Policy> mapofpolicy,int Policyid)
           {
                 Policy object2 = mapofpolicy.get(Policyid);
                 return object2.getPolicy_Status();
           }

     public static String getPolicyPaymentStatus(Map<Integer,Policy> mapofpolicy,int Policyid)
            {
                Policy object3 = mapofpolicy.get(Policyid);
                return object3.getPolicy_Payment_Status();
            }

     public static LocalDate getPolicyDueDate(Map<Integer,Policy>mapofpolicy,Policyid)
           {
                 Policy object3=mapofpolicy.get(Policyid);
                 return Object3.getPolicy_Due_Date();
           }
 }
