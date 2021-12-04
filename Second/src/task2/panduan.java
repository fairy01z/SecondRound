package task2;
import java.util.regex.Matcher;
public class panduan {
	public static boolean acceptEmail(String s) {
		/*名称部分只允许英文字母、数字、下划线、英文句号
		     域名一般为2-4位
		     主机名，包含数字 、字母、_
		  邮箱：用户名@主机名.域名
		*/
		String guize="^[a-zA-Z0-9]+(\\_|\\.|\\w)*@(\\w|\\_)+\\.\\w+$";
		boolean isMatch;
		if(s.matches(guize)){
			isMatch=true;
		}else isMatch=false;
		return isMatch;
	}
}
