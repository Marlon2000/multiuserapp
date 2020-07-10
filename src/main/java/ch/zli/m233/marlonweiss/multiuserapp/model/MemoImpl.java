package ch.zli.m233.marlonweiss.multiuserapp.model;

import java.util.Date;

public class MemoImpl implements Memo {
	
	private Long memoId;
	private Date coverageDate;
	private String note;
	
	public MemoImpl(String memoText) {
		note = memoText;
	}

	@Override
	public Long getId() {
		return memoId;
	}

	@Override
	public Date getCoverageDate() {
		return coverageDate;
	}

	@Override
	public String getNote() {
		return note;
	}
	
	
}
