
public class ActorController {

	//ָ���ߵ�Ŀ���ǿ��ƴ������沿�ֵ�˳����Ϊ����Ĳ��ֺ��п�����������Ҫ��˳���졣
	public Actor construct(Builder builder){
		Actor actor;
		builder.setClothes();
		builder.setHairStyle();
		builder.setSkinColor();
		actor = builder.creatActor();
		return actor;
	}
}
