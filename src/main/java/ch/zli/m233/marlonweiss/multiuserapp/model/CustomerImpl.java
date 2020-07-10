package ch.zli.m233.marlonweiss.multiuserapp.model;

import java.util.List;

public class CustomerImpl implements Customer{
	
	private Long customerId;
	private String name;
	private List<Memo> memos;
	
	public CustomerImpl(String name) {
		
	}
	
	public void addMemo(Memo memo) {
		memos.add(memo);
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return customerId;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public List<Memo> getMemos() {
		// TODO Auto-generated method stub
		return memos;
	}
}
