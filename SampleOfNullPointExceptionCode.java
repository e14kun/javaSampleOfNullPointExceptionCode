import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Collections;
/**
 * NullPointException 방지를 위한 코드 샘플
 * author : elijah9@gmail.com
*/
class SampleOfNullPointExceptionCode{
	public static void main(String[] args){

		// test caes 1 : smaple code of List case)
		//testing exist values)
		List<Object> testAry = new ArrayList<Object>();
		testAry.add("ary_dt1");
		testAry.add("ary_dt2");
		//testing none-exist values)
		//List<Object> testAry = null;

		//testing "loop of size"
		int length = Optional.ofNullable(testAry).orElseGet(()->Collections.emptyList()).size();
		for(int i=0 ; i< length ; i++){
			System.out.println(testAry.get(i));
		}
		//testing "foreach sentence"
		for(Object val : Optional.ofNullable(testAry).orElseGet(()->Collections.emptyList()) ){
			System.out.println((String)val);
		}

		// test caes 2 : smaple code of Map case)
		//testing exist values)
		Map<String,Object> testMap = new HashMap<String,Object>();
		testMap.put("wow","1");
		testMap.put("num",2);
		//testing none-exist values)
		//Map<String,Object> testMap = null;

		//testing "foreach sentence"
		for(Map.Entry<String,Object> val2 : Optional.ofNullable(testMap).orElseGet(()->Collections.emptyMap()).entrySet()){
			System.out.println((String)val2.getKey());
			System.out.println((String)val2.getValue().toString());
		}

		// test case 3 : sample code of String case)
		String testString = "testing";
		System.out.println( Optional.ofNullable(testString).orElseGet(()->"" ));
		
		return;
	}
}
