package com.ose.meis.bc.com;

public class ResObj <T>
{
	private Boolean surc;		
	private String err;	
	private T res;	// °á°ú °´Ã¼
	public ResObj()
	{
		this.surc = false;
		this.err = null;
		this.res = null;
	}
	
	public ResObj(Boolean s)
	{
		this();
		this.surc = s; 
	}
	
	public ResObj(Boolean s, String e)
	{
		this(s); 
		this.err = err;
	}
	
	public Boolean isSuccess()
	{
		return this.surc;
	}
	public void setSurc(Boolean s)
	{
		this.surc = s;
	}
	public String getErr()
	{
		return err;
	}
	public void setErr(String e)
	{
		this.err = e;
	}

	public T getRes()
	{
		return res;
	}


	public void setRes(T r)
	{
		this.res = r;
	}
}
