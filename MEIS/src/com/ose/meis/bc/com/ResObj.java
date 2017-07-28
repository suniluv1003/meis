package com.ose.meis.bc.com;

public class ResObj <T>
{
	private String surc;		
	private String err;	
	private T res;	// °á°ú °´Ã¼
	public ResObj()
	{
		this.surc = null;
		this.err = null;
		this.res = null;
	}
	
	public ResObj(String s)
	{
		this();
		this.surc = s; 
	}
	
	public ResObj(String s, String e)
	{
		this(s); 
		this.err = err;
	}
	
	public String isSuccess()
	{
		return this.surc;
	}
	public void setSurc(String s)
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
