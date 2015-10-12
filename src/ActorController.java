
public class ActorController {

	//指挥者的目的是控制创建里面部分的顺序，因为里面的部分很有可能有依赖，要按顺序创造。
	public Actor construct(Builder builder){
		Actor actor;
		builder.setClothes();
		builder.setHairStyle();
		builder.setSkinColor();
		actor = builder.creatActor();
		return actor;
	}
}
