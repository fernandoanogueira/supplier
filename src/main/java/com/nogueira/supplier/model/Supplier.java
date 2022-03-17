package com.nogueira.supplier.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="suppliers")
public class Supplier {
	
	@Id
	private Long id;
	
	private String name;
	
	private String code;

}
