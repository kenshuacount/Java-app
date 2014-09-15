class PiggyBank
{
	int totalMoney = 0;

	void putCoin(int money)
	{
		System.out.println(money + "‰~‚ª“Š“ü‚³‚ê‚Ü‚µ‚½");
		totalMoney = totalMoney + money;
	}

	int breakPiggyBank()
	{
		System.out.println("ƒKƒVƒƒƒ“");
		return totalMoney;
	}

	public static void main(String[] args)
	{
		PiggyBank bank = new PiggyBank();

		bank.putCoin(100);
		bank.putCoin(50);

		int money = bank.breakPiggyBank();
		System.out.println("’™‹à” ‚©‚ç" + money + "‰~‚ğæ‚èo‚µ‚Ü‚µ‚½");
	}
}