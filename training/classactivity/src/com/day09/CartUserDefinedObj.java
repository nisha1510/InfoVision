package com.day09;

import java.util.ArrayList;
import java.util.List;

public class CartUserDefinedObj {

	public static void main(String[] args) {
		List<Cart> cart = new ArrayList<>();
		cart.add(new Cart(1,"shoes",2000));
		
		System.out.println(cart);
	}

}
