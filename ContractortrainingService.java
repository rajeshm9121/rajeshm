/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.contractortraining.service;

public interface ContractortrainingService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
