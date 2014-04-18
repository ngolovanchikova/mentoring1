package calculate.web.app;

public class Calculate {

    public static Integer getResult(int i, int j) {
	Integer result = 0;
	for (int index = 1; index <= j; index++) {
	    result += i;
	}
	return result;
    }

}
