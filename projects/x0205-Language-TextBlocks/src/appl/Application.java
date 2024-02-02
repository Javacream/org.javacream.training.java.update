package appl;

import jj.util.log.Log;

public class Application {
	public static void main(String[] args) {
		demoSqlOld();
		demoSqlNew();
		demoJsonOld();
		demoJsonNew();
		demoIndent();
		demoFormat();
	}

	static void demoSqlOld() {
		Log.logMethodCall();
		String sql = "" +
				"select\n" +
				"    isbn, title, author\n" +
				"from\n" +
				"    book\n" +
				"where\n" +
				"    title = 'Pascal'";
		System.out.println(sql);
	}

	static void demoSqlNew() {
		Log.logMethodCall();
		String sql = """
				select
				    isbn, title, author
				from
				    book
				where
				    title = 'Pascal'
				""";
		System.out.println(sql);
	}

	static void demoJsonOld() {
		Log.logMethodCall();
		String json = "" +
				"{\n" +
				"    isbn : \"1111\",\n" +
				"    title : \"Pascal\",\n" +
				"    author : \"Wirth\",\n" +
				"    year : 1970\n" +
				"}";
		System.out.println(json);
	}

	static void demoJsonNew() {
		Log.logMethodCall();
		String json = """
				{
				    isbn : "1111",
				    title : "Pascal",
				    author : "Wirth",
				    year : 1970
				}
				""";
		System.out.println(json);
	}

	static void demoIndent() {
		Log.logMethodCall();
		String json = """
				    {
				        isbn : "1111",
				        title : "Pascal",
				        author : "Wirth",
				        year : 1970
				    }
				""";
		System.out.println(json);
	}

	static void demoFormat() {
		Log.logMethodCall();
		String json = String.format("""
				{
				    isbn : "%s",
				    title : "%s",
				    author : "%s",
				    year : %d
				}
				""",
				"1111", "Pascal", "Wirth", 1970);
		System.out.println(json);
	}
}

