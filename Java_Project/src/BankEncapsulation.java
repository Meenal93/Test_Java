
public class BankEncapsulation {

	public int AccountNo = 13434;
	private int PinNo = 56757;
	private int BalanceAmount = 100000000;

	public void Withdraw(int AccNo, int Pin, int Amount) {

		if (AccNo == AccountNo && Pin == PinNo) {

			if (Amount < BalanceAmount) {

				int LeftBalance = BalanceAmount - Amount;

				System.out.println("Amount withdrawn is --> " + "Rs." + Amount);
				System.out.println("Balance left in your acount is " + "Rs." + LeftBalance);

			} else {

				System.out.println("Insufficient Balance...........");
			}

		} else {

			System.out.println("Incorrect details entered........");

		}
	}

	public void UpdatePin(int AccNo, int OldPin, int NewPin) {

		if (OldPin==PinNo && AccNo==AccountNo) {
			
			 PinNo = NewPin;

			System.out.println("Pin updated successfully.....");

		} else {

			System.out.println("You have entered incorrect Old Pin No!");
		}

	}

}