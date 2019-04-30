package play.java.base.exception;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/30 0030. - 星期二
 * nickName louyedaren
 */
public class T1 {
	public static void main(String[] args) {
		try {
			indexBoundsException();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error erro");
		} finally {
			System.out.println("come in finnal");
		}
	}

	public static void indexBoundsException() {
		int[] a = new int[]{1, 2};
		a[3] = 2;
	}
}
