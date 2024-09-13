package com.test1;

public class CashCollateralLimitFields {
	private Integer fieldId;
	private String fieldName;
	private String isHidden;
	private String collateralScreenName;
	private Integer fieldSize;
	private boolean isAmendableFromScreen;
	private boolean isSearchableFromScreen;
	private String searchType;
	private String searchTypeIndicator;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CashCollateralLimitFields() {

	}

	public CashCollateralLimitFields(Integer fieldId, String fieldName, String isHidden, String collateralScreenName,
			Integer fieldSize, boolean isAmendableFromScreen, boolean isSearchableFromScreen, String searchType,
			String searchTypeIndicator, String creationCr, String modifiedCr, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.fieldId = fieldId;
		this.fieldName = fieldName;
		this.isHidden = isHidden;
		this.collateralScreenName = collateralScreenName;
		this.fieldSize = fieldSize;
		this.isAmendableFromScreen = isAmendableFromScreen;
		this.isSearchableFromScreen = isSearchableFromScreen;
		this.searchType = searchType;
		this.searchTypeIndicator = searchTypeIndicator;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getFieldId() {
		return fieldId;
	}

	public void setFieldId(Integer fieldId) {
		this.fieldId = fieldId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getIsHidden() {
		return isHidden;
	}

	public void setIsHidden(String isHidden) {
		this.isHidden = isHidden;
	}

	public String getCollateralScreenName() {
		return collateralScreenName;
	}

	public void setCollateralScreenName(String collateralScreenName) {
		this.collateralScreenName = collateralScreenName;
	}

	public Integer getFieldSize() {
		return fieldSize;
	}

	public void setFieldSize(Integer fieldSize) {
		this.fieldSize = fieldSize;
	}

	public boolean isAmendableFromScreen() {
		return isAmendableFromScreen;
	}

	public void setAmendableFromScreen(boolean isAmendableFromScreen) {
		this.isAmendableFromScreen = isAmendableFromScreen;
	}

	public boolean isSearchableFromScreen() {
		return isSearchableFromScreen;
	}

	public void setSearchableFromScreen(boolean isSearchableFromScreen) {
		this.isSearchableFromScreen = isSearchableFromScreen;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchTypeIndicator() {
		return searchTypeIndicator;
	}

	public void setSearchTypeIndicator(String searchTypeIndicator) {
		this.searchTypeIndicator = searchTypeIndicator;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
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
