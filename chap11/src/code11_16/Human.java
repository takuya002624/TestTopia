package code11_16;

public interface Human extends Creature{

	void talk();
	void watch();
	void hear();

	//さらに、親インターフェースからrun();メソッドを継承する
}
