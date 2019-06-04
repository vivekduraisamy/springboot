package com.vivek.app.entity;

import org.springframework.stereotype.Component;

@Component
public class Customer {
private String customerName;
private String customerEmail;
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", customerEmail=" + customerEmail + "]";
}

}
