class PiggyBank
{
	int totalMoney = 0;

	void putCoin(int money)
	{
		System.out.println(money + "�~����������܂���");
		totalMoney = totalMoney + money;
	}

	int breakPiggyBank()
	{
		System.out.println("�K�V����");
		return totalMoney;
	}

	public static void main(String[] args)
	{
		PiggyBank bank = new PiggyBank();

		bank.putCoin(100);
		bank.putCoin(50);

		int money = bank.breakPiggyBank();
		System.out.println("����������" + money + "�~�����o���܂���");
	}
}