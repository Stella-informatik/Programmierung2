
public class Test {

	public static void main(String[] args) {
		Tresor <String> t1= new Tresor<String>("Hallo",5);
		Tresor<Integer> t2=new Tresor<Integer>(23,4);
		Pair<String,Double> meinpaar=new Pair<>("Erstes",3.4);
		Tresor<Pair<String,Double>> t3=new Tresor<>(new Pair<>("Erstes",3.4),000);
System.out.println(t1.oeffnen(5));
System.out.println(t3.oeffnen(000));
	}

}
