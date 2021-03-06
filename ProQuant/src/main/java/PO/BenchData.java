package PO;
// Generated 2017-5-28 13:12:39 by Hibernate Tools 5.2.1.Final

/**
 * BenchData generated by hbm2java
 */
public class BenchData implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6126538731784802186L;
	private BenchDataId id;
	private Double open;
	private Double high;
	private Double low;
	private Double close;
	private Double netChange;
	private Double chg;
	private Double volume;
	private Double turnover;

	public BenchData() {
	}

	public BenchData(BenchDataId id) {
		this.id = id;
	}

	public BenchData(BenchDataId id, Double open, Double high, Double low, Double close, Double netChange, Double chg,
			Double volume, Double turnover) {
		this.id = id;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.netChange = netChange;
		this.chg = chg;
		this.volume = volume;
		this.turnover = turnover;
	}

	public BenchDataId getId() {
		return this.id;
	}

	public void setId(BenchDataId id) {
		this.id = id;
	}

	public Double getOpen() {
		return this.open;
	}

	public void setOpen(Double open) {
		this.open = open;
	}

	public Double getHigh() {
		return this.high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public Double getLow() {
		return this.low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public Double getClose() {
		return this.close;
	}

	public void setClose(Double close) {
		this.close = close;
	}

	public Double getNetChange() {
		return this.netChange;
	}

	public void setNetChange(Double netChange) {
		this.netChange = netChange;
	}

	public Double getChg() {
		return this.chg;
	}

	public void setChg(Double chg) {
		this.chg = chg;
	}

	public Double getVolume() {
		return this.volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getTurnover() {
		return this.turnover;
	}

	public void setTurnover(Double turnover) {
		this.turnover = turnover;
	}

}
