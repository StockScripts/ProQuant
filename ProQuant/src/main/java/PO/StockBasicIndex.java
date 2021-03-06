package PO;
// Generated 2017-6-10 0:50:46 by Hibernate Tools 5.2.1.Final

/**
 * StockBasicIndex generated by hbm2java
 */
public class StockBasicIndex implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6545257781343078638L;
	private String code;
	//一周跌幅%
	private Double weekChangeRatio;
	//一月跌幅%
	private Double monthChangeRatio;
	//三月跌幅%
	private Double seasonChangeRatio;
	//半年跌幅%
	private Double halfayearChangeRatio;
	//一年跌幅%
	private Double yearChangeRatio;
	//市盈率
	private Double pe;
	//市净率
	private Double pb;
	//市现率
	private Double pcf;
	//市销率
	private Double ps;
	//每股收益
	private Double perShareEarnings;
	//销售净利率
	private Double netProfitMarginOnSales;
	//资产收益率
	private Double roa;
	//资产负债率
	private Double debtAssetRatio;
	//流动比率
	private Double currentRatio;
	//主营收入（亿）
	private Double mainBusinessIncome;
	//净利润（万）
	private Double netProfit;
	//总资产（亿）
	private Double totalAssets;
	//股东权益（亿）
	private Double shareholdersEquity;

	public StockBasicIndex() {
	}

	public StockBasicIndex(String code) {
		this.code = code;
	}

	public StockBasicIndex(String code, Double weekChangeRatio, Double monthChangeRatio, Double seasonChangeRatio,
			Double halfayearChangeRatio, Double yearChangeRatio, Double pe, Double pb, Double pcf, Double ps,
			Double perShareEarnings, Double netProfitMarginOnSales, Double roa, Double debtAssetRatio,
			Double currentRatio, Double mainBusinessIncome, Double netProfit, Double totalAssets,
			Double shareholdersEquity) {
		this.code = code;
		this.weekChangeRatio = weekChangeRatio;
		this.monthChangeRatio = monthChangeRatio;
		this.seasonChangeRatio = seasonChangeRatio;
		this.halfayearChangeRatio = halfayearChangeRatio;
		this.yearChangeRatio = yearChangeRatio;
		this.pe = pe;
		this.pb = pb;
		this.pcf = pcf;
		this.ps = ps;
		this.perShareEarnings = perShareEarnings;
		this.netProfitMarginOnSales = netProfitMarginOnSales;
		this.roa = roa;
		this.debtAssetRatio = debtAssetRatio;
		this.currentRatio = currentRatio;
		this.mainBusinessIncome = mainBusinessIncome;
		this.netProfit = netProfit;
		this.totalAssets = totalAssets;
		this.shareholdersEquity = shareholdersEquity;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getWeekChangeRatio() {
		return this.weekChangeRatio;
	}

	public void setWeekChangeRatio(Double weekChangeRatio) {
		this.weekChangeRatio = weekChangeRatio;
	}

	public Double getMonthChangeRatio() {
		return this.monthChangeRatio;
	}

	public void setMonthChangeRatio(Double monthChangeRatio) {
		this.monthChangeRatio = monthChangeRatio;
	}

	public Double getSeasonChangeRatio() {
		return this.seasonChangeRatio;
	}

	public void setSeasonChangeRatio(Double seasonChangeRatio) {
		this.seasonChangeRatio = seasonChangeRatio;
	}

	public Double getHalfayearChangeRatio() {
		return this.halfayearChangeRatio;
	}

	public void setHalfayearChangeRatio(Double halfayearChangeRatio) {
		this.halfayearChangeRatio = halfayearChangeRatio;
	}

	public Double getYearChangeRatio() {
		return this.yearChangeRatio;
	}

	public void setYearChangeRatio(Double yearChangeRatio) {
		this.yearChangeRatio = yearChangeRatio;
	}

	public Double getPe() {
		return this.pe;
	}

	public void setPe(Double pe) {
		this.pe = pe;
	}

	public Double getPb() {
		return this.pb;
	}

	public void setPb(Double pb) {
		this.pb = pb;
	}

	public Double getPcf() {
		return this.pcf;
	}

	public void setPcf(Double pcf) {
		this.pcf = pcf;
	}

	public Double getPs() {
		return this.ps;
	}

	public void setPs(Double ps) {
		this.ps = ps;
	}

	public Double getPerShareEarnings() {
		return this.perShareEarnings;
	}

	public void setPerShareEarnings(Double perShareEarnings) {
		this.perShareEarnings = perShareEarnings;
	}

	public Double getNetProfitMarginOnSales() {
		return this.netProfitMarginOnSales;
	}

	public void setNetProfitMarginOnSales(Double netProfitMarginOnSales) {
		this.netProfitMarginOnSales = netProfitMarginOnSales;
	}

	public Double getRoa() {
		return this.roa;
	}

	public void setRoa(Double roa) {
		this.roa = roa;
	}

	public Double getDebtAssetRatio() {
		return this.debtAssetRatio;
	}

	public void setDebtAssetRatio(Double debtAssetRatio) {
		this.debtAssetRatio = debtAssetRatio;
	}

	public Double getCurrentRatio() {
		return this.currentRatio;
	}

	public void setCurrentRatio(Double currentRatio) {
		this.currentRatio = currentRatio;
	}

	public Double getMainBusinessIncome() {
		return this.mainBusinessIncome;
	}

	public void setMainBusinessIncome(Double mainBusinessIncome) {
		this.mainBusinessIncome = mainBusinessIncome;
	}

	public Double getNetProfit() {
		return this.netProfit;
	}

	public void setNetProfit(Double netProfit) {
		this.netProfit = netProfit;
	}

	public Double getTotalAssets() {
		return this.totalAssets;
	}

	public void setTotalAssets(Double totalAssets) {
		this.totalAssets = totalAssets;
	}

	public Double getShareholdersEquity() {
		return this.shareholdersEquity;
	}

	public void setShareholdersEquity(Double shareholdersEquity) {
		this.shareholdersEquity = shareholdersEquity;
	}

}
