/**
 * Main class för att demonstrera hur datakontrollen sker till.
 * @author Axel Swaretz
 *
 */
public class Main {
	static Tuple tuple = new Tuple();
	static Handler handler= new Handler();
	public static void main(String[] args) {
		handler.set(tuple);
		handler.valueChecker();
	}

}
