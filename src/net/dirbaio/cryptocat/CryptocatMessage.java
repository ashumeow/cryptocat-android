package net.dirbaio.cryptocat;

/**
 * Created with IntelliJ IDEA.
 * User: dirbaio
 * Date: 8/17/13
 * Time: 6:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class CryptocatMessage
{
	final Type t;
	final String nickname;
	final String text;

	public CryptocatMessage(String nickname, Type t)
	{
		this.nickname = nickname;
		this.t = t;
		this.text = null;
	}

	public CryptocatMessage(Type t, String nickname, String text)
	{
		this.t = t;
		this.nickname = nickname;
		this.text = text;
	}

	public enum Type
	{
		Message,
		Join,
		Leave
	}
}
