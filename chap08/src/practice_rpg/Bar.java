package practice_rpg;

public class Bar {

	//Barインスタンス

	boolean flag; //クエストをうけているかどうか
	boolean clear; //クエストをクリアしているかどうか
	int num; //クエスト番号

	public void cuest(Hero h) {
		System.out.println("バー に おとずれた");
		if (flag == false) { //クエストを受けていない場合

			System.out.println("「よくきたな」");

			if (h.eval < 5) {//クエスト番号１、採取
				System.out.println("「おまえができるのは、やくそう の さいしゅ ぐらいだ」");
				System.out.println("やくそうさいしゅ を うけた");
				System.out.println("");
				flag = true;
				num = 1; //採取を受ける

			} else if (h.eval < 10) {//クエスト番号２、ゴブリンたいじ
				System.out.println("「おまえができるのは、ゴブリン たいじ ぐらいだ」");
				System.out.println("ゴブリン たいじ を うけた");
				System.out.println("");
				flag = true;
				num = 2; //ゴブリンたいじを受ける

			} else {//クエスト番号３、ドラゴンたいじ
				System.out.println("「おまえなら、ドラゴン たいじ できるかもしれないな」");
				System.out.println("ドラゴン たいじ を うけた");
				System.out.println("");
				flag = true;
				num = 3; //ドラゴンたいじを受ける
			}
		} else {
			if (clear == false) { //クエストを受けているがクリアしていない場合
				switch (num) {
				case 1: //採取を受けている場合
					System.out.println("「おまえ に さいしゅ は むずかしかったかな？」");
					System.out.println("「でなおしてこい！」");
					System.out.println("");
					break;
				case 2: //ゴブリンたいじをを受けている場合
					System.out.println("「おまえ に ゴブリン たいじ は むずかしかったかな？」");
					System.out.println("「でなおしてこい！」");
					System.out.println("");
					break;
				case 3: //ドラゴンたいじを受けている場合
					System.out.println("「おまえ には ドラゴン たいじ は むずかしかったか…」");
					System.out.println("「むりはしないでいい…」");
					System.out.println("");
					break;
				}
			}
			if (clear == true) { //クエストを受けクリアしている場合
				switch (num) {
				case 1://採取を受けている場合
					System.out.println("「さいしゅ できたようだな」");
					System.out.println("「これが ほうしゅうだ！」");
					h.gold += 100;
					h.eval += 3;
					System.out.println("ほうしゅう：100gold こうかんど：3あがった！");
					System.out.println("HP：" + h.hp + "しょじきん：" + h.gold + "gold こうかんど：" + h.eval);
					System.out.println("");

					this.flag = false; //リセット
					this.clear = false;
					break;
				case 2://ゴブリンたいじをを受けている場合
					System.out.println("「ゴブリン たいじ は できたようだな！」");
					System.out.println("「これが ほうしゅうだ！」");
					h.gold += 200;
					h.eval += 5;
					System.out.println("ほうしゅう：200gold こうかんど：5あがった！");
					System.out.println("HP：" + h.hp + "しょじきん：" + h.gold + "gold こうかんど：" + h.eval);
					System.out.println("");

					this.flag = false;//リセット
					this.clear = false;
					break;
				case 3://ドラゴンたいじを受けている場合
					System.out.println("「ドラゴン たいじ できたのか！ すごいな！」");
					System.out.println("「これが ほうしゅうだ！」");
					h.gold += 500;
					h.eval += 10;
					System.out.println("ほうしゅう：500gold こうかんど：10あがった！");
					System.out.println("HP：" + h.hp + "しょじきん：" + h.gold + "gold こうかんど：" + h.eval);
					System.out.println("");

					this.flag = false; //リセット
					this.clear = false;
					break;
				}
			}
		}
	}
}
