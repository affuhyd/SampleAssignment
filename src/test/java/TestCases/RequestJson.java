package TestCases;
public class RequestJson {
	
	public  static String getRequestJson() {
		
		String json = "{\"birthday\":\"01022011\",\"gender\":\"M\",\"name\":\"George\",\"natid\":\"S0901111Y\",\"salary\":\"325333\",\"tax\":\"0.4\"}";
		return json;
	}

	public static String getMultiple() {
		
		String json="[{\"birthday\":\"01012011\",\"gender\":\"M\",\"name\":\"Josef\",\"natid\":\"S3201111Y\",\"salary\":\"345333\",\"tax\":\"0.9\"},{\"birthday\":\"01012011\",\"gender\":\"F\",\"name\":\"Jasmine\",\"natid\":\"S3211111Y\",\"salary\":\"345333\",\"tax\":\"0.9\"}]";
		return json;
	}
}
