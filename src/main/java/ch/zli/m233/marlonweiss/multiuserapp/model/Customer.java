package ch.zli.m233.marlonweiss.multiuserapp.model;

import java.util.List;

/**
 * 
 * @author marlon weiss
 * @since 8.07.20
 * @version 1.0
 * This is the customer interface
 *
 */
public interface Customer {
	
	Long getId();
	String getName();
	List<Memo> getMemos();
}
