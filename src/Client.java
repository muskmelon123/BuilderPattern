
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
//ע�⣺������ģʽ��Ҫ�������ֽ���ĸ��������Ѿ�ȷ���������ʱ�����ͨ��ָ���������ƽ���˳��
//�ʺϸ���ģ��֮������������Ϊ�����п���Ҫ�����ڽ���˳�����������̱Ƚϼ򵥣����԰�controllerҲ����builder���档
