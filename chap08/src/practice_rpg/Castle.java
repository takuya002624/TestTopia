package practice_rpg;

public class Castle {
//王様インスタンス

	public void favorite(Hero h) { //好感度イベント
		System.out.println("しろ に おとずれた");
		if(h.eval <= 20) {
			System.out.println("「ゆうしゃ" + h.name +"よ まおう たいじ には まだはやい」");
			System.out.println("「もっと クエスト を うけてきなさい！」");
			System.out.println(" HP：" + h.hp + "しょじきん：" + h.gold + "gold こうかんど：" + h.eval);
			System.out.println("");
		}else {
			System.out.println("「勇者" + h.name +"よ！よくぞここまで…！」");
			System.out.println("「まおう を たおしてきなさい！」");
			System.out.println("");
		}
	}
}
