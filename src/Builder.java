
public abstract class Builder {

	//����Ҫ��protected,�����̳���֮��������á�
	protected Actor actor = new Actor();
	
	public abstract void setClothes();
	public abstract void setHairStyle();
	public abstract void setSkinColor();
	
	public Actor creatActor() {
		return actor;
	};
}
