package todo.tool;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.util.Date;

public class DateUtil
{

	public static boolean isDate(String str)
	{
		return isDate(str,new ParsePosition(0),false);
	}
	public static boolean isDate(String str,ParsePosition pos)
	{
		return isDate(str,pos,false);
	}
	public static boolean isDate(String str,boolean lenient)
	{
		return isDate(str,new ParsePosition(0),lenient);
	}
	public static boolean isDate(String str,ParsePosition pos,boolean lenient)
	{
		DateFormat fmt = DateFormat.getDateInstance();
		fmt.setLenient(lenient);

		Date d = fmt.parse(str,pos);

		return (d!=null);
	}

}