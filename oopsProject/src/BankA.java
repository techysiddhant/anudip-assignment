class BankA extends Bank{
// method for get balance
int getBalance(int balance) { return balance; }
@Override
int getBalance() {
	return 0;
}
}