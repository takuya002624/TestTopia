package ex;

public class Forest {

	public void collecting(Hero h,Bar bar) {
		System.out.println("森に到着した。");
		if(bar.quest_flag && !bar.quest_clear) {
			if(bar.quest==1) {
				h.hp -= 20;
				System.out.println("採集を済ませた！");
				System.out.println("HPが20減った！");
				bar.quest_clear = true;
			}
		}
	}

}
