package section08;

public class Method05 {
	public static void main(String[] args) {
		String[] pokemons = {"피카츄", "라이츄", "파이리", "꼬부기"};
		
		printPokemon(pokemons);
	}
	
	// 5. 인자 o 배열타입 리턴 x
	public static void printPokemon(String[] mons) {
		for(String mon : mons) {
			System.out.println(mon);
		}
		
		for(int i = 0; i < mons.length; i++) {
			System.out.println(mons[i]);
		}
	}
}
