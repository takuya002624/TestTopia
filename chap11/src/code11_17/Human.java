package code11_17;

public interface Human extends Creature{

	void talk();
	void watch();
	void hear();

	//さらに、親インターフェースからrun();メソッドを継承する
}
