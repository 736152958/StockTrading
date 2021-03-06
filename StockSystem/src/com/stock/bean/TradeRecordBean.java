
package com.stock.bean;

public class TradeRecordBean {
	private String stockid;
	private String stockName;
	private String stockPrice;
	private String tradeNumber;
	private String buyuserid;
	private String saleuserid;
	private String tradeTime;

	public TradeRecordBean() {
		super();
	}

	/**
	 * @param stockid
	 * @param stockName
	 * @param stockPrice
	 * @param tradeNumber
	 * @param buyuserid
	 * @param saleuserid
	 * @param tradeTime
	 */
	public TradeRecordBean(String stockid, String stockName, String stockPrice,
			String tradeNumber, String buyuserid, String saleuserid,
			String tradeTime) {
		super();
		this.stockid = stockid;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		this.tradeNumber = tradeNumber;
		this.buyuserid = buyuserid;
		this.saleuserid = saleuserid;
		this.tradeTime = tradeTime;
	}

	/**
	 * @return stockid
	 */
	public String getStockid() {
		return stockid;
	}

	/**
	 * @param stockid
	 *            要设置的 stockid
	 */
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}

	/**
	 * @return stockName
	 */
	public String getStockName() {
		return stockName;
	}

	/**
	 * @param stockName
	 *            要设置的 stockName
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	/**
	 * @return stockPrice
	 */
	public String getStockPrice() {
		return stockPrice;
	}

	/**
	 * @param stockPrice
	 *            要设置的 stockPrice
	 */
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}

	/**
	 * @return tradeNumber
	 */
	public String getTradeNumber() {
		return tradeNumber;
	}

	/**
	 * @param tradeNumber
	 *            要设置的 tradeNumber
	 */
	public void setTradeNumber(String tradeNumber) {
		this.tradeNumber = tradeNumber;
	}

	/**
	 * @return buyuserid
	 */
	public String getBuyuserid() {
		return buyuserid;
	}

	/**
	 * @param buyuserid
	 *            要设置的 buyuserid
	 */
	public void setBuyuserid(String buyuserid) {
		this.buyuserid = buyuserid;
	}

	/**
	 * @return saleuserid
	 */
	public String getSaleuserid() {
		return saleuserid;
	}

	/**
	 * @param saleuserid
	 *            要设置的 saleuserid
	 */
	public void setSaleuserid(String saleuserid) {
		this.saleuserid = saleuserid;
	}

	/**
	 * @return tradeTime
	 */
	public String getTradeTime() {
		return tradeTime;
	}

	/**
	 * @param tradeTime
	 *            要设置的 tradeTime
	 */
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}
}