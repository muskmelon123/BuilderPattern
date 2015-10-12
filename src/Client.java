
public class Client {
	public static void main(String args[]){
		Builder builder= new childBuilider();
		Actor actor;
		ActorController actorcontroller = new ActorController();
		actor = actorcontroller.construct(builder);
		System.out.print("clothes" + actor.getClothes());
		System.out.print("hairStyle" + actor.getHairStyle());
		System.out.print("skinColor" + actor.getSkinColor());
	}
}
//注意：建造者模式主要用在那种建造的各个部分已经确定。建造的时候可以通过指挥者来控制建造顺序，
//适合各个模块之间有依赖，因为这样有可能要依赖于建造顺序。如果建造过程比较简单，可以把controller也放入builder里面。
