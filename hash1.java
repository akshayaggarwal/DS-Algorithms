public class hash1 {

public Map m1;
    Codec()
    {
        m1 = new HashMap();
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        
        String str = "" + longUrl.hashCode();
        this.m1.put(str,longUrl);
        return str;
    }

    public String decode(String shortUrl) {
        String str = this.m1.get(shortUrl).toString();
	return str;
    }
    
  
}
