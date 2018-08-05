package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.naming.directory.SearchResult;



public class APIExamSearch {
	
	
	
	public static StringBuilder builder;
	
	
    static String getString(String input, String data) // API에서 필요한 문자 자르기.
    {
        String[] dataSplit = data.split("{" + input + "}");
        String[] dataSplit2 = dataSplit[1].split("\"" + input + "\"");
        return dataSplit2[0];
    }

    public static void main(String[] args) {
        String clientId = "lymD0PHGjImLKtyrxgpv";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "UTYB8hQAKN";//애플리케이션 클라이언트 시크릿값";
        int display = 2;
        try {
            String text = URLEncoder.encode("바람의 검심", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/movie?query="+ text 
            		+ "&display=" + display; // json 결과
            //String apiURL = "https://openapi.naver.com/v1/search/movie.xml?query="+ text; // xml 결과
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            
            builder = new StringBuilder();
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                builder.append(inputLine + "\n");
            }
            br.close();
            con.disconnect();
            System.out.println(builder);
            String data = builder.toString();
            String[] array;
            array = data.split("\"");
            
            String[] title = new String[display];
            String[] link = new String[display];
            String[] pubDate = new String[display];
            String[] director = new String[display];
            String[] userRating = new String[display];
            String[] uniqueCode = new String[display];
            
            int k = 0;
            
            
            
            for(int i = 0 ; i < array.length; i++) {
             	if(array[i].equals("title")){            		
             		title[k] = array[i + 2].replace("<b>","").replace("</b>","");
             	}
             	if(array[i].equals("link")){
             		link[k] = array[i + 2];
             		uniqueCode[k] = array[i + 2].split("=")[1];

             	}
             	if(array[i].equals("pubDate")){            		
             		pubDate[k] = array[i + 2];

             	}
             	if(array[i].equals("director")){            		
             		director[k] = array[i + 2].split("\\|")[0];

             	}
             	if(array[i].equals("userRating")) {            		
             		userRating[k] = array[i + 2];
             		k++;
             	}
             }
            //System.out.println(builder);
            System.out.println("------------------------");
            System.out.println("1st title : " + title[0]);
            System.out.println("1st link : " + link[0]);
            System.out.println("1st pubDate : " + pubDate[0]);
            System.out.println("1st director : " + director[0]);
            System.out.println("1st userRating : " + userRating[0]);
            System.out.println("1st uniqueCode : " + uniqueCode[0]);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
