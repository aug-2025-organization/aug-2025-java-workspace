package com.demo.spring_rest_hello_project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class ProductPojo {
	private int productId;
	private String productName;
	private double productCost;
}
