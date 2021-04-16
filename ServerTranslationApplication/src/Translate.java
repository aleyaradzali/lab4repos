
public class Translate {
	
	private String text;
	private String lang;
	private String translated;
	
	public Translate(String text, String lang) {
		this.text = text;
		this.lang = lang;
	}
	
	
	public String getTranslatedText() {
		
		if(text.equals("Good morning") && lang.equals("Malay")) {
			
			translated = "Selamat pagi";
			
		}
		else if(text.equals("Good night") && lang.equals("Malay")) {
			translated = "Selamat malam";
		}
		else if(text.equals("How are you?") && lang.equals("Malay")) {
			translated = "Apa khabar?";
		}
		else if(text.equals("Thank you") && lang.equals("Malay")) {
			translated = "Terima kasih";
		}
		else if(text.equals("Goodbye") && lang.equals("Malay")) {
			translated = "Selamat tinggal";
		}
		else if(text.equals("What's up?") && lang.equals("Malay")) {
			translated = "Ada apa?";
		}
		else if(text.equals("Good morning") && lang.equals("Arabic")) {
			
			translated = "الخير صباح";		
		}
		else if(text.equals("Good night") && lang.equals("Arabic")) {
			translated = "الخير مساء";
		}
		else if(text.equals("How are you?") && lang.equals("Arabic")) {
			translated = "?حالك كيف";
		}
		else if(text.equals("Thank you") && lang.equals("Arabic")) {
			translated = "لك شكرا";
		}
		else if(text.equals("Goodbye") && lang.equals("Arabic")) {
			translated = "السلامة مع";
		}
		else if(text.equals("What's up?") && lang.equals("Arabic")) {
			translated = "?أخبارك ما";
		}
		else if(text.equals("Good morning") && lang.equals("Korean")) {
			
			translated = "좋은 아침";		
		}
		else if(text.equals("Good night") && lang.equals("Korean")) {
			translated = "안녕히 주무세요";
		}
		else if(text.equals("How are you?") && lang.equals("Korean")) {
			translated = "잘 지내?";
		}
		else if(text.equals("Thank you") && lang.equals("Korean")) {
			translated = "감사합니다";
		}
		else if(text.equals("Goodbye") && lang.equals("Korean")) {
			translated = "안녕";
		}
		else if(text.equals("What's up?") && lang.equals("Korean")) {
			translated = "뭐야?";
		}
		else
		{
			translated = "annanana"; // if text and lang cannot be retrieved
		}
			
		
		return translated;
	}

}
