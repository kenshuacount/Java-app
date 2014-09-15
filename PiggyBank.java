class PiggyBank
{
	int totalMoney = 0;

	void putCoin(int money)
	{
		System.out.println(money + "円が投入されました");
		totalMoney = totalMoney + money;
	}

	int breakPiggyBank()
	{
		System.out.println("ガシャン");
		return totalMoney;
	}

	public static void main(String[] args)
	{
		PiggyBank bank = new PiggyBank();

		bank.putCoin(100);
		bank.putCoin(50);

		int money = bank.breakPiggyBank();
		System.out.println("貯金箱から" + money + "円を取り出しました");
	}
}