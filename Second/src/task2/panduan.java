package task2;
import java.util.regex.Matcher;
public class panduan {
	public static boolean acceptEmail(String s) {
		/*���Ʋ���ֻ����Ӣ����ĸ�����֡��»��ߡ�Ӣ�ľ��
		     ����һ��Ϊ2-4λ
		     ���������������� ����ĸ��_
		  ���䣺�û���@������.����
		*/
		String guize="^[a-zA-Z0-9]+(\\_|\\.|\\w)*@(\\w|\\_)+\\.\\w+$";
		boolean isMatch;
		if(s.matches(guize)){
			isMatch=true;
		}else isMatch=false;
		return isMatch;
	}
}
