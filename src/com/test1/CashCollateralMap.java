package com.test1;

public class CashCollateralMap {
	private Integer cashCollateralId;
	private String mappingCashCollateral1;
	private String mappingValue1;
	private String mappingCashCollateral2;
	private String mappingValue2;
	private String mappingCashCollateral3;
	private String mappingValue3;
	private String mappingSystem;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CashCollateralMap() {

	}

	public CashCollateralMap(Integer cashCollateralId, String mappingCashCollateral1, String mappingValue1,
			String mappingCashCollateral2, String mappingValue2, String mappingCashCollateral3, String mappingValue3,
			String mappingSystem, String creationDate, String modifiedDate, String entityState) {
		super();
		this.cashCollateralId = cashCollateralId;
		this.mappingCashCollateral1 = mappingCashCollateral1;
		this.mappingValue1 = mappingValue1;
		this.mappingCashCollateral2 = mappingCashCollateral2;
		this.mappingValue2 = mappingValue2;
		this.mappingCashCollateral3 = mappingCashCollateral3;
		this.mappingValue3 = mappingValue3;
		this.mappingSystem = mappingSystem;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCashCollateralId() {
		return cashCollateralId;
	}

	public void setCashCollateralId(Integer cashCollateralId) {
		this.cashCollateralId = cashCollateralId;
	}

	public String getMappingCashCollateral1() {
		return mappingCashCollateral1;
	}

	public void setMappingCashCollateral1(String mappingCashCollateral1) {
		this.mappingCashCollateral1 = mappingCashCollateral1;
	}

	public String getMappingValue1() {
		return mappingValue1;
	}

	public void setMappingValue1(String mappingValue1) {
		this.mappingValue1 = mappingValue1;
	}

	public String getMappingCashCollateral2() {
		return mappingCashCollateral2;
	}

	public void setMappingCashCollateral2(String mappingCashCollateral2) {
		this.mappingCashCollateral2 = mappingCashCollateral2;
	}

	public String getMappingValue2() {
		return mappingValue2;
	}

	public void setMappingValue2(String mappingValue2) {
		this.mappingValue2 = mappingValue2;
	}

	public String getMappingCashCollateral3() {
		return mappingCashCollateral3;
	}

	public void setMappingCashCollateral3(String mappingCashCollateral3) {
		this.mappingCashCollateral3 = mappingCashCollateral3;
	}

	public String getMappingValue3() {
		return mappingValue3;
	}

	public void setMappingValue3(String mappingValue3) {
		this.mappingValue3 = mappingValue3;
	}

	public String getMappingSystem() {
		return mappingSystem;
	}

	public void setMappingSystem(String mappingSystem) {
		this.mappingSystem = mappingSystem;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
