package ex;

public class Bar {
	int grade;				// 評価
	boolean quest_flag;	// 依頼受付中（フラグが立っている間は依頼は受けられない）
	boolean quest_clear;	// 依頼達成フラグ（フラグが立っていると依頼をクリアしている）
	int quest;			// 依頼用変数　1＝採集　2＝ゴブリン討伐　3＝ドラゴン討伐

	public void quest(Hero h) {

		System.out.println("酒場に訪れた。");
		if(!quest_flag) {
			if(this.grade <= 100) {
				System.out.println("森の採集を頼む。");
				this.quest_flag = true;		// 依頼受け付けフラグON
				this.quest = 1;
			}else if(this.grade <= 200){
				System.out.println("洞窟に住むゴブリンの討伐を頼む。");
				this.quest_flag = true;		// 依頼受け付けフラグON
				this.quest = 2;
			}else {
				System.out.println("山の奥地に住むドラゴンの討伐を頼む。");
				this.quest_flag = true;		// 依頼受け付けフラグON
				this.quest = 3;
			}
		}else {
			switch(this.quest) {
			case 1:
				if(this.quest_clear) {
					h.gold += 100;
					h.grade += 10;
					this.grade = 150;
					this.quest_flag = false;		// 依頼受け付けフラグOFF
					this.quest_clear= false;
					System.out.println("採集を済ませたのか。お疲れさん。");
					System.out.println("報酬お金100を貰った。");
				}else {
					System.out.println("森の採集はまだかい？");
				}
				break;
			case 2:
				if(quest_clear) {
					h.gold += 500;
					h.grade += 20;
					this.grade = 250;
					this.quest_flag = false;		// 依頼受け付けフラグOFF
					this.quest_clear= false;
					System.out.println("討伐を済ませたのか。お疲れさん。");
					System.out.println("報酬お金500を貰った。");
				}else {
					System.out.println("洞窟に住むゴブリンの討伐はまだかい？");
				}
				break;
			case 3:
				if(quest_clear) {
					h.gold += 1000;
					h.grade += 50;
					this.grade = 350;
					this.quest_flag = false;		// 依頼受け付けフラグOFF
					this.quest_clear= false;
					System.out.println("ドラゴンを倒してきたのか。大したものだな。お疲れさん。");
					System.out.println("報酬お金1000を貰った。");
				}else {
					System.out.println("山の奥地に住むドラゴンの討伐はまだかい？");
				}
				break;

			}

		}
	}

}
