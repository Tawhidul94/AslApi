package com.api.entity;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {
	
	@Id
	@Basic(optional = false)
	private String productId;
	
	
	private String productName;
	
	private String productBrand;
	
	private String productCatagory;
	
	private int qunataty;
	
	private BigDecimal price;
	
	private String note;
	
	@Transient
	private BigDecimal totalAmount;

	
}
