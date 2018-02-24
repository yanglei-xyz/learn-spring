package cn.yorick.spring.aop;

public class BankServiceImpl {
	/**
	 * 查询余额
	 */
	public Integer getMoney() {
		System.out.println("BankServiceImpl。。。。getMoney。。。。余额500W");
		return 500;
	}

	/**
	 * 转账
	 */
	public String zhuanMoney() {
		System.out.println("BankServiceImpl。。。。zhuanMoney。。。。转账100W");
		return "哈哈哈哈哈哈哈哈😄";
	}

	/**
	 * 理财
	 */
	public void invest() {
		@SuppressWarnings("unused")
		int i = 10 / 0;
		System.out.println("BankServiceImpl。。。。invest。。。。购买理财200W，购买失败");
	}
}
