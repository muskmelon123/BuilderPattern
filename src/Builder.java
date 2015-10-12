
public abstract class Builder {

	//这里要用protected,这样继承了之后才能引用。
	protected Actor actor = new Actor();
	
	public abstract void setClothes();
	public abstract void setHairStyle();
	public abstract void setSkinColor();
	
	public Actor creatActor() {
		return actor;
	};
}
