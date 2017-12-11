package javastudy;

public class ParserTest {
	public static void main(String args[]) {
		Parseable parser = ParserManager.getParser("XML"); // parse는 XMLParser인스턴스를 가리킴
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}

interface Parseable {
	public abstract void parse(String fileName);
}

class ParserManager {
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName + " - XML parsing");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing");
	}
}